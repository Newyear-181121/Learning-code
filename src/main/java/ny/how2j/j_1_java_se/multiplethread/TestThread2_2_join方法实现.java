package multiplethread;


/**
 * 加入到当前线程中
 * @author New year
 *
 *首先解释一下主线程的概念
 *所有进程，至少会有一个线程即主线程，即main方法开始执行，就会有一个看不见的主线程存在。
 *在42行执行t.join，即表明在主线程中加入该线程。
 *主线程会等待该线程结束完毕， 才会往下运行。
 */
public class TestThread2_2_join方法实现 extends FatherForHero {

	public static void main(String[] args) {

        
        //创建类型的时候都使用了匿名内部类
        Thread t1 = new Thread(){
        	public void run() {
        		while(!teemo.isDead()){		//盖伦 一直攻击提莫，直至杀死他
        			gareen.attackHero(teemo);
        		}
        	}
        };
        
        t1.start();
        /*
         * t1    没有加入主线程时
         * 两个攻击线程 是       同时运行的
         * 
         * t1   加入主线程后，只有t1 结束才会继续往下进行
         */
        //代码执行到这里，一直是main线程在运行
        try {
        	//t1线程加入到main线程中来，只有t1线程运行结束，才会继续往下走
        	t1.join();
        } catch (InterruptedException e	) {
        	e.printStackTrace();
        }
       
        Thread t2 = new Thread() {
        	public void run() {
        		while(!leesin.isDead()) {
        			bh.attackHero(leesin);
        		}
        	}
        };
        //会观察到盖伦把提莫杀掉后，才运行t2线程
        t2.start();
	}

}
