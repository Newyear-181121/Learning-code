package multiplethread_3;


/**
 * ʹ��synchronized ���ͬ������
 * @author New year
 *
 *������Ҫ�޸�hp�ĵط�����Ҫ������ռ��someObject�Ļ����ϡ� 
 *������ someObject��ͬһʱ�䣬ֻ�ܱ�һ���߳�ռ�С� ��ӵأ�����ͬһʱ�䣬hpֻ�ܱ�һ���߳��޸ġ�
 */
public class TestThread3_5 {

	public static void main(String[] args) {
		
		final Object someObject = new Object();
		
		final Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 10000;
		
		int n = 10000;
		
		Thread[] addThreads = new Thread[n];
		Thread[] reduceThreads = new Thread[n];
		
		for(int i = 0;i< n; i++) {
			Thread t = new Thread(){		//����̴߳�����forѭ���У�����������ֻ��for�Ĵ������С�
				public void run(){
					
					//�κ��߳�Ҫ�޸�hp��ֵ��������ռ��someObject
					synchronized (someObject) {
						gareen.recover();
					}
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			t.start();
			addThreads[i] = t;
		}
		
		for (int i = 0 ;i < n; i++) {
			Thread t = new Thread() {
				public void run() {
					//�κ��߳�Ҫ�޸�hp��ֵ��������ռ��someObject
					synchronized (someObject) {
						gareen.hurt();
					}
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			t.start();
			reduceThreads[i] = t;
		}
		
		for (Thread t : addThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (Thread t : reduceThreads) {
			try {
				t.join();		//�ǰ�ʲô�̼߳������߳�
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("%d�������̺߳�%d�������߳̽�����%n���׵�Ѫ���� %.0f%n", n,n,gareen.hp);
	}

}
