package multiplethread_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 回忆 synchronized 同步的方式
 * @author New year
 *
 *
 *首先回忆一下 synchronized 同步对象的方式
 *
 *当一个线程占用 synchronized 同步对象，其他线程就不能占用了，直到释放这个同步对象为止
 */
public class TestThread8_1 {

	public static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	public static void main(String[] args) {

		final Object someObject = new Object();
		
		Thread t1 = new Thread(){
			public void run(){
				try {
					System.out.println(now()+" t1 线程已经运行");
					System.out.println(now()+this.getName()+ " 试图占有对象：someObject");
					synchronized (someObject) {
						System.out.println( now()+this.getName()+ " 占有对象：someObject");
						Thread.sleep(5000);
						System.out.println(now()+this.getName()+ " 释放对象：someObject");
						
					}
					System.out.println(now() + "t1 线程结束");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.setName(" t1");
		t1.start();
		
		Thread t2 = new Thread() {			
			public void run() {
				try {
					System.out.println( now()+" t2 线程已经运行");
					System.out.println( now()+this.getName()+ " 试图占有对象：someObject");
					synchronized (someObject) {
						System.out.println( now()+this.getName()+ " 占有对象：someObject");
						Thread.sleep(5000);
						System.out.println( now()+this.getName()+ " 释放对象：someObject");
					}
					System.out.println(now()+" t2 线程结束");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t2.setName( " t2");
		t2.start();
	}

}
