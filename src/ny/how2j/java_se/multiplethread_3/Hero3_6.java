package multiplethread_3;


/**
 * 3-6  ��Ҫ����
 * @author New year
 *
 */
public class Hero3_6 {
	public String name;
	public float hp;
	
	public int damage;
	
	//��Ѫ
	public void recover(){
		hp +=1;
		
	}
	
	//��Ѫ
	public  void hurt(){
		//ʹ��this��Ϊͬ������
		synchronized (this) {
			hp -= 1;
		}
	}
	
	public void attackHero(Hero3_6 h) {
		h.hp-=damage;
		System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
		if(h.isDead())
			System.out.println(h.name +"���ˣ�");
	}
	
	public boolean isDead() {
		return 0>hp?true:false;
	}

}
