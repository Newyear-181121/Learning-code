package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * �����쳣
 * @author New year
 *
 */
public class TestException01 {
	
	public static void main(String[] args) throws FileNotFoundException {
        
        File f= new File("E:/�洢�ļ���/һЩ�ļ�/�����ֽ/SogouWP/Net/WallPaper/10298.jpg");
          
        //��ͼ���ļ�LOL.exe�����׳�FileNotFoundException�������������쳣���ͻ��б������
        new FileInputStream(f);
        System.out.println("���Դ��ļ�");
          
        // new FileInputStream(f) ��ͼ��ĳ�ļ�
        
        
        //OutOfIndexException �����±�Խ���쳣
        int[] a = new int[3];
        a[5] = 8;
        System.out.println("OutOfIndexException �����±�Խ���쳣");
        
        
        //NullPointerException ��ָ���쳣
        String str = new String();
        str.length();
        System.out.println("NullPointerException ��ָ���쳣");
    }

}
/*
ParseException �����쳣�������ַ���ת��Ϊ���ڶ����ʱ���п����׳����쳣

OutOfIndexException �����±�Խ���쳣
OutOfMemoryError �ڴ治��				//���Ǵ���
ClassCastException ����ת���쳣
ArithmeticException ����Ϊ��
NullPointerException ��ָ���쳣			//����Ϊ��ʱ�������������Ի�����쳣
*/