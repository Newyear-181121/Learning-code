package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ���ַ������ַ���д�뵽�ļ�
 * @author New year
 *			FileWriter ��Writer�����࣬��FileWriter Ϊ�����ַ���д�뵽�ļ�
 */
public class TestStream5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("f:/demo/lol2.txt");
		
		// ���������ļ���writer
		try (FileWriter fr = new FileWriter(f)) {
			
			// ���ַ�������ʽ������д�뵽�ļ���
			String data = "ʹ���ַ������ַ���д�뵽�ļ�";	
			
			char[] cs = data.toCharArray();			//�����ǰ�  �ַ���ת�����ַ��͵�����
			fr.write(cs);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
