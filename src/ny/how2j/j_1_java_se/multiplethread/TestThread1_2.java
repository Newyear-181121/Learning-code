package multiplethread;

/**
 * �������߳�-�̳��߳���
 * @author New year
 *
 *ʹ�ö��̣߳��Ϳ������������ڹ�����Ī��ͬʱ���ͽ�����Ҳ�ڹ���äɮ 
 *���һ����KillThread �̳�Thread��������дrun���� 
 *�����̰߳취�� ʵ����һ��KillThread���󣬲��ҵ�����start���� 
 *�Ϳ��Թ۲쵽 �ͽ����˹���äɮ��ͬʱ������Ҳ�ڹ�����Ī
 */
public class TestThread1_2 {

	public static void main(String[] args) {
//	/*	
		//�ȴ�����������
		Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 50;
 
        Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 30;
         
        Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 65;
         
        Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 80;
//    */    
        
        
        //ʹ��֮ǰ������KillThread�����
        //���KillThread ����ʹ�ü̳��߳���ķ����ġ�
        KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        //�߳���ҲҪ�ȴ���������ʹ�á�
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();
        
        
	}

}
