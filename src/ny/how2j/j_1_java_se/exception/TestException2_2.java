package exception;

import java.io.File;
import java.io.FileInputStream;

/**
 * ʹ���쳣�ĸ������catch
 * 		�ø���catch exception
 * @author New year
 *
 */
public class TestException2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  //ÿ�ζ��������仰��ɶ��˼����
		//�����ǣ�����			
		//		�Զ�-����        		����    ��������Ʊ������
		//�Զ�����������
		
		File f = new File("d:/LOL.exe");
		
		try{
			System.out.println("try�� d:LOL.EXE");
			//���Դ�f�е��ļ���
			new FileInputStream(f);		
			System.out.println("�ɹ���");
			
			
			//FileNotFoundException��Exception�����࣬ʹ��ExceptionҲ����catchסFileNotFoundException��
			//TestException21  ���õ���FileNotFoundException�ࡣ
		}catch(Exception e){
			System.out.println("d:/LOL.EXE������");
			
			e.printStackTrace();	//��ӡ���÷���·�ߡ�	
		}
	}

}
