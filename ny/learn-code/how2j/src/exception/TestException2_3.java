package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���쳣��׽�취1
 * @author New year
 *
 */
public class TestException2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Զ�����������
		//�Զ�����������
		
		File f = new File("E:/�洢�ļ���/һЩ�ļ�/�����ֽ/SogouWP/Net/WallPaper/10298.jpg");
								//��ԭ��������ļ���ַ�ĳ���ȷ�ġ�
		try{
			System.out.println("try�� d��/LOL.EXE");
			new FileInputStream(f);
			System.out.println("�ɹ���");
			
			//��һ���쳣û��throw �Ż����������code
			//�����һ��code ��throw �� �Ͳ������еڶ���code�ˡ�
			SimpleDateFormat sdf = new SimpleDateFormat("y--d");//yyyy-mm-dd
			
			System.out.println("���е�����һ����02");//�����û�����й���
								//�ѵ��ǵ�һ���쳣�����˾�ֱ��throw �ˣ���û����������Ĵ��롣
			
			//��ǰ�治һ���ͻ���exception
			Date d = sdf.parse("2016-03");//yyyy-mm-dd   ֻҪ�����ǰ��ĸ�ʽ����һ���Ͳ����д�����
			
			System.out.println(d);
			System.out.println("���е�����һ����01");
			
			
		}catch (FileNotFoundException e){			//�����Ƕ�Ӧ�쳣�Ĵ�����
			//����Ĵ��������Ǵ�ӡ������Ϣ�������Ҵ�ѧϰ
			System.out.println("Ҫ�򿪵��ļ�������");
			//��ӡ��������·�ߡ�
			e.printStackTrace();
		}catch (ParseException e){
			System.out.println("���ڸ�ʽ��������");
			e.printStackTrace();//��ӡ��������·�ߡ�
		}
	}

}
