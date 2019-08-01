package multiplethread_3;


/**
 * 开发一个自定义线程池
 * @author New year
 *
 */
public class TestThread7_2 {

	public static void main(String[] args) {

		ThreadPool7_2 pool = new ThreadPool7_2();
		
		for (int i = 0; i < 5; i++) {
			Runnable task = new Runnable() {

				@Override
				public void run() {
					System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
				}
				
			};
			
			pool.add(task);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
