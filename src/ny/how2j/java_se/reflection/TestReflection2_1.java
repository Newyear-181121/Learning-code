package reflection;

import java.lang.reflect.Constructor;

/**
 * ͨ��������ƴ���һ������
 * @author New year
 *
 *���ﶼ����Hero����������
 */
public class TestReflection2_1 {

	public static void main(String[] args) {

		 //��ͳ��ʹ��new�ķ�ʽ��������
        Hero h1 =new Hero();
        h1.name = "teemo";
        System.out.println(h1);//reflection.Hero@139a55 ---->@�����ǵ�ַ��
        System.out.println("---------+++--------");
          
        try {
            //ʹ�÷���ķ�ʽ��������
            String className = "reflection.Hero";
            //�����
            Class pClass=Class.forName(className);
            //������
            Constructor c= pClass.getConstructor();
            //ͨ��������ʵ����
            Hero h2= (Hero) c.newInstance();
            
            System.out.println("-----------------");
            System.out.println("����Ϊʲôû�д�ӡ��");
            System.out.println("����Ū��charactor�������Hero����");
            
            h2.name="gareen";
            System.out.println(h2);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
