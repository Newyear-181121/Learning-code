package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ʹ�û�����д������
 * 		flush
 * 			�е�ʱ����Ҫ����������д�뵽Ӳ�̣������ǵȻ������˲�д��ȥ�� ��ʱ�����Ҫ�õ�flush
 * 
 * 			PrintWriter �����ַ�������� ����һ��д��һ������
 * @author New year
 *
 */
public class TestStream7_2 {

	public static void main(String[] args) {
		// ���ļ�lol2.txt��д���������
		File f = new File("f:demo/lol-olo.txt");//����һ��û������ļ����᲻�ᴴ������ļ�
		
		try (									//һ�㶼����try���������洴�����ˣ���ӦΪ�����Զ��رգ�������Ҫ���finally ��ر���      ����Ҫ�ǵô�������һ��Ҫ�ر�����
				//  �����ļ��ַ���
				FileWriter fw = new FileWriter(f);
				//  ���������뽨����һ�����ڵ����Ļ�����
				PrintWriter pw = new PrintWriter(fw);
			) {
				pw.println("�����ɲ�����ֱ����������");			//��û���ļ�������»ᴴ������ļ�������������
								
				//ǿ�ưѻ����е�����д��Ӳ�̣����ۻ����Ƿ�����
                pw.flush();
                
				pw.println("garen kill teemo");							//�����û��һϵ�е��ļ���������£�Ҫ���ж��Ƿ�������ļ���û����ʹ��___.mkdirs���������������ὲû�е�Ŀ¼�������á�
				pw.println("����Ӧ���ǿ���ֱ�������");
                pw.flush();
				pw.println("û���ļ�������¿���ֱ�Ӵ�������ļ���");

                pw.flush();		//��������ǰ�����һ�еĻ����е�����д��
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
