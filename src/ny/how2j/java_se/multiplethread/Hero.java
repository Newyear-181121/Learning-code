package multiplethread;


/**
 * �̸߳���
 * @author New year
 *
 */
public class Hero {

	public String name;
	public float hp;
	
	public int damage;
	
	public void attackHero(Hero h) {
		
		//try ��catch ����Ҫ��Ŀ���Ǿ���Ϊ������ִ��try���е����
		try {
			//Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {		//���catch����return��䣬�򲻻�ִ��finally����䡣
			e.printStackTrace();
		}
		h.hp -=damage;
		System.out.format("%s ���ڹ���%s,%s��Ѫ����� %.0f%n", name,h.name,h.name,h.hp);
		
		if(h.isDead())
			System.out.println(h.name +"���ˣ�");
	}
	
	public boolean isDead() {
		return 0>=hp?true:false;		//ûѪ�ˣ��������ˡ�
	}
}
