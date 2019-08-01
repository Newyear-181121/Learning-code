package reflection;

import java.lang.reflect.Constructor;

/**
 * ��ȡ������ʱ�򣬻ᵼ�������Ա���ʼ��
 * @author New year
 *
 *
 *ΪHero����һ����̬����,�����ھ�̬��ʼ��������г�ʼ�����ο� �����Գ�ʼ���� 
 *
 *static String copyright;
 *static {
 *   System.out.println("��ʼ�� copyright");
 *   copyright = "��Ȩ��Riot Games��˾����";
 *}
 *
 *
 *����ʲô;����ȡ����󣬶��ᵼ�¾�̬���Ա���ʼ��������ֻ��ִ��һ�Ρ�������ֱ��ʹ�� Class c = Hero.class ���ַ�ʽ�����ַ�ʽ���ᵼ�¾�̬���Ա���ʼ����
 */
public class TestReflection1_3 {
	
	public static void main(String[] args) {
		String className = "reflection.Hero";
		
		try {
			/**
			 * �������ֻ�ȡ������;��һ��ʹ��ʱ����̬��ʼ��ֻ�����һ�Ρ�
			 */
			Class pClass1 = Class.forName(className);		//ֻ�о�̬���ʼ���ˣ������캯��û�г�ʼ��
			Class pClass2 = Hero.class;				//û�о�̬��ʼ��
			Class pClass3 = new Hero().getClass();			//��̬�飬�Ǿ�̬�飬���캯����ȫ����ʼ����
		} catch (/*ClassNotFound*/Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("����������������������������������������������������������������������������");
		System.out.println("�������û��ֱ��ִ��");
		System.out.println("���������Ȼ������������ڣ����ǲ���ִ��");
		
	}

}

//�����import �������������code��ȫ������

/**
 * ����һ������
 * @author New year
 *
 *ͨ��������ƴ���һ������
 */

class TestRefliction2_1 {
	public static void main(String[] args) {
        //��ͳ��ʹ��new�ķ�ʽ��������
        Hero h1 =new Hero();
        h1.name = "teemo";
        System.out.println(h1);
          
        try {
            //ʹ�÷���ķ�ʽ��������
            String className = "charactor.Hero";
            //�����
            Class pClass=Class.forName(className);
            //������
            Constructor c= pClass.getConstructor();
            //ͨ��������ʵ����
            Hero h2= (Hero) c.newInstance();
            h2.name="gareen";
            System.out.println(h2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
