package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * ���ֽ�������ʽ��ȡ�ļ�����
 * @author New year
 *
 *InputStream���ֽ���������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
 *FileInputStream ��InputStream���࣬��FileInputStream Ϊ�������ļ���ȡ
 *
 */
public class TestStream3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//�����ļ�����
			//��Ҫ׼��һ���ļ�  lol��TXT ����������  ����AB��ab  ��ӦASCII��65 65 ��97 98
			File f = new File("f:/demo/LOL.txt");
			
			//����  �����ļ���    ������
			FileInputStream fis = new FileInputStream(f);
			
			//��������    �ֽ�����     ������Ϊ  ���Ⱦ����ļ��ĳ���
			//ӦΪ������codeǰ������ �ļ�������  ��������ſ��Զ�ȡ�ļ��ĳ��ȣ������ļ��ĳ��Ȳ�ȷ����
			byte[] all = new byte[(int) f.length()];
			
			//���ֽ�������ʽ��ȡ�ļ���������
			fis.read(all);
			
			//������for����ǿ��ʽ��������
			for(byte b : all){
				System.out.println(b);
			}
			
			/**
			 * ÿ��ʹ����������Ӧ�ý��йر�
			 * 
			 * ��Ҫ�ر�����
			 * �п��йء�
			 */
			fis.close();//���ǹر���
			
		}catch (IOException e){
			
			e.printStackTrace();
		}
	}

}



/*
ԭʼ�ļ����ݣ�
		AB
		
		ab
		
		
-----------------
����̨�����
		65
		66
		13							13��10   Ӧ���ǻ��лس���ASCII�롣
		10
		13
		10
		97
		98
		13
		10
		13
		10
		13
		10
*/

		
