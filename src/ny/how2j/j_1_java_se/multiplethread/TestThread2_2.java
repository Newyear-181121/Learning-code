package multiplethread;


/**
 * ���뵽��ǰ�߳���
 * @author New year
 *
 *���Ƚ���һ�����̵߳ĸ���
 *���н��̣����ٻ���һ���̼߳����̣߳���main������ʼִ�У��ͻ���һ�������������̴߳��ڡ�
 *��42��ִ��t.join�������������߳��м�����̡߳�
 *���̻߳�ȴ����߳̽�����ϣ� �Ż��������С�
 */
public class TestThread2_2 {

	public static void main(String[] args) {
		
		final Hero gareen = new Hero();
		gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 50;
  
        final Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 30;
          
        final Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 65;
          
        final Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 80;
        
        //�������͵�ʱ��ʹ���������ڲ���
        Thread t1 = new Thread(){
        	public void run() {
        		while(!teemo.isDead()){		//���� һֱ������Ī��ֱ��ɱ����
        			gareen.attackHero(teemo);
        		}
        	}
        };
        
        t1.start();
        /*
         * t1    û�м������߳�ʱ
         * ���������߳� ��       ͬʱ���е�
         * 
         * t1   �������̺߳�ֻ��t1 �����Ż�������½���
         */
        //����ִ�е����һֱ��main�߳�������
        try {
        	//t1�̼߳��뵽main�߳�������ֻ��t1�߳����н������Ż����������
        	t1.join();
        } catch (InterruptedException e	) {
        	e.printStackTrace();
        }
       
        Thread t2 = new Thread() {
        	public void run() {
        		while(!leesin.isDead()) {
        			bh.attackHero(leesin);
        		}
        	}
        };
        //��۲쵽���װ���Īɱ���󣬲�����t2�߳�
        t2.start();
	}

}
