package collection;


/**
 * 	使用数组的局限性
 * 		跟前面Tsetcollection1_1 	作比较的
 * @author New year
 *
 */
public class Hero1_1 {
	
	public String name;
	public float hp;
	
	public int damage;
	
	public Hero1_1() {
		
	}
	
	
	//增加一个初始化name的构造方法
	public Hero1_1(String name) {
		this.name = name;
	}

	// 重写toString方法
	@Override
    public String toString() {
        return name;
    }

}
