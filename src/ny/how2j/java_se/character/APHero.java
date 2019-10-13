package character;

public class APHero extends Hero implements AP{
 
    @Override		//什么意思？？好像是公开的借口声明	//重写方法，的声明
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
 
}