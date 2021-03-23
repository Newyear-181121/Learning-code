package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * ��finally�йر�  ��
 * 			���Ǳ�׼�Ĺر����ķ�ʽ
 * 			1. ���Ȱ���������������try�����棬���������try���棬���������޷��ִ�finally.
 * 			2. ��finally�ر�֮ǰ��Ҫ���жϸ������Ƿ�Ϊ��
 * 			3. �رյ�ʱ����Ҫ��һ�ν���try catch����
 * @author New year
 *
 *			���Ǳ�׼���Ͻ��Ĺر����ķ�ʽ�����ǿ���ȥ�ܷ���������д����Ҫ�Ļ��߲��Դ����ʱ�򣬶�����������������try�ķ�ʽ����Ϊ���鷳~
 */
public class TestStream4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("f:demo/lol.txt");
		
		//����try��������һ���յ��ֽ�������            		�ȴ���    ���������      �������ݴ�����
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {			//����������ǣ�����������û�г����쳣����������һ���������������ж���û�п���������������ˣ��͹رգ����û�п����Ͳ�ִ��if��Ĵ��롣
			//  ��finally  ��ر���      
			if (null != fis){		//����try���Ƿ�ֹ�رյ�ʱ����ִ���
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
