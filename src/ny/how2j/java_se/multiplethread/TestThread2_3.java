package multiplethread;


/**
 * �߳����ȼ�
 * @author New year
 *
 *���̴߳��ھ�����ϵ��ʱ�����ȼ��ߵ��̻߳��и���ļ��ʻ��CPU��Դ 
 *Ϊ����ʾ��Ч����Ҫ����ͣʱ��ȥ���������̸߳��Իᾡ��ȥռ��CPU��Դ 
 *ͬʱ��Ӣ�۵�Ѫ������100�����������͵�1�������㹻��ʱ��۲쵽���ȼ�����ʾ 
 *��ͼ�ɼ����߳�1�����ȼ���MAX_PRIORITY����������ȡ���˸����CPU��Դִ�д���
 *
 *��Hero2_3  �н���ͣʱ��ȥ���ˡ�
 */
public class TestThread2_3 {

	public static void main(String[] args) {
		
		final Hero2_3 gareen = new Hero2_3();
        gareen.name = "����";
        gareen.hp = 6160;
        gareen.damage = 1;
  
        final Hero2_3 teemo = new Hero2_3();
        teemo.name = "��--Ī";
        teemo.hp = 300;
        teemo.damage = 1;
          
        final Hero2_3 bh = new Hero2_3();
        bh.name = "�ͽ�����";
        bh.hp = 5000;
        bh.damage = 1;
          
        final Hero2_3 leesin = new Hero2_3();
        leesin.name = "ä&ɮ";
        leesin.hp = 455;
        leesin.damage = 1;
        
        Thread t1 = new Thread(){
        	public void run(){
        		
        		while (!teemo.isDead2_3()){
        			bh.attackHero(teemo);
        		}
        	}
        };
        
        Thread t2 = new Thread(){
        	public void run(){
        		while(!leesin.isDead2_3()){
        			bh.attackHero(leesin);
        		}
        	}
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
	}

}

/**
 * ���������
 * ��ʱ����ִ��һ���̣߳���ʱ������һ����
 * 
 */
