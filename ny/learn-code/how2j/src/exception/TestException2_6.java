package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * throws
 * @author New year
 *
 */
public class TestException2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
		
		/*
			����������method1
			method1����method2
			method2�д��ļ�
		 */
	}
	
	
	//method1ѡ�񱾵�try catchס һ��try catchס�ˣ����൱�ڰ�����쳣�������ˣ��������ڵ���method1��ʱ�򣬾Ͳ���Ҫ�����쳣������
	private static void method1(){
		try{
			method2();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

	
	//method2����Ҫ�����쳣����	  //����method2�����㴦�����ǰ�����쳣ͨ��throws�׳�ȥ
	private static void method2() throws FileNotFoundException {
	//��ômethod1�ͻ�ӵ����쳣�� ����취Ҳ�����֣�Ҫô��try catch�������ҪôҲ���׳�ȥ��	
		
		File f = new File("123.321");
		
		System.out.println("try open 123.321");
		new FileInputStream(f);
		System.out.println("success");
	}
}


/**
throws��throw�������ؼ��ֽӽ����������岻һ��������������
1. throws �����ڷ��������ϣ���throwͨ���������ڷ������ڡ�
2. throws ��ʾ�����쳣��һ�ֿ����ԣ�����һ���ᷢ����Щ�쳣��throw�����׳����쳣��ִ��throw��һ���׳���ĳ���쳣����



 */
