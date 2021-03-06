package multiplethread_3;


/**
 * 3-6  需要的类
 * @author New year
 *
 */
public class Hero3_6 {
	public String name;
	public float hp;
	
	public int damage;
	
	//回血
	public void recover(){
		hp +=1;
		
	}
	
	//掉血
	public  void hurt(){
		//使用this作为同步对象
		synchronized (this) {
			hp -= 1;
		}
	}
	
	public void attackHero(Hero3_6 h) {
		h.hp-=damage;
		System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
		if(h.isDead())
			System.out.println(h.name +"死了！");
	}
	
	public boolean isDead() {
		return 0>hp?true:false;
	}

}
