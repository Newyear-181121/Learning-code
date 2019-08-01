package multiplethread_3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 同步测试
 * @author New year
 *
 *
 *分别使用基本变量的非原子性的++运算符和 原子性的AtomicInteger对象的 incrementAndGet 来进行多线程测试。
 *测试结果,,运行可知
 */
public class TestThread9_3 {

	private static int value = 0;
	private static AtomicInteger atomicValue = new AtomicInteger();
	
	public static void main(String[] args) {

		int number = 10000;		//这个值太大了会出现异常抛出。
		Thread[] ts1 = new Thread[number];
		for(int i = 0;i< number ; i++) {
			Thread t = new Thread(){
				public void run() {
					value++;
				}
				
			};
			
			/*
			switch(){
				case 1.0: System.out.println("运行1/10的进程");break;
				case 2.0: System.out.println("运行2/10的进程");break;
				case 3.0: System.out.println("运行3/10的进程");break;
				case 4: System.out.println("运行4/10的进程");break;
				case 5: System.out.println("运行5/10的进程");break;
				case 6: System.out.println("运行6/10的进程");break;
				case 7: System.out.println("运行7/10的进程");break;
				case 8: System.out.println("运行8/10的进程");break;
				case 9: System.out.println("运行9/10的进程");break;
				case 10: System.out.println("所有的进程都运行了");break;
			}
			*/
			
			
			t.start();
			ts1[i] = t;
		}
		
		//等待这些线程全部结束
		for (Thread t: ts1) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.printf("%d个线程进行value++后，value的值变成:%d%n", number,value);
		Thread[] ts2 = new Thread[number];
		for(int i = 0; i<number;i++) {
			Thread t = new Thread(){
				public void run(){
					atomicValue.incrementAndGet();
				}
			};
			t.start();
			ts2[i] = t;
		}
		
		//等待这些线程全部结束
		for (Thread t: ts2) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%d个线程进行atomicValue.incrementAndGet();后，atomicValue的值变成:%d%n", number,atomicValue.intValue());
	}

}
