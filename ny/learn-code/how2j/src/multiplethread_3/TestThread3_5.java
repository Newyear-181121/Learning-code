package multiplethread_3;


/**
 * 使用synchronized 解决同步问题
 * @author New year
 *
 *所有需要修改hp的地方，有要建立在占有someObject的基础上。 
 *而对象 someObject在同一时间，只能被一个线程占有。 间接地，导致同一时间，hp只能被一个线程修改。
 */
public class TestThread3_5 {

	public static void main(String[] args) {
		
		final Object someObject = new Object();
		
		final Hero gareen = new Hero();
		gareen.name = "盖伦";
		gareen.hp = 10000;
		
		int n = 10000;
		
		Thread[] addThreads = new Thread[n];
		Thread[] reduceThreads = new Thread[n];
		
		for(int i = 0;i< n; i++) {
			Thread t = new Thread(){		//这个线程创建在for循环中，所以作用域只在for的大括号中。
				public void run(){
					
					//任何线程要修改hp的值，必须先占用someObject
					synchronized (someObject) {
						gareen.recover();
					}
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			t.start();
			addThreads[i] = t;
		}
		
		for (int i = 0 ;i < n; i++) {
			Thread t = new Thread() {
				public void run() {
					//任何线程要修改hp的值，必须先占用someObject
					synchronized (someObject) {
						gareen.hurt();
					}
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			t.start();
			reduceThreads[i] = t;
		}
		
		for (Thread t : addThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (Thread t : reduceThreads) {
			try {
				t.join();		//是把什么线程加入主线程
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,gareen.hp);
	}

}
