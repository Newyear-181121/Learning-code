package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Throwable
 * 		Throwable���࣬Exception��Error���̳��˸���
 * 		�����ڲ�׽��ʱ��Ҳ����ʹ��Throwable���в�׽
 * @author New year
 *
 */
public class TestException4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("d:/LOL.exe");
		
		try {
			new FileInputStream(f);
		} catch (Throwable t) {		//�����ڲ�׽��ʱ��Ҳ����ʹ��Throwable���в�׽
			
			t.printStackTrace();
		}
	}

}
