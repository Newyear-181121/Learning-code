package review.character;

public class Hero {
	
	
	public static void main(String[] args) {
		 new Hero();
		 Hero h = new Hero();
		 Hero h1 = h;
		
	//	h.a = 5 ;		//a ����ʹ����
	}
	
	
	
	
	/**
	 * ��һ�� 		��
	 * 
	 * 		��������
	 * 		
	 * 1.��ͨ�飺 �ڷ�����Ŀ�
	 * 
	 * ���������ֿ鶼û���ڷ�������
	 * 2.����飺 ֱ���������棬ÿ�δ���������ʱ�򣬾ͻ��Զ�ִ��һ�ο�
	 * 3.��̬�飺 ��static ���εĿ飬�����������Ķ����ʱ��ֻ��ִ��һ�Σ�ֻ�е�һ�ε�ʱ���ִ�У���֮���ٴ��������ʱ��Ͳ����ٴ�����
	 * 
	 */
	int i = 0;
	{
		i++;
		String a = "100";
		System.out.println("������" + i  + "��ִ��,a=" + a);
		
	}
	
	private int id;
	private String name;
	private double hp;
		
	
	
	
	
	
	
	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public double getHp() {
		return hp;
	}







	public void setHp(double hp) {
		this.hp = hp;
	}







	
	
}
