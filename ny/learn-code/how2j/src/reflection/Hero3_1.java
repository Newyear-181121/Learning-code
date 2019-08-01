package reflection;


/**
 * 为了访问属性，把name修改为public。
 *对于private修饰的成员，需要使用setAccessible(true)才能访问和修改。不在此知识点讨论。
 * @author New year
 *
 */
public class Hero3_1 {
	public String name;
	public float hp;
	public int damage;
	public int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hero3_1(){
		
	}
	public Hero3_1(String string){
		name = string;
	}
	
	@Override
	public String toString() {
		return "Hero[name=" + name + "]";
	}
	public boolean isSead() {
		return false;
	}
	public void attackHero(Hero3_1 h2) {
		System.out.println(this.name + "正在攻击 " + h2.getName());
	}
}
