package exception;


/**
 * 抛出自定义异常
 * 			创建一个新类，使它抛出刚刚定义的新异常
 * @author New year
 *
 */
public class TestException5_2 {

	public String name;
	protected float hp;
	
	
	//创建方法       攻击方法    有抛出异常的属性     异常类型为（异常名是） 新异常
	//throws 是声明 在这个方法中，可能会有异常抛出，但不一定会有异常抛出
	public void attackHero(TestException5_2 h) throws TestException5_1{
		
		//如果有有英雄血量为零，表示已近死了，就会触发这个
		
		if(h.hp == 0){		//如果血量为零，就执行抛出异常
			
			//throw是抛出 后面这个类型的异常 
			throw new TestException5_1(h.name + "已经挂了，不需要施放技能");
		}
	}
	
	public String toString(){
		return name;
		
	}
	
	
	/*
	 * 
	 *  //这个类已经在外面的包中创建了         是后缀为   5_1 这个类
	class EnemyHeroIsDeadException extends Exception{
        
        public EnemyHeroIsDeadException(){
             
        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }
    
    */
	
	public static void main(String[] args){
		
		//创建两个对象
		TestException5_2 garen = new TestException5_2();
		garen.name = "盖伦";
		garen.hp = 616;
		
		TestException5_2 teemo = new TestException5_2();
		teemo.name = "提莫";
		teemo.hp = 0;
		
		try {
			//盖伦，攻击  提莫  
			/*{提莫血量为零  
			 * 		抛出异常了
			 * 
			 */
			garen.attackHero(teemo);
			
			//catch   住这个异常      然后处理，，，处理方法如下，，打印并查看方法调用路线
		}catch (TestException5_1 e){
			System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
		}
		
	}
	
	
}
