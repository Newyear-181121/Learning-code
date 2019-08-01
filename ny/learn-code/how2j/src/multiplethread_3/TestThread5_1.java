package multiplethread_3;


/**
 * ��ʾ����
 * @author New year
 *
 *1. �߳�1 ����ռ�ж���1��������ͼռ�ж���2
 *2. �߳�2 ����ռ�ж���2��������ͼռ�ж���1
 *3. �߳�1 �ȴ��߳�2�ͷŶ���2
 *4. ���ͬʱ���߳�2�ȴ��߳�1�ͷŶ���1
 *�ͻᡣ����һֱ�ȴ���ȥ��ֱ����ĵ��ϣ�����ʯ�ã�ɽ���� ����غϡ�����
 *
 */
public class TestThread5_1 {

	public static void main(String[] args) {

		final Hero3_7 ahri = new Hero3_7();
		ahri.name = "��β����";
		final Hero3_7 annie = new Hero3_7();
		annie.name = "����" ;
		
		Thread t1 = new Thread() {
			public void run() {
				//ռ�о�β����
				synchronized (ahri) {
					System.out.println("t1 ��ռ�о�β����");
					try {
						//ͣ��1000���룬��һ���߳����㹻��ʱ��ռ�а���
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("t1 ��ͼռ�а���");
					System.out.println("t1 �ȴ��� ��������");
					
					synchronized (annie) {	
						System.out.println("do something");
					}
					
				}
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				//ռ�а���
				synchronized (annie) {
					System.out.println("t2 ��ռ�а���");
					try {
						//ͣ��1000�룬��һ���߳����㹻��ʱ��ռ�����þ�β����
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("t2 ��ͼռ�о�β����");
					System.out.println("t2 �ȴ��� ��������");
					synchronized (ahri) {
						System.out.println("do something");
					}
				}
			}
		};
		t2.start();
	}

}
