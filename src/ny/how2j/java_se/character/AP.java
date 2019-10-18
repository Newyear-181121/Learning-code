package character;

/**
 * 魔法伤害的接口
 */
public interface AP {

    // fianl 修饰的变量不可再改变，
    // fianl 修饰的就是长量。
	public static final int resistPhysic = 100;
    
    //resistMagic即便没有显式的声明为 public static final
    //但依然默认为public static final
    int resistMagic = 0; 
     
    public void magicAttack();
}
