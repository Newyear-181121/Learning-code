package multiplethread;


/**
 * ��ǰ�߳���ͣ
 * @author New year
 *
 *Thread.sleep(1000); ��ʾ��ǰ�߳���ͣ1000���� �������̲߳���Ӱ�� 
Thread.sleep(1000); ���׳�InterruptedException �ж��쳣����Ϊ��ǰ�߳�sleep��ʱ���п��ܱ�ֹͣ����ʱ�ͻ��׳� InterruptedException
 */
public class TestThread2_1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){		//������һ��������
			public void run(){		//��������д��run����
				int seconds = 0;
				while(true){
					try {
						Thread.sleep(1000);		//��������ͣ1000�������˼
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf("�Ѿ�����LOL %d �� %n",seconds++);	//����Ҳ����ѭ�������
					if(seconds>10)
						return  ;		//���ؿգ����Խ���ѭ�������ǲ�֪�������ǲ��Ǻ���
				}
			}
		};
		t1.start();
	}

}
