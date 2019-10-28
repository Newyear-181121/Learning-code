package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ʹ��try()�ķ�ʽ
 * 			��˼����try��������дcode���÷�
 * 
 * 		����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
 * 		���ֱ�д����ķ�ʽ���� try-with-resources�� ���Ǵ�JDK7��ʼ֧�ֵļ���
 * 		
 * 		���е�������ʵ����һ���ӿڽ��� AutoCloseable���κ���ʵ��������ӿڣ���������try()�н���ʵ������ ������try, catch, finally������ʱ���Զ��رգ����������Դ��
 * @author New year
 *
 */
public class TestStream4_3 {
	public static void main(String[] args) {
		
		File f = new File("f:demo/lol.txt");
		
		//����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
		try (FileInputStream fis = new FileInputStream(f)) {
			byte[] all = new byte[(int) f.length()];//�����length���������ֻ�������������ʹ���𣿶��ǻ�ȡ����ĳ���    ��������ĳ��ȣ��ļ��ĳ���
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		//���еĴ����쳣��һ�㷽�����Ǵ�ӡ��ջ�ۼ���
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
