package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * ��FileInputStream �ֽ�����ȷ��ȡ����
 * @author New year
 *
 *		Ϊ���ܹ���ȷ�Ķ�ȡ��������
 *		1. �����˽��ı��������ֱ��뷽ʽ�����ַ���
 *		2. ʹ���ֽ�����ȡ���ı�����ʹ�ö�Ӧ�ı��뷽ʽȥʶ����Щ���֣��õ���ȷ���ַ�
 *		�籾����һ���ļ��е��������ַ��У����뷽ʽ��GBK����ô������������һ����D6D0��
 *		��ʹ��GBK���뷽ʽʶ��D6D0��������ȷ�ĵõ��ַ���
 *		
 *		ע�� ��GBK���������ҵ������ֺ�JVM���Զ��ҵ�����UNICODE��������϶�Ӧ����
 *		�֣�������UNICODE�ϵ����ֱ������ڴ��С�
 */
public class TestStream6_8 {

	public static void main(String[] args) {
		
		File f = new File("f:demo\\test.txt");
		try (FileInputStream fis = new FileInputStream(f);) {			//��try��������д򿪵������Զ��رա���������
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			
			
			System.out.println("�ļ��ж������������ǣ�");
			for (byte b: all) {
				int i = b&0x000000ff;		//ֻȡ16���Ƶĺ���λ
				System.out.println(Integer.toHexString(i));		//�����Integer.toHexString(i)��ʲô��˼����
			}
			System.out.println("��������֣�����GBK��������ȥ��");
			String str = new String(all,"GBK");			//������Ǳ��뷽��     ǰ���all�Ǳ�������  ��ʼ����          ����  ������Ǳ��뷽ʽ
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
