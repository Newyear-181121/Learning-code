package multiplethread;


/**
 * �ػ��߳�
 * @author New year
 *
 *
 *�ػ��̵߳ĸ����ǣ� ��һ����������е��̶߳����ػ��̵߳�ʱ�򣬽�����ǰ���̡�
 *
 *�ͺ���һ����˾�����۲�����������Щ��ҵ��ҹ��Ĳ��š�
 *����֮�⣬���к��ڣ���������Щ֧�ֲ��š�
 *
 *���һ�ҹ�˾���۲�������������ɢ�ˣ���ôֻʣ�º��ں���������ô��ҹ�˾Ҳ���Խ�ɢ�ˡ�
 *
 *�ػ��߳̾��൱����Щ֧�ֲ��ţ����һ������ֻʣ���ػ��̣߳���ô���̾ͻ��Զ�������
 *
 *�ػ��߳�ͨ���ᱻ��������־������ͳ�Ƶȹ�����
 */
public class TestThread2_5 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				int seconds = 0;
				
				while(true){
					try {
						Thread.sleep(1000);		//�߳���ͣ1000����
					} catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.printf("�Ѿ�����LOL %d ��%n", seconds++);
				}
			}
		};
		t1.setDaemon(true);	//������ػ�������//������ʱ����̲������С�
		t1.start();
	}

}
