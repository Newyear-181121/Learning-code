package reflection;

public class Hero {
	public String name;
    public float hp;
    public int damage;
    public int id;
 
    static String copyright;
 
    static {
        System.out.println("��ʼ�� copyright");
        System.out.println("��̬��ʼ����");
        copyright = "��Ȩ��Riot Games��˾����";
        System.out.println("��̬��ʼ�������ȿ�ʼ��ʼ��");
    }
    
    {
    	System.out.println("�Ǿ�̬��ʼ����");
    	System.out.println("�Ǿ�̬��ʼ����ڶ���ʼ��ʼ��");
    }
    
    public Hero() {
    	System.out.println("����������");
    	System.out.println("������Ҳ�й��캯��");
    	System.out.println("���������ʼ��ʼ��");
    }

	

}
