package stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ���ַ�����ȡ�ļ�
 * @author New year
 *		FileReader ��Reader���࣬��FileReader Ϊ�������ļ���ȡ
 */
public class TestStream5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//�Զ������������
		//������ļ�����Ҫ��ǰ׼���õ�		ԭ�ģ�// ׼���ļ�lol.txt���е�������AB
		File f = new File("f:lol.txt");
		//���������ļ���Reader
		try (FileReader fr = new FileReader(f)) {
			// �����ַ����飬�䳤�Ⱦ����ļ��ĳ���
			char[] all = new char[(int) f.length()];
			// ���ַ�������ʽ��ȡ�ļ���������
			fr.read(all);//����ķ���Ҳ��read
			for (char b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
