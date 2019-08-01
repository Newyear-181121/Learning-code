package reflection;

public class Hero {
	public String name;
    public float hp;
    public int damage;
    public int id;
 
    static String copyright;
 
    static {
        System.out.println("初始化 copyright");
        System.out.println("静态初始化块");
        copyright = "版权由Riot Games公司所有";
        System.out.println("静态初始化块最先开始初始化");
    }
    
    {
    	System.out.println("非静态初始化块");
    	System.out.println("非静态初始化块第二开始初始化");
    }
    
    public Hero() {
    	System.out.println("构造器方法");
    	System.out.println("构造器也叫构造函数");
    	System.out.println("构造器最后开始初始化");
    }

	

}
