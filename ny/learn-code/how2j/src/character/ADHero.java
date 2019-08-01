package character;

import property.Item;

public class ADHero extends Hero implements AD
{
	
	public void physicAttack() {
        System.out.println("����������");
    }
	
	public int getMoveSpeed(){
        return this.moveSpeed;
    }
     
	//super  �ǵ��ø����moveSpeed����
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    
 // ��дuseItem���������е��ø����userItem����
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }
	
    public void attack() 
    {
        System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
    }
 
    public void attack(Hero h1) 
    {
        System.out.println(name + "��" + h1.name + "������һ�ι��� ");
    }
 
    public void attack(Hero h1, Hero h2) 
    {
        System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
    }
    
 // �ɱ������Ĳ���
    public void attack(Hero... heros) 
    {
        for (int i = 0; i < heros.length; i++) 
        {
            System.out.println(name + " ������ " + heros[i].name);
 
        }
    }
    
    /*
    	ʵ����һ��ADHero(), �乹�췽���ᱻ���� 
		�丸��Ĺ��췽��Ҳ�ᱻ���� 
		�����Ǹ��๹�췽���ȵ��� 
		���๹�췽����Ĭ�ϵ��ø���� �޲εĹ��췽�� 
     */
    public ADHero(){
    	System.out.println("====================");
        System.out.println("AD Hero�Ĺ��췽��");
        System.out.println("����ø���Ĺ��췽��");
        System.out.println("AD Hero�Ĺ��췽��");
        System.out.println("===================");
    }
 
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero�Ĺ��췽��++++++++");
    }
    
    
    
    public static void main(String[] args) 
    {
    	ADHero h3= new ADHero();
    	
		System.out.println(h3.getMoveSpeed());
        System.out.println(h3.getMoveSpeed2());
    	
        ADHero bh = new ADHero();
        bh.name = "�ͽ�����";
 
        Hero h1 = new Hero();
        h1.name = "����";
        Hero h2 = new Hero();
        h2.name = "��Ī";
 
        bh.attack(h1);
        bh.attack(h1, h2);
        
        bh.attack(h1);
        bh.attack(h1, h2);
        
        new ADHero("������");
    }
 
}