package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * ��try�йر�
 * @author New year
 *			��������һ���׶ˣ�
 *				����ļ������ڣ����߶�ȡ��ʱ�����������׳��쳣����ô�Ͳ���ִ����һ�йر����Ĵ��룬���ھ޴����Դռ�������� ���Ƽ�ʹ��.
 */
public class TestStream4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f = new File("f:/demo/loll.txt");				//�����ļ�����
			System.out.println("���쳣��ʱ������������Ѿ�ִ���˵�   001");
			
			FileInputStream fis =  new FileInputStream(f);	//�����ֽ����������     	�൱�ڴ����ֽ�������ӿ�
			
			
			System.out.println("���쳣��ʱ��û��ִ�е��������   002");//˵������������д����׳����쳣
			
			
			System.out.println("���ֽ�������");
			byte[] all = new byte[(int) f.length()];		//��������ĳ��Ⱦ����ļ��ĳ���
			
			/**
			 * ���������ʱ֮���뵽Java������еġ�
			 */
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
			//��try  ����ر���
			fis.close();
			System.out.println("�ر����ֽ���");
			System.out.println("û���׳��쳣�������������ر���");
			
			
		} catch (IOException e ){
			System.out.println("û�йر������������û���ҵ��ļ����׳����쳣����û�йر�����");
			e.printStackTrace();
		}
		
	}

}
