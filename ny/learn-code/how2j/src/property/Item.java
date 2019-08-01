package property;

public class Item 
{
	String name;
    int price;
    
    double damage;
    
    public void buy(){
        System.out.println("购买");
    }
    /*
     *效果 
     */
    public void effect()
    {
    	System.out.println("effect物品使用后，可以有效果");
    }

}
