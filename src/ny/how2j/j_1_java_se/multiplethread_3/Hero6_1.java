package multiplethread_3;


/**
 * 			���õĽ����ʽ
 * @author New year
 *
 */
public  class Hero6_1 {

	public String name;
	public float hp;
	
	public int damage;
	
	public synchronized void recover() {
		hp = hp+1;
		
	}
	
	public synchronized void hurt() {
		hp = hp-1;
	}
	
	public synchronized void attackHero(Hero6_1 h) {
		h.hp-=damage;
		System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
		if(h.isDead())
			System.out.println(h.name + "����!");
	}
	
	public boolean isDead() {
		return 0>hp?true : false ;
	}
	
	public boolean isHealth(){
		return 600==hp?true: false;
	}
	
}
