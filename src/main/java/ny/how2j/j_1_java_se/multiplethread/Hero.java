package multiplethread;


/**
 * 线程概念
 * @author New year
 *	提供一个资源类。
 */
public class Hero {

	private String name;// 对象名，也可以设置成线程名
	private float hp;	// 血量
	private int damage;	//伤害
	
	/* 构造 */
	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}

	public Hero() {
	}

	/*  get & set */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	/* 普通方法 */
	// 公开方法，对外可用的方法。
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


	/**
	 *	判断 英雄是否死了。
	 * @return
	 */
	public boolean isDead() {
		return 0>=hp?true:false;		//没血了，就是死了。
	}


}
