package character;		//���ʼ�ĵط��������������ڵİ���

//Weapon�����������ʹ�ñ������import
import property.Weapon;
import property.Item;

public class Hero 
{
	public String name;	//����
    protected float hp; //Ѫ��
    float armor; //����
    int moveSpeed 	;		//�ƶ��ٶ�
	
/*	//����id��private�ģ�ֻ��Hero�Լ����Է���
    //���಻�ܼ̳�
    //������Ҳ����ֱ�ӷ���	
     * 
     * ֻ��ͨ��get��set�������з��ʡ�
     * 
     * 
     * 	*/
    private int id;
    
	static String copyright;		//������,��̬���ԣ���Ȩ
 
    float maxHP;	//���Ѫ��
        
    /*
     * ʹ������
	 * Item ��һ������
	 */
	public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
	
    
    
    /*
     * ��̬��ͷǾ�̬���������ͬһ���������������ڿ����ˣ�
     * 
     *     // �Ǿ�̬�ڲ��ֻ࣬��һ���ⲿ�������ڵ�ʱ�򣬲�������
     *     because ֻ��ͨ��������ܶ�������е����Ժͷ������з��ʡ�
     *     
     *     // ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
     */
         class BattleScore 
      {
    		int kill;
    		int die;
    		int assit;
    		public void legendary() 
    		{
            if (kill >= 8)
                System.out.println(name + "����");
            else
                System.out.println(name + "��δ����");
        	}
    	}
        
    
  //��Ʒ��������
    public static int itemCapacity=8; //������ʱ�� ��ʼ��
     
    
    static{
        itemCapacity = 6;//��̬��ʼ���� ��ʼ��
    }
   
    
    
    public static final int itemTotalNumber = 6;//��Ʒ��������
    
    {
        maxHP = 9999; //��ʼ����
    } 
     
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    
  //��ӡ�ڴ��е������ַ
    public void showAddressInMemory(){
        System.out.println("��ӡthis�����������ַ��"+this);
    }
    
    /*	һ���޲ε�	���췽��
 		// ������������һ����������Сд��
    	// û�з�������        
     * //����޲εĹ��췽���������д��
    //�ͻ�Ĭ���ṩһ���޲εĹ��췽��
    //  public Hero(){  
    //      System.out.println("����Hero�Ĺ��췽��");
    //  }
     */
    public Hero() {
    /*	System.out.println("======================================");
        System.out.println("ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��\n������00�޲ι��췽��");
        showAddressInMemory();
        System.out.println("=======================================");
     */
    }
    
    
    
    /*
     *  //��һ�������Ĺ��췽��
    //�вεĹ��췽��
    //Ĭ�ϵ��޲εĹ��췽����ʧЧ��
     * ���д��һ���вεĹ��췽����ϵͳ�Ͳ����Զ��ṩĬ�ϵ��޲ι��췽����
    public Hero(String heroname){  
        name = heroname;
    }
     
    
    		public Hero(String name){
    			System.out.println("Hero����һ�������Ĺ��췽�� ");
    			this.name = name;
    			}
   	*/
    public Hero(String heroname)
    {  
        
     //   System.out.println("01Hero����һ�������Ĺ��췽�� " + this.name);
        this.name = heroname;
       
    }
     
    
    /*
     * //�����������Ĺ��췽��
     * 
     * ���������ʱ�򣬰�������������Ը���������������Ӧ�����ԡ�
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
    	Object���ṩһ��toString�������������е��඼��toString����
		toString()����˼�Ƿ��ص�ǰ������ַ������
		ͨ�� System.out.println ��ӡ������Ǵ�ӡ�ö����toString()����ֵ 
    
    */
    @Override
    public String toString(){			//ת�����ַ���
        return name;
    }
    
    /*	��һ������û���κ�����ָ���ʱ�����������������յ�����

		�������������յ�ʱ������finalize() �����ͻᱻ���á�

		finalize() ���ǿ�����Ա�������õķ����������������JVM���õġ� 
		
		��������дһ��fianlize������ֻ�е��ж���û���κ�ָ����ʱ��
		����˵û���κη���ʹ����������ʱ�򣬾ͻ��Զ��������������
    */
    @Override
    public void finalize(){
        System.out.println("���Ӣ�����ڱ�����");
        System.out.println("���������µĶ���");
        System.out.println("ÿ����һ������ǰһ�����󣬾�û������ָ����");
        System.out.println("��Щ���󣬾������������յ�����");
        System.out.println("���������ѻ��ıȽ϶��ʱ�򣬾ͻᴥ����������");
        System.out.println("һ��������󱻻��գ�����finalize()�����ͻᱻ����");
    }
    
  //��ȡ����ֵ
    float getArmor()
    {
        return armor;
    }
 
    //�Ӷ���		//�Ӷ���		//����  ��
    public void keng()
    {
        System.out.println("�Ӷ��ѣ�");
    }
    
    void keng(Hero h1,Hero h2){
    	System.out.println(h1.name + "����" + h2.name);
    }
    
  //�����ƶ��ٶ�
    void addSpeed(int speed)
    {
        //��ԭ���Ļ����������ƶ��ٶ�
        moveSpeed = moveSpeed + speed;
    }
    
  
  //��Ѫ
    public void huixue(int xp){
        hp = hp + xp;
        //��Ѫ��Ϻ�Ѫƿ=0
        xp=0;
    }
      
    
  //ʵ������,���󷽷����Ǿ�̬���� 
    //�����ж�����ܹ�����
    public void die(){
        hp = 0;
    }
    
  //����   temmo
    public void revive(Hero h){
        //h = new Hero("��Ī",383);
    	h.hp = 383;
    }
    
    
    
    
    // ���󷽷�attack
    // Hero������ᱻҪ��ʵ��attack����
    //public abstract void attack();
    //���붨����󷽷�public abstract class Hero
    //һ��һ���౻����Ϊ�����࣬�Ͳ��ܹ���ֱ��ʵ���� 
    
    
    
 // ����һ��Ӣ�ۣ���������damage��Ѫ
    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }
    
  //�෽������̬����
    //ͨ����Ϳ���ֱ�ӵ���
    public static void battleWin(){
        System.out.println("battle win");
    }
    
  //װ��һ������
    public void equip(Weapon w){
         
    }
    
    
    
   
}
