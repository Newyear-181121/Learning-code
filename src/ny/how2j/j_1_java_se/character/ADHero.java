package character;

import property.Item;

public class ADHero extends Hero implements AD
{
	
	public void physicAttack() {
        System.out.println("进行物理攻击");
    }
	
	public int getMoveSpeed(){
        return this.moveSpeed;
    }
     
	//super  是调用父类的moveSpeed属性
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    
 // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }
	
    public void attack() 
    {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }
 
    public void attack(Hero h1) 
    {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }
 
    public void attack(Hero h1, Hero h2) 
    {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }
    
 // 可变数量的参数
    public void attack(Hero... heros) 
    {
        for (int i = 0; i < heros.length; i++) 
        {
            System.out.println(name + " 攻击了 " + heros[i].name);
 
        }
    }
    
    /*
    	实例化一个ADHero(), 其构造方法会被调用 
		其父类的构造方法也会被调用 
		并且是父类构造方法先调用 
		子类构造方法会默认调用父类的 无参的构造方法 
     */
    public ADHero(){
    	System.out.println("====================");
        System.out.println("AD Hero的构造方法");
        System.out.println("会调用父类的构造方法");
        System.out.println("AD Hero的构造方法");
        System.out.println("===================");
    }
 
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法++++++++");
    }
    
    
    
    public static void main(String[] args) 
    {
    	ADHero h3= new ADHero();
    	
		System.out.println(h3.getMoveSpeed());
        System.out.println(h3.getMoveSpeed2());
    	
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
 
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
 
        bh.attack(h1);
        bh.attack(h1, h2);
        
        bh.attack(h1);
        bh.attack(h1, h2);
        
        new ADHero("德莱文");
    }
 
}