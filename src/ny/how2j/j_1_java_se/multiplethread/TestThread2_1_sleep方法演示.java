package multiplethread;


/**
 * 当前线程暂停
 * @author New year
 *
 *Thread.sleep(1000); 表示当前线程暂停1000毫秒 ，其他线程不受影响 
 * 	Thread.sleep(1000); 会抛出InterruptedException 中断异常，因为当前线程sleep的时候，有可能被停止，这时就会抛出 InterruptedException
 */
public class TestThread2_1_sleep方法演示 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){		//这里是一个匿名类
			public void run(){		//这里是重写了run方法
				int seconds = 0;
				while(true){
					Utils.sysSleep();
					System.out.printf("已经玩了LOL %d 秒 %n",seconds++);	//这里也是再循环里面的
					if(seconds>10)
						return  ;		//返回空，可以结束循环，但是不知道这样是不是合适
				}
			}
		};
		t1.start();
	}

}
