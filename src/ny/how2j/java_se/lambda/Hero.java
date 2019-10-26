package lambda;


/**
 * for TestLambda class   创建的类
 * @author New year
 *
 */
public class Hero implements Comparable<Hero> {

	public String name;
	public float hp;
	
	public int damage;
	
	public Hero(){
		
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	//初始化name,hp,damage的构造方法
	public Hero(String name,float hp,int damage ){
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	
	@Override
	public int compareTo(Hero anotherHero) {
		if(damage<anotherHero.damage)
			return 1;
		else
			return -1;
	}
	
	/*		//为什么这里用手打的code方法名，输出就会有错误，用系统添加覆盖的方法名就没有错误了？？？
	public String ToString(){
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]  \r\n";
	}
	*/
	
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]  \r\n";
	}
	
	//这是自动添加的抽象方法的原始数据
	/*
	@Override
	public int compareTo(Hero o) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	
	

}

/*   1-1手打代码输出        
 初始化后的集合：
[lambda.Hero@106d69c, lambda.Hero@52e922, lambda.Hero@25154f, lambda.Hero@10dea4e, lambda.Hero@647e05, lambda.Hero@1909752, lambda.Hero@1f96302, lambda.Hero@14eac69, lambda.Hero@a57993, lambda.Hero@1b84c92]
筛选出 hp>100 && damange<50的英雄
lambda.Hero@647e05lambda.Hero@1909752lambda.Hero@1f96302lambda.Hero@a57993lambda.Hero@1b84c92 
 */

/*   1-1系统代码输出	
 初始化后的集合：
[Hero [name=hero 0, hp=5024.0, damage=58]  
, Hero [name=hero 1, hp=4313.0, damage=96]  
, Hero [name=hero 2, hp=9027.0, damage=67]  
, Hero [name=hero 3, hp=662.0, damage=30]  
, Hero [name=hero 4, hp=6615.0, damage=3]  
, Hero [name=hero 5, hp=8088.0, damage=27]  
, Hero [name=hero 6, hp=8999.0, damage=1]  
, Hero [name=hero 7, hp=5202.0, damage=66]  
, Hero [name=hero 8, hp=5382.0, damage=52]  
, Hero [name=hero 9, hp=3297.0, damage=95]  
]
筛选出 hp>100 && damange<50的英雄
Hero [name=hero 3, hp=662.0, damage=30]  
Hero [name=hero 4, hp=6615.0, damage=3]  
Hero [name=hero 5, hp=8088.0, damage=27]  
Hero [name=hero 6, hp=8999.0, damage=1]  

 */
