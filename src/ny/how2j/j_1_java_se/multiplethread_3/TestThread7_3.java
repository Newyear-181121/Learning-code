package multiplethread_3;


/**
 * �����̳߳�
 * @author New year
 *
 *����һ���龰��ÿ������ִ�е�ʱ�䶼��1��
 *�տ�ʼ�Ǽ��1�������̳߳����������
 *
 *Ȼ����ʱ��Խ��Խ�̣�ִ��������̻߳�û�����ü��������µ����������ˡ�
 *�ͻ�۲쵽�̳߳���������̱߳�������ִ����Щ����
 */
public class TestThread7_3 {

	public static void main(String[] args) {

		ThreadPool7_2 pool = new ThreadPool7_2();
		int sleep = 1000;
		while(true){
			pool.add(new Runnable(){
				public void run() {
					try {
						//System.out.println("ִ������");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			try {
				Thread.sleep(sleep);
				sleep = sleep>100?sleep-100:sleep;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
