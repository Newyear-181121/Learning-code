package multiplethread_3;


/**
 * ʹ��wait��notify�����߳̽���
 * @author New year
 *
 *
 *��Hero���У�hurt()��Ѫ��������hp=1��ʱ��ִ��this.wait().
 *this.wait()��ʾ ��ռ��this���̵߳ȴ�������ʱ�ͷ�ռ��
 *����hurt�������̱߳�Ȼ�Ǽ�Ѫ�̣߳�this.wait()���ü�Ѫ�߳���ʱ�ͷŶ�this��ռ�С� ������Ѫ�̣߳����л������recover()��Ѫ�����ˡ�
 *
 *
 *recover() ��Ѫ������������Ѫ����ִ��this.notify();
 *this.notify() ��ʾ֪ͨ��Щ�ȴ���this���̣߳��������ѹ����ˡ� �ȴ���this���̣߳�ǡǡ���Ǽ�Ѫ�̡߳� һ��recover()������ ��Ѫ�߳��ͷ���this����Ѫ�̣߳��Ϳ�������ռ��this����ִ�к���ļ�Ѫ������
 */
public class TestThread6_2 {

	
	/**
	 * �ȴ��ͱ����ѣ�����Hero6-2�еķ�����д���ˡ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Hero6_2 gareen = new Hero6_2();
		gareen.name = "����";
		gareen.hp = 616;
		
		Thread t1 = new Thread() {
			public void run(){
				while(true){
					//����ѭ���ж�
//                  while(gareen.hp==1){
//                      continue;
//                  }
					
					gareen.hurt();
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				while (true) {
					gareen.recover();
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e ) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}

}
/**
 * ����wait��notify��notifyAll �� �� �� ��
����wait()��notify() ������������ʲô�����ϵģ�

 
public synchronized void hurt() {
  ������
  this.wait();
  ������
}
 

 
public synchronized void recover() {
   ������
   this.notify();
}
 


������Ҫǿ�����ǣ�wait������notify������������Thread�߳��ϵķ�����������Object�ϵķ����� 

��Ϊ���е�Object�����Ա�������Ϊͬ����������׼ȷ�Ľ���wait��notify��ͬ�������ϵķ�����

wait()����˼�ǣ� ��ռ�������ͬ��������̣߳���ʱ�ͷŵ�ǰ��ռ�ã����ҵȴ��� ���Ե���wait����ǰ�������ģ�һ������synchronized�������ͻ����

notify() ����˼�ǣ�֪ͨһ���ȴ������ͬ�������ϵ��̣߳���������ѹ����ˣ��л�������ռ�õ�ǰ�����ˡ�

notifyAll() ����˼�ǣ�֪ͨ���еĵȴ������ͬ�������ϵ��̣߳����ǿ������ѹ����ˣ��л�������ռ�õ�ǰ�����ˡ�
*/
