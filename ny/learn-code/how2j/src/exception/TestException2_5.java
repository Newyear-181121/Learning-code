package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * finally
 * @author New year
 *
 */
public class TestException2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Զ�����������
		
		File f = new File("g;/lol.cpp");
		
		try {
			System.out.println("try ��  f �е��ļ�");
			new FileInputStream(f);
			
			System.out.println("success");//��ӡ������˵�������code��ִ���ˡ�
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			// 		�Զ�       ���� 		ץס		��
			
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
			System.out.println("d:/LOL.exe������002");
		}finally{
			System.out.println("�����ļ��Ƿ���ڣ� ����ִ�еĴ���");
		}
	}

}
