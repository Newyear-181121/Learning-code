package multiplethread;


/**
 * 线程概念
 * @author New year
 *
 */
public class Hero {

	public String name;
	public float hp;
	
	public int damage;
	
	public void attackHero(Hero h) {
		
		//try 和catch 中主要的目标是就是为了正常执行try块中的语句
		try {
			//为了表示攻击需要时间，每次攻击暂停1000毫秒
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {		//如果catch中有return语句，则不会执行finally的语句。
			e.printStackTrace();
		}
		h.hp -=damage;
		System.out.format("%s 正在攻击%s,%s的血变成了 %.0f%n", name,h.name,h.name,h.hp);
		
		if(h.isDead())
			System.out.println(h.name +"死了！");
	}
	
	public boolean isDead() {
		return 0>=hp?true:false;		//没血了，就是死了。
	}
}
