package review.character;

public class Hero {
	
	
	public static void main(String[] args) {
		 new Hero();
		 Hero h = new Hero();
		 Hero h1 = h;
		
	//	h.a = 5 ;		//a 不能使用吗？
	}
	
	
	
	
	/**
	 * 试一下 		块
	 * 
	 * 		块有三种
	 * 		
	 * 1.普通块： 在方法里的块
	 * 
	 * 后面这两种块都没有在方法里面
	 * 2.构造块： 直接在类里面，每次创建这个类的时候，就会自动执行一次块
	 * 3.静态块： 用static 修饰的块，，创建这个类的对象的时候只会执行一次（只有第一次的时候会执行），之后再创建对象的时候就不会再创建了
	 * 
	 */
	int i = 0;
	{
		i++;
		String a = "100";
		System.out.println("构造块第" + i  + "次执行,a=" + a);
		
	}
	
	private int id;
	private String name;
	private double hp;
		
	
	
	
	
	
	
	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public double getHp() {
		return hp;
	}







	public void setHp(double hp) {
		this.hp = hp;
	}







	
	
}
