package multiplethread_3;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ʹ��java�Դ��̳߳�
 * @author New year
 *
 *java�ṩ�Դ����̳߳أ�������Ҫ�Լ�ȥ����һ���Զ����̳߳��ˡ�
 *
 *�̳߳���ThreadPoolExecutor�ڰ�java.util.concurrent��
 *
 * 
 *ThreadPoolExecutor threadPool= new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
 * 
 *
 *
 *��һ������10 ��ʾ����̳߳س�ʼ����10���߳������湤��
 *�ڶ�������15 ��ʾ���10���̲߳������ˣ��ͻ��Զ����ӵ����15���߳�
 *����������60 ��ϵ��ĸ�����TimeUnit.SECONDS����ʾ����60�룬��������̻߳�û�нӵ�������ͻ���գ���󱣳ֳ������10��
 *���ĸ�����TimeUnit.SECONDS ����
 *��������� new LinkedBlockingQueue() ����������ļ���
 *
 *execute������������µ�����
 */
public class TestThread7_4 {

	public static void main(String[] args)  throws InterruptedException{
		
		ThreadPoolExecutor threadPool= new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		
		//
		int i = 0;		//����һ�ٸ��̣߳���������
		while(true){
		threadPool.execute(new Runnable(){
			public void run(){
				System.out.println("����1");
			}
		});
		System.out.println("����" + i);
		i++;
		if(i == 100)		//�����ж�
			break;
		}
	}

}
