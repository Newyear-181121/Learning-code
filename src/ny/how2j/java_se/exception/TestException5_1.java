package exception;


/**
 * 创建自定义异常
 * 				异常名EnemyHeroIsDeadException     继承Exception
 * @author New year
 *
 */
public class TestException5_1 extends Exception{		//自定意的异常要继承exception异常类
														//相当于创建了一个新名字，一个异常的名字
	
	//构造一个无参的构造方法
	public TestException5_1(){
        
    }
	
	//构造一个有参的构造方法
    public TestException5_1(String msg){
    	
    	//调用父类的对应的构造方法
        super(msg);
    }
}
