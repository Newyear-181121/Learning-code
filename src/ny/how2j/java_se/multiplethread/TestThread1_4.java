package multiplethread;


/**
 * �������߳�-������
 * @author New year
 *		
 *ʹ�������࣬�̳�Thread,��дrun������ֱ����run������дҵ�����
 *�������һ���ô��ǿ��Ժܷ���ķ����ⲿ�ľֲ�������
 *ǰ�����ⲿ�ľֲ�������Ҫ������Ϊfinal��(JDK7�Ժ�Ͳ���Ҫ��)
 */
public class TestThread1_4 {

	public static void main(String[] args) {
		
		Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 300;
		gareen.damage = 30;
		
		Hero teemo = new  Hero();
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
		
		
		//������
		Thread t1 = new Thread() {
			public void run() {
				//���������õ��ⲿ�ľֲ�����teemo�������teemo����Ϊfinal
                //������JDK7�Ժ󣬾Ͳ��Ǳ����final����
				while(!teemo.isDead()){
					gareen.attackHero(teemo);
				}
			}
		};
		
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				while (!leesin.isDead()) {
					bh.attackHero(leesin);
				}
			}
		};
		t2.start();

	}

}
