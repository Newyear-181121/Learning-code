package multiplethread_3;


/**
 * 在方法前，加上修饰符synchronized
 * @author New year
 *
 *在recover前，直接加上synchronized ，其所对应的同步对象，就是this
 *和hurt方法达到的效果是一样
 *外部线程访问gareen的方法，就不需要额外使用synchronized 了
 */
public class TestThread3_7_方法上使用synchronized {

	public static void main(String[] args) {

		final Hero3_7 gareen = new Hero3_7();
		gareen.name = "盖伦";
		gareen.hp = 10000;
		
		int n = 10000;
		
		Thread[] addThreads = new Thread[n];
		Thread[] reduceThreads = new Thread[n];

		/* 声明多个线程 */
		for (int i = 0; i < n ; i++) {
			Thread t = new Thread( ){
				public void run() {
					
					//recover自带synchronized
					gareen.recover();
					Utils.sysSleep(100);
				}
			};
			t.start();
			addThreads[i] = t;
		}
		for (int i = 0; i < n ; i++) {
			Thread  t = new Thread(){
				public void run() {
					 //hurt自带synchronized
					gareen.hurt();
					Utils.sysSleep(100);
				}
			};
			t.start();
			reduceThreads[i] = t ;		//给数组中每一个线程都添加开始方法。
		}
		
		/**
		 * 遍历每一个线程，将所有线程都加如到主线程中去。
		 */
		for (Thread t : addThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (Thread t: reduceThreads) {
			try {
				t.join();		//怪不得这里会报错，原来忘记添加reduceThreads的线程了。
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,gareen.hp);
	}

}

/*
线程安全的类
如果一个类，其方法都是有synchronized修饰的，那么该类就叫做线程安全的类

同一时间，只有一个线程能够进入 这种类的一个实例 的去修改数据，进而保证了这个实例中的数据的安全(不会同时被多线程修改而变成脏数据)

比如StringBuffer和StringBuilder的区别
StringBuffer的方法都是有synchronized修饰的，StringBuffer就叫做线程安全的类
而StringBuilder就不是线程安全的类
*/

/**
把非线程安全的集合转换为线程安全
ArrayList是非线程安全的，换句话说，多个线程可以同时进入一个ArrayList对象的add方法

借助Collections.synchronizedList，可以把ArrayList转换为线程安全的List。

与此类似的，还有HashSet,LinkedList,HashMap等等非线程安全的类，都通过工具类Collections转换为线程安全的


package multiplethread;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class TestThread {
    
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Collections.synchronizedList(list1);
    }
        
}
*/
