package character;

public class APHero extends Hero implements AP{
 
    @Override		//ʲô��˼���������ǹ����Ľ������	//��д������������
    public void magicAttack() {
        System.out.println("����ħ������");
    }
 
}