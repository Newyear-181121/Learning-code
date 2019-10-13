package collection;

public class Item4_1 {
	
	String name;
	int price;
	
	public Item4_1(){
		
	}

	//提供一个初始化name的构造方法
	public Item4_1(String name){
		this.name = name;
	}
	
	public void effect(){
		System.out.println("物品使用后，可以有效果");
	}
}
