package multiplethread_3;

import ny.base.常用类.myUtil.Out;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * synchronized 同步对象概念
 * @author New year
 *
 *synchronized表示当前线程，独占 对象 someObject
 *当前线程独占 了对象someObject，如果有其他线程试图占有对象someObject，就会等待，直到当前线程释放对someObject的占用。
 *someObject 又叫同步对象，所有的对象，都可以作为同步对象
 *为了达到同步的效果，必须使用同一个同步对象
 *
 *释放同步对象的方式： synchronized 块自然结束，或者有异常抛出
 */
public class TestThread3_4_synchronized同步块 {
	
	static boolean falg = true;		// 这个变量为什么不能是局部变量。

	public static void main(String[] args) {
		final Object someObject = new Object();			//声明Object类，创建Object类型对象someObject。


		
		Thread t1 = new Thread("t1"){		//创建线程对象t1，
			public void run() {            //重写方法，重写run方法
				Out.out("线程 启动后开始执行run方法 此时线程在："+ this.getState()+ " 状态");
				while (falg) {
					try {
						System.out.println(Utils.now() + " t1 线程已经运行");
						System.out.println(Utils.now() + this.getName() + " 试图占有对象：someObject");        //this.getName()	获取当前对象的name。

						// 同步块
						synchronized (someObject) {
							System.out.println(Utils.now() + this.getName() + " 占有对象：someObject  ,线程在："+ this.getState()+ " 状态");
							Thread.sleep(500);
							System.out.println(Utils.now() + this.getName() + " 释放对象：someObject");
							System.out.println(Utils.now() + "只有t1线程结束释放对象后，才能有下一个线程占用他");
						}

						System.out.println(Utils.now() + " t1 线程还未结束，同步锁以释放,线程在："+ this.getState()+ " 状态");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Out.out("线程刚创建此时线程在："+ t1.getState()+ " 状态");

		Thread t2 = new Thread("t2"){
			public void run() {
				Out.out("线程 启动后开始执行run方法 此时线程在："+ this.getState()+ " 状态");
				while (falg) {
					try {
						System.out.println(Utils.now() + " t2 线程已经运行");
						System.out.println(Utils.now() + this.getName() + " 试图占有对象：someObject");

						// 同步块
						synchronized (someObject) {
							System.out.println(Utils.now() + this.getName() + " 占有对象：someObject  ,线程在："+ this.getState()+ " 状态");
							Thread.sleep(500);
							System.out.println(Utils.now() + this.getName() + " 释放对象：someObject");
							System.out.println(Utils.now() + "只有t2线程结束释放对象后，才能有下一个线程占用他");
						}

						System.out.println(Utils.now() + " t2 线程还未结束，同步锁以释放,线程在："+ this.getState()+ " 状态");

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Out.out("线程刚创建此时线程在："+ t2.getState()+ " 状态");

		t1.start();Out.out("线程 启动后-还没开始执行run方法- 此时线程在："+ t1.getState()+ " 状态");
		t2.start();Out.out("线程 启动后-还没开始执行run方法- 此时线程在："+ t2.getState()+ " 状态");

		int count = 10;
		for(int i = 0 ;i <= count ;i++){
			Utils.sysSleep();
			if (i == count){
				falg = false;
			}
		}


		Out.out("最后输出结论，只有同步块结束后，其他线程才能开始执行。");
		
	}

}
