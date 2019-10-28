package multiplethread_3;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * synchronized ͬ���������
 * @author New year
 *
 *synchronized��ʾ��ǰ�̣߳���ռ ���� someObject
 *��ǰ�̶߳�ռ �˶���someObject������������߳���ͼռ�ж���someObject���ͻ�ȴ���ֱ����ǰ�߳��ͷŶ�someObject��ռ�á�
 *someObject �ֽ�ͬ���������еĶ��󣬶�������Ϊͬ������
 *Ϊ�˴ﵽͬ����Ч��������ʹ��ͬһ��ͬ������
 *
 *�ͷ�ͬ������ķ�ʽ�� synchronized ����Ȼ�������������쳣�׳�
 */
public class TestThread3_4 {
	
	public static String now() {
		return new SimpleDateFormat("HH:mm:ss   ").format(new Date());		//����ʱ�䣬��ǰʱ��
	}

	public static void main(String[] args) {
		final Object someObject = new Object();			//����Object�࣬����Object���Ͷ���someObject��
		
		Thread t1 = new Thread(){		//�����̶߳���t1��
			public void run(){			//��д��������дrun����
				try {
					System.out.println( now()+" t1 �߳��Ѿ�����");
					System.out.println( now()+  this.getName()+ " ��ͼռ�ж���someObject");		//this.getName()	��ȡ��ǰ�����name��
					
					synchronized (someObject) {
						
						System.out.println(now()+this.getName()+ " ռ�ж���someObject");
						Thread.sleep(500);
						System.out.println(now()+this.getName()+ " �ͷŶ���someObject");
					}
					System.out.println(now()+" t1 �߳̽���");
					
					System.out.println(now()+ "ֻ��t1�߳̽����ͷŶ���󣬲�������һ���߳�ռ����");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.setName("t1");
		t1.start();
		Thread t2 = new Thread(){
			
			public void run(){
				try {
					System.out.println( now()+" t2 �߳��Ѿ�����");
					System.out.println( now()+this.getName()+ " ��ͼռ�ж���someObject");
					synchronized (someObject) {
						System.out.println( now()+this.getName()+ " ռ�ж���someObject");
						Thread.sleep(500);
						System.out.println( now()+this.getName()+ " �ͷŶ���someObject");
					}
					System.out.println(now()+" t2 �߳̽���");
					System.out.println(now()+ "ֻ��t2�߳̽����ͷŶ���󣬲�������һ���߳�ռ����");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t2.setName(" t2");
		t2.start();
		
	}

}
