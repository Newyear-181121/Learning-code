package reflection;


/**
 * Ϊ�˷������ԣ���name�޸�Ϊpublic��
 *����private���εĳ�Ա����Ҫʹ��setAccessible(true)���ܷ��ʺ��޸ġ����ڴ�֪ʶ�����ۡ�
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
		System.out.println(this.name + "���ڹ��� " + h2.getName());
	}
}
