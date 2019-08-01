package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ�û�������ȡ����
 * 			���Լ���IO����
 * 
 * @author New year
 *			�����ַ������� BufferedReader ����һ�ζ�ȡһ������
 */
public class TestStream7_1 {

	public static void main(String[] args) {
		// ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
		File f = new File("f:demo/lol.txt");
		
		// �����ļ��ַ���
        // ���������뽨����һ�����ڵ����Ļ�����
		try (
				FileReader fr = new FileReader(f);					//�����ַ���		�ⲻ���ֽ���
				BufferedReader br = new BufferedReader(fr);			//����������
			){
			while (true) {			//�������ѭ����        ��ѭ���м������������
				//  һ�ζ�һ��
				String line = br.readLine();		//��ȡһ��
				if (null == line)
					break;
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*
�Խ�����Ӳ��Ϊ�����ֽ������ַ����ı׶ˣ� 
��ÿһ�ζ�д��ʱ�򣬶������Ӳ�̡� �����д��Ƶ�ʱȽϸߵ�ʱ�������ܱ��ֲ��ѡ� 

Ϊ�˽�����ϱ׶ˣ����û������� 
�������ڶ�ȡ��ʱ�򣬻�һ���Զ��϶�����ݵ������У��Ժ�ÿһ�εĶ�ȡ�������ڻ����з��ʣ�ֱ�������е����ݶ�ȡ��ϣ��ٵ�Ӳ���ж�ȡ�� 

�ͺñȳԷ������û������ÿ��һ�ڶ�������ȥ�����û�������Ȱѷ�ʢ���������ĳ����ˣ��ٵ�����ȥ�� 

��������д�����ݵ�ʱ�򣬻��Ȱ�����д�뵽��������ֱ���������ﵽһ���������Ű���Щ���ݣ�һ��д�뵽Ӳ����ȥ���������ֲ���ģʽ���Ͳ������ֽ������ַ�������ÿдһ���ֽڶ�����Ӳ�̣��Ӷ�������IO����
*/