package multiplethread_3;

public class Hero6_2 {

	public String name;
	public float hp;
	public int damage;
	
	public synchronized void recover() {
		hp = hp+5;
		System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
		// ֪ͨ��Щ�ȴ���this�����ϵ��̣߳������ѹ����ˣ����20�У��ȴ��ŵļ�Ѫ�̣߳����ѹ���
		this.notify();		//֪ͨ��������ϵ��߳�����
	}
	
	public synchronized void hurt() {
		if (hp==1) {
			try {
				// ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
				this.wait();		//������߳��ϵ��̵߳ȴ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		hp = hp - 5;
		System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
	}
	
	public void attackHero(Hero6_2 h) {
		h.hp -= damage ;
		System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n", name, h.name, h.name, h.hp);
		if (h.isDead())
			System.out.println(h.name + "���ˣ�");
	}
	
	public boolean isDead() {
		return 0 >= hp?true : false;
	}
}
