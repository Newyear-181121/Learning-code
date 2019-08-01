package reflection;


/**
 * ��ȡ�����
 * @author New year
 *
 *��ȡ�������3�ַ�ʽ
 *1. Class.forName
 *2. Hero.class
 *3. new Hero().getClass()
 *
 *��һ��JVM�У�һ���ֻ࣬����һ���������ڡ������������ַ�ʽȡ����������󣬶���һ���ġ�
 *
 *ע�� ׼ȷ�Ľ���һ��ClassLoader�£�һ���ֻ࣬����һ���������ڡ�ͨ��һ��JVM�£�ֻ����һ��ClassLoader����Ϊ��û������ClassLoader��� ������ʱ��չ���ˡ�
 */
public class TestReflection1_2 {

	public static void main(String[] args) {
        String className = "reflection.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
            System.out.println(pClass2==pClass3);
            
            System.out.println(pClass1.getName());//ֻ����get������ȡ�������֡�//�Ӱ�����ʼ��ӡ
            System.out.println(pClass1.getSimpleName());//������
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
  //     System.out.println(pClass1.name);
}
	
}
