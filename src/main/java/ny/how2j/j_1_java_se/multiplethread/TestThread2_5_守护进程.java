package multiplethread;


/**
 * 守护线程
 * @author New year
 *
 *
 *守护线程的概念是： 当一个进程里，所有的线程都是守护线程的时候，结束当前进程。
 *
 *就好像一个公司有销售部，生产部这些和业务挂钩的部门。
 *除此之外，还有后勤，行政等这些支持部门。
 *
 *如果一家公司销售部，生产部都解散了，那么只剩下后勤和行政，那么这家公司也可以解散了。
 *
 *守护线程就相当于那些支持部门，如果一个进程只剩下守护线程，那么进程就会自动结束。
 *
 *守护线程通常会被用来做日志，性能统计等工作。
 */
public class TestThread2_5_守护进程 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				int seconds = 0;
				
				while(true){
					Utils.sysSleep();
					System.out.printf("已经玩了LOL %d 秒%n", seconds++);
				}
			}
		};
		t1.setDaemon(true);	//这就是守护进程吗？//有这句的时候进程不能运行。
		t1.start();

		Thread t2 = new Thread(){
			public void run(){
				int seconds = 0;

				while(true){
					Utils.sysSleep();
					System.out.printf("已经玩了LOL %d 秒%n", seconds++);
				}
			}
		};
		t2.start();
	}

}
