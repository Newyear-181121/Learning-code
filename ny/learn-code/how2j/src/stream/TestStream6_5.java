package stream;

import java.io.UnsupportedEncodingException;

/**
 * һ������ʹ�ò�ͬ���뷽ʽ�ı���
 * @author New year
 *
 */
public class TestStream6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "��";
		showCode(str);//���������̬����  ��ʾ�ַ�
	}
	
	//������������̬������ʹ���˶�̬������������һ����������һ����
	
	
	private static void showCode(String str) {
		String[] encodes = { "BIG5" , "GBK" , "GB2312" , "UTF-8" , "UTF-16" , "UTF-32" };
		for (String encode : encodes) {
			//ÿ�ֱ��뷽ʽ������һ���������
			showCode(str ,encode);			//���ô����������ķ���
		}
	}
										//str���ַ���  ��		encode�Ǳ��뷽ʽ
	private static void showCode(String str,String encode){
		
		try {
			System.out.printf("�ַ���\" %s \" ���ڱ��뷽ʽ  %s �µ�ʮ������ֵ��   %n", str, encode);			//����%n   �ǻس�����     printf  �÷���c���÷���ͬ��
			
			
			byte[] bs = str.getBytes(encode);		//getBytes   ��ʲô��˼����
			
			for (byte b : bs) {
				int i = b&0xff;
				System.out.print(Integer.toHexString(i) + "\t");		//����ʹ����һ��int�İ�װ��  Integer 
			}
			System.out.println();
			System.out.println();
		} catch (UnsupportedEncodingException e) {		//ֻҪ�������룬�Ͳ���������  ��ֻҪ������  �ͻ����쳣��
			System.out.printf("UnsupportedEncodingException: %s���뷽ʽ�޷������ַ�%s\n", encode, str);
			e.printStackTrace();
		}
	}

}
