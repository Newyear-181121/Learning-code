package file;

import java.io.File;
import java.io.IOException;


/**
 * �ļ����÷���2
 * @author New year
 *
 */
public class TestFile1_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("E:�����ļ���/New year/java_demo/LOL.txt");//ԭ�����ļ���d:/LOLFolder/skin/garen.ski
		  
        // ���ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
        f.list();
        System.out.println("����001:"+f.list());
        
        // ���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
        File[] fs= f.listFiles();
        System.out.println("����002�ǣ�"+fs );
  
        // ���ַ�����ʽ���ػ�ȡ�����ļ���
        f.getParent();
        System.out.println("����003:"+ f.getParent() );
  
        // ���ļ���ʽ���ػ�ȡ�����ļ���
        f.getParentFile();
        // �����ļ��У�������ļ���skin�����ڣ���������Ч
        f.mkdir();
        System.out.println("����004"+ f.getParentFile() + " + " +f.mkdir());
  
        // �����ļ��У�������ļ���skin�����ڣ��ͻᴴ�����ļ���
        f.mkdirs();
        System.out.println("����005:"+f.mkdirs());
        
  
        // ����һ�����ļ�,������ļ���skin�����ڣ��ͻ��׳��쳣
        f.createNewFile();
        // ���Դ���һ�����ļ�֮ǰ��ͨ�����ᴴ����Ŀ¼
        f.getParentFile().mkdirs();
        System.out.println("����006:"+f.createNewFile());
  
        // �г����е��̷�c: d: e: �ȵ�
        f.listRoots();
        System.out.println("����001:"+f.list());
  
        // �h���ļ�
        f.delete();
        System.out.println("����001:"+f.list());
  
        // JVM������ʱ�򣬄h���ļ�����������ʱ�ļ���ɾ��
        f.deleteOnExit();
  
    
	}

}
