package multiplethread_3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ͬ������
 * @author New year
 *
 *
 *�ֱ�ʹ�û��������ķ�ԭ���Ե�++������� ԭ���Ե�AtomicInteger����� incrementAndGet �����ж��̲߳��ԡ�
 *���Խ��,,���п�֪
 */
public class TestThread9_3 {

	private static int value = 0;
	private static AtomicInteger atomicValue = new AtomicInteger();
	
	public static void main(String[] args) {

		int number = 10000;		//���ֵ̫���˻�����쳣�׳���
		Thread[] ts1 = new Thread[number];
		for(int i = 0;i< number ; i++) {
			Thread t = new Thread(){
				public void run() {
					value++;
				}
				
			};
			
			/*
			switch(){
				case 1.0: System.out.println("����1/10�Ľ���");break;
				case 2.0: System.out.println("����2/10�Ľ���");break;
				case 3.0: System.out.println("����3/10�Ľ���");break;
				case 4: System.out.println("����4/10�Ľ���");break;
				case 5: System.out.println("����5/10�Ľ���");break;
				case 6: System.out.println("����6/10�Ľ���");break;
				case 7: System.out.println("����7/10�Ľ���");break;
				case 8: System.out.println("����8/10�Ľ���");break;
				case 9: System.out.println("����9/10�Ľ���");break;
				case 10: System.out.println("���еĽ��̶�������");break;
			}
			*/
			
			
			t.start();
			ts1[i] = t;
		}
		
		//�ȴ���Щ�߳�ȫ������
		for (Thread t: ts1) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.printf("%d���߳̽���value++��value��ֵ���:%d%n", number,value);
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
		
		//�ȴ���Щ�߳�ȫ������
		for (Thread t: ts2) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%d���߳̽���atomicValue.incrementAndGet();��atomicValue��ֵ���:%d%n", number,atomicValue.intValue());
	}

}
