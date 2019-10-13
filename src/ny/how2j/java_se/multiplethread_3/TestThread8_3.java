package multiplethread_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * trylock����
 * @author New year
 *
 *synchronized �ǲ�ռ�õ��ֲ����ݵģ���һֱ��ͼռ����ȥ��
 *�� synchronized ����ţ�Ǽⲻһ����Lock�ӿڻ��ṩ��һ��trylock������
 *trylock����ָ��ʱ�䷶Χ����ͼռ�ã�ռ�ɹ��ˣ���žžž�� ���ʱ�䵽�ˣ���ռ�ò��ɹ���Ťͷ����~
 *
 *ע�⣺ ��Ϊʹ��trylock�п��ܳɹ����п���ʧ�ܣ����Ժ���unlock�ͷ�����ʱ����Ҫ�ж��Ƿ�ռ�óɹ��ˣ����ûռ�óɹ�Ҳunlock,�ͻ��׳��쳣
 */
public class TestThread8_3 {

	public static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	public static void log(String msg) {
		System.out.printf("%s %s %s %n",now(),Thread.currentThread().getName(),msg);
	}
	
	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		
		Thread t1 = new Thread() {
			public void run() {
				boolean locked = false;
				try {
					log("�߳�����");
					log("��ͼռ�ж���lock");
					
					locked = lock.tryLock(1,TimeUnit.SECONDS);
					if(locked) {
						log("ռ�ж���lock");
						log("����5���ҵ�����");
						Thread.sleep(5000);
					}
					else{
						log("����1���ӵ�Ŭ������û��ռ�ж��󣬷���ռ��");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					
					if(locked){		//�ж��Ƿ��Ƿ�ռ���˶���
						log("�ͷŶ���lock");
						lock.unlock();
					}
				}
				log("�߳̽���");
			}
		};
		t1.setName("t1");
		t1.start();
		try {
			//����t1��2��
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		Thread t2 = new Thread() {
			
			public void run() {
				boolean locked = false;
				try {
					log("�߳�����");
					log("��ͼռ�ж���lock");
					
					locked = lock.tryLock(1,TimeUnit.SECONDS);
					if(locked) {
						log("ռ�ж���lock");
						log("����5���ҵ�����");
						Thread.sleep(5000);
					}
					else {
						log("����1���ӵ�Ŭ������û��ռ�ж��󣬷���ռ��");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					if(locked){		//�ж��Ƿ��Ƿ�ռ���˶���
						log("�ͷŶ���lock");
						lock.unlock();		//���ռ���ˣ��͹رա�
					}
				}
				log("�߳̽���");
			}
		};
		t2.setName("t2");
		t2.start();
	}

}
