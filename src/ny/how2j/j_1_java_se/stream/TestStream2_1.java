package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * �ļ�������
 * @author New year
 *
 */
public class TestStream2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f = new File("f:/demo/lol.txt");
			// ���������ļ���������
			FileInputStream fis = new FileInputStream(f);			//ϵͳ�Ҳ���ָ��·��  ���ǻ�û�д�������ļ���
			//// ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��Java�������������Ҳ���Ƕ�ȡ���ڴ���
			
		}catch (IOException e ) {
			
			e.printStackTrace();
		}
	}

}
/*
 * ���´��룬�ͽ�����һ���ļ���������������������������ݴ�Ӳ�̵��ļ�����ȡ��JVM(�ڴ�)��
 */


//�Լ�����һ���ļ������


class TestStream2_1_1  {
	
	public void outStr1() throws IOException{
		File f1 = new File("f:/demo/outStream.out");
		
		FileOutputStream fos = new FileOutputStream(f1);
			
	}
	
	public void outStr2()  {
		
		TestStream2_1_1  ts211 = new TestStream2_1_1();
		
		try{
			ts211.outStr1();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	
}










