package stream;

import java.io.IOException;
import java.io.InputStream;		//����ർ���ʱ����ѡ�񣬵�����˵Ļ����д���




/**
 * 	System.in
 * @author New year
 * 		
 * 		System.out �ǳ��õ��ڿ���̨������ݵ� 
 *		System.in ���Դӿ���̨��������
 *
 */
public class TestStream10_1 {

	public static void main(String[] args) {
		//  �ӿ���̨����
		try (InputStream is = System.in;) {		//System.in  Ҳ�����������������������뵽Java�������
			while (true) {
				//	����a,Ȼ���ûس����Կ���
				//  97 13 10
				//  97��a��ASCII��
				//  13 10�ֱ��Ӧ�س�����
				int i = is.read();				//�����ȡ��ӡ�Ķ���ASCII
				System.out.println(i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
