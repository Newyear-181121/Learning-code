package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �ɲ��쳣
 * 		�ɲ��쳣��������д�����쳣
 * 		Ҫôtry catchס,Ҫô�����ף�˭���ã�˭����
 * 		���� FileNotFoundException
 *		������������������Ͳ�����ͨ��
 * @author New year
 *
 */
public class TestException3_1 {
	
	public static void main(String[] args) {
		
		File f = new File("d:13.321");
		
		try{
			System.out.print("try open file");
			new FileInputStream(f);
			System.out.println("success");
		}catch(FileNotFoundException e){
			System.out.println("open failure");
			e.printStackTrace();
			
		}
	}

}
