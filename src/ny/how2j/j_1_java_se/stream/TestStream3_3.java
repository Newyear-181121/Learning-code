package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ֽ�������ʽ���ļ�д������
 * @author New year
 *
 *OutputStream���ֽ��������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
 *FileOutputStream ��OutputStream���࣬��FileOutputStream Ϊ�����ļ�д������
 *
 * ע: ����ļ�d:/lol2.txt�����ڣ�д���������Զ��������ļ��� 
 * ����������ļ� d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڣ����׳��쳣
 *
 */
public class TestStream3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//�����ļ�����
			//׼���ļ�lol2.txt  �����Բ������ļ�				//û�д����ļ��е�����¹�Ȼ    ������һ���ļ��������������е�����
			File f = new File("f:/demo/lol2.txt");
			
			//׼��һ�����飬���������ݣ����������ַ���X��Y
			byte data[] = { 88,89 };
			//����׼���������֣�����Ȼ�ж�Ӧ��ASCII�룬��������һ���ǽ�����ת������ĸ�ַ����أ�
			
			//��һ����������
			for(byte b : data){
				System.out.println(b);
			}//�������ʱ�����������
			
			//�����ļ��������        �Ķ���
			FileOutputStream fos = new FileOutputStream(f);
			//������д�뵽�����
			fos.write(data);
			
			//�������Զ�ת������
			
			//�ر������
			fos.close();
		}catch(IOException e){
			e.printStackTrace();//�쳣������Ȼ�Ǵ�ӡ   ��     �ۼ�  
		}
		
	}

}
