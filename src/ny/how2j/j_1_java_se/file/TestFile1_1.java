package file;

import java.io.File;


/**
 * ����һ���ļ�����
 * @author New year
 *
 */
public class TestFile1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ����·��
        File f1 = new File("d:/LOLFolder");
        System.out.println("f1�ľ���·����" + f1.getAbsolutePath());
        
     // ���·��,����ڹ���Ŀ¼�������eclipse�У�������ĿĿ¼
        File f2 = new File("LOL.exe");
        System.out.println("f2�ľ���·����" + f2.getAbsolutePath());
        
     // ��f1��Ϊ��Ŀ¼�����ļ�����
        File f3 = new File(f1, "LOL.exe");
  
        System.out.println("f3�ľ���·����" + f3.getAbsolutePath());
        
        
        
	}

}
