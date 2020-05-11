package character;		//在最开始的地方声明该类所处于的包名

//Weapon类在其他包里，使用必须进行import
import property.Weapon;
import property.Item;

/**
 * 基础类。
 */
public class Hero {

	public String name;	//名字
    protected float hp; //血量
    float armor; //护甲
    int moveSpeed 	;		//移动速度
	
/*	//属性id是private的，只有Hero自己可以访问
    //子类不能继承
    //其他类也不能直接访问	
     * 
     * 只有通过get和set方法进行访问。
     * 
     * 
     * 	*/
    private int id;
    
	static String copyright;		//类属性,静态属性，版权
 
    float maxHP;	//最大血量
        
    /*
     * 使用武器
	 * Item 是一个类名
	 */
	public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
	
    
    
    /*
     * 静态类和非静态类好像不能再同一个类中声明（现在可以了）
     * 
     *     // 非静态内部类，只有一个外部类对象存在的时候，才有意义
     *     because 只有通过对象才能对这个类中的属性和方法进行访问。
     *     
     *     // 战斗成绩只有在一个英雄对象存在的时候才有意义
     */
         class BattleScore 
      {
    		int kill;
    		int die;
    		int assit;
    		public void legendary() 
    		{
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        	}
    	}
        
    
  //物品栏的容量
    public static int itemCapacity=8; //声明的时候 初始化
     
    
    static{
        itemCapacity = 6;//静态初始化块 初始化
    }
   
    
    
    public static final int itemTotalNumber = 6;//物品栏的数量
    
    {
        maxHP = 9999; //初始化块
    } 
     
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    
  //打印内存中的虚拟地址
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }
    
    /*	一个无参的	构造方法
 		// 方法名和类名一样（包括大小写）
    	// 没有返回类型        
     * //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
    //  public Hero(){  
    //      System.out.println("调用Hero的构造方法");
    //  }
     */
    public Hero() {
    /*	System.out.println("======================================");
        System.out.println("实例化一个对象的时候，必然调用构造方法\n这里是00无参构造方法");
        showAddressInMemory();
        System.out.println("=======================================");
     */
    }
    
    
    
    /*
     *  //带一个参数的构造方法
    //有参的构造方法
    //默认的无参的构造方法就失效了
     * 如果写了一个有参的构造方法，系统就不会自动提供默认的无参构造方法了
    public Hero(String heroname){  
        name = heroname;
    }
     
    
    		public Hero(String name){
    			System.out.println("Hero的有一个参数的构造方法 ");
    			this.name = name;
    			}
   	*/
    public Hero(String heroname)
    {  
        
     //   System.out.println("01Hero的有一个参数的构造方法 " + this.name);
        this.name = heroname;
       
    }
     
    
    /*
     * //带两个参数的构造方法
     * 
     * 创建对象的时候，把括号里面的属性赋给类这个对象的相应的属性。
     */
    public Hero(String name,float hp){
    this.name = name;
    this.hp = hp;
 	}
    
    
    
    public Hero(String name, float hp, float armor, int moveSpeed, int id, float maxHP) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		this.id = id;
		this.maxHP = maxHP;
	}
	/*
    	Object类提供一个toString方法，所以所有的类都有toString方法
		toString()的意思是返回当前对象的字符串表达
		通过 System.out.println 打印对象就是打印该对象的toString()返回值 
    
    */
    @Override
    public String toString(){			//转换成字符串
        return name;
    }
    
    /*	当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件

		当它被垃圾回收的时候，它的finalize() 方法就会被调用。

		finalize() 不是开发人员主动调用的方法，而是由虚拟机JVM调用的。 
		
		在这里重写一个fianlize方法，只有当有对象没有任何指引的时候，
		就是说没有任何方法使用这个对象的时候，就会自动调用这个方法。
    */
    @Override
    public void finalize(){
        System.out.println("这个英雄正在被回收");
        System.out.println("不断生成新的对象");
        System.out.println("每创建一个对象，前一个对象，就没有引用指向了");
        System.out.println("那些对象，就满足垃圾回收的条件");
        System.out.println("当，垃圾堆积的比较多的时候，就会触发垃圾回收");
        System.out.println("一旦这个对象被回收，它的finalize()方法就会被调用");
    }
    
  //获取护甲值
    float getArmor()
    {
        return armor;
    }
 
    //坑队友		//坑队友		//方法  坑
    public void keng()
    {
        System.out.println("坑队友！");
    }
    
    void keng(Hero h1,Hero h2){
    	System.out.println(h1.name + "坑了" + h2.name);
    }
    
  //增加移动速度
    void addSpeed(int speed)
    {
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }
    
  
  //回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
      
    
  //实例方法,对象方法，非静态方法 
    //必须有对象才能够调用
    public void die(){
        hp = 0;
    }
    
  //复活   temmo
    public void revive(Hero h){
        //h = new Hero("提莫",383);
    	h.hp = 383;
    }
    
    
    
    
    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
    //public abstract void attack();
    //必须定义抽象方法public abstract class Hero
    //一旦一个类被声明为抽象类，就不能够被直接实例化 
    
    
    
 // 攻击一个英雄，并让他掉damage点血
    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }
    
  //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("battle win");
    }
    
  //装备一把武器
    public void equip(Weapon w){
         
    }
    
    
    
   
}
