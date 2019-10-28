package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���쳣��׽�취2
 * 			�ǰѶ���쳣������һ��catch��ͳһ��׽
 * 			catch (FileNotFoundException | ParseException e) {
 * 			���ַ�ʽ�� JDK7��ʼ֧�֣��ô��ǲ�׽�Ĵ�������գ�����֮���ǣ�һ�������쳣������ȷ�������������쳣����Ҫͨ��instanceof �����жϾ�����쳣����
 * 			if (e instanceof FileNotFoundException)
 *			System.out.println("d:/LOL.exe������");
 *			if (e instanceof ParseException)
 *			System.out.println("���ڸ�ʽ��������");
 * @author New year
 *
 */
public class TestException2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Զ�����������			//�������Ǵ����ĸ�
		
		File f = new File("D:/lol.exe");
		
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f);
			//�������Exception �����code�Ͳ���ִ���ˡ�
			//ֻ�е������code�����Ż�ִ�к���Ĵ��롣
			
			System.out.println("�ɹ���");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date d = sdf.parse("0000-22-33");
		}catch(FileNotFoundException | ParseException e){
			if (e instanceof FileNotFoundException)
				System.out.println("d:/LOL.exe������");
			if (e instanceof ParseException)		//parse  //������           �쳣
				System.out.println("���ڸ�ʽ��������");
			
			//�����Ƿ��������쳣������ӡ��������·��
			e.printStackTrace();
		}
		
	}

}
