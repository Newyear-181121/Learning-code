package stream;

import java.util.Scanner;

/**
 * Scanner��ȡ�ַ���
 * 
 * @author New year
 * 
 * 		ʹ��System.in.read��Ȼ���Զ�ȡ���ݣ����Ǻܲ�����
 *		ʹ��Scanner�Ϳ������ж�ȡ��
 *
 */
public class TestStream10_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true){					//Ϊʲô������ѭ���������
			String line = s.nextLine();
			System.out.println(line);
		}
			
			
	}

}
