package multiplethread_3;


/**
 * �ڷ���ǰ���������η�synchronized
 * @author New year
 *
 *��recoverǰ��ֱ�Ӽ���synchronized ��������Ӧ��ͬ�����󣬾���this
 *��hurt�����ﵽ��Ч����һ��
 *�ⲿ�̷߳���gareen�ķ������Ͳ���Ҫ����ʹ��synchronized ��
 */
public class TestThread3_7 {

	public static void main(String[] args) {

		final Hero3_7 gareen = new Hero3_7();
		gareen.name = "����";
		gareen.hp = 10000;
		
		int n = 10000;
		
		Thread[] addThreads = new Thread[n];
		Thread[] reduceThreads = new Thread[n];
		
		for (int i = 0; i < n ; i++) {
			Thread t = new Thread( ){
				public void run() {
					
					//recover�Դ�synchronized
					gareen.recover();
					
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
		for (int i = 0; i < n ; i++) {
			Thread  t = new Thread(){
				public void run() {
					
					 //hurt�Դ�synchronized
					gareen.hurt();
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.start();
			reduceThreads[i] = t ;		//��������ÿһ���̶߳���ӿ�ʼ������
		}
		
		/**
		 * ����ÿһ���̣߳��������̶߳����絽���߳���ȥ��
		 */
		for (Thread t : addThreads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (Thread t: reduceThreads) {
			try {
				t.join();		//�ֲ�������ᱨ��ԭ���������reduceThreads���߳��ˡ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.printf("%d�������̺߳�%d�������߳̽�����%n���׵�Ѫ���� %.0f%n", n,n,gareen.hp);
	}

}

/*
�̰߳�ȫ���� �� ��
���һ���࣬�䷽��������synchronized���εģ���ô����ͽ����̰߳�ȫ����

ͬһʱ�䣬ֻ��һ���߳��ܹ����� �������һ��ʵ�� ��ȥ�޸����ݣ�������֤�����ʵ���е����ݵİ�ȫ(����ͬʱ�����߳��޸Ķ����������)

����StringBuffer��StringBuilder������
StringBuffer�ķ���������synchronized���εģ�StringBuffer�ͽ����̰߳�ȫ����
��StringBuilder�Ͳ����̰߳�ȫ����
*/

/**
�ѷ��̰߳�ȫ�ļ���ת��Ϊ�̰߳�ȫ �� ��
ArrayList�Ƿ��̰߳�ȫ�ģ����仰˵������߳̿���ͬʱ����һ��ArrayList�����add����

����Collections.synchronizedList�����԰�ArrayListת��Ϊ�̰߳�ȫ��List��

������Ƶģ�����HashSet,LinkedList,HashMap�ȵȷ��̰߳�ȫ���࣬��ͨ��������Collectionsת��Ϊ�̰߳�ȫ��


package multiplethread;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class TestThread {
    
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Collections.synchronizedList(list1);
    }
        
}
*/
