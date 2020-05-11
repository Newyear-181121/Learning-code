package character;

// 单继承，多实现，， 同时是想两个接口方法。
public class ADAPHero extends Hero implements AD,AP{

  @Override
  public void magicAttack() {
      System.out.println("进行魔法攻击");
  }

  @Override
  public void physicAttack() {
      System.out.println("进行物理攻击");
  }

}