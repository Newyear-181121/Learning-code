package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 * ���л�һ������
 * @author New year
 *
 *
 *			����һ��Hero��������������Ϊgaren�� 
 *			�Ѹö������л���һ���ļ�garen.lol��
 *			Ȼ����ͨ�����л��Ѹ��ļ�ת��Ϊһ��Hero����
 *
 *			ע����һ���������л���һ��ǰ���ǣ����������࣬����ʵ����Serializable�ӿ�
 */
public class TestStream9_1 {

	public static void main(String[] args) {
		
		//����һ��Hero garen
        //Ҫ��Hero����ֱ�ӱ������ļ��ϣ������Hero��ʵ��Serializable�ӿ�
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;
        
      //׼��һ���ļ����ڱ���ö���
        File f =new File("f:demo/garen.lol");		//û�д�������ļ�
        											//�����ʱ����Ȼ�Ὠ������ļ�

        try(
        		//�������������
        		FileOutputStream fos = new FileOutputStream(f);
        		ObjectOutputStream oos = new ObjectOutputStream(fos);			//����������������������  ��Ҫ�������ֽ����ϡ�����
        		//�������������� 
        		FileInputStream fis = new FileInputStream(f);
        		ObjectInputStream ois = new ObjectInputStream(fis);
        	){
        		oos.writeObject(h);
        		Hero h2 = (Hero) ois.readObject();
        		System.out.println(h2.name);
        		System.out.println(h2.hp);
        	
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        			//ԭ�������������������ֻ�ǰ���һ����ֱ�Ӽӵ�һ���ļ����ˡ�
          			//��û�м�   Hero h2 = (Hero) ois.readObject();�������ʱ��û������쳣��
        catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

//���ﲻ������public��
 class Hero implements Serializable {
    //��ʾ����൱ǰ�İ汾��������˱仯����������������ԣ���Ӧ���޸�����汾��
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
 
}