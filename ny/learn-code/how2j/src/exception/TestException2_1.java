package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * �쳣����
 * 		�쳣�������ֶΣ� try catch finally throws
 * @author New year
 *
 */
public class TestException2_1 {
	
	public static void main(String[] args) {
        
        File f= new File("E:/�洢�ļ���/һЩ�ļ�/�����ֽ/SogouWP/Net/WallPaper/0000.jpg");//������ļ�error  try���оͻ�throw exception
         																				 //here ��file right try���е�code�Ͳ���ִ��		
        /**
         * �������׳��쳣�Ĵ���try��
         * �������׳�FileNotFoundException �ļ��������쳣�Ĵ������try��
         */
        try{	//try ���м�����ܻ�����쳣�����
        	
            System.out.println("��ͼ�� E:/�洢�ļ���/һЩ�ļ�/�����ֽ/SogouWP/Net/WallPaper/10298.jpg");
            
            new FileInputStream(f);		//���Դ�f�е��ļ�������Ҳ����ͻ�����쳣��
            							//�����쳣�ͻ���������catch����ץס�쳣����ִ��catch�еķ�����
            
            
            //((Throwable) f).printStackTrace();//�����ӡ���úۼ������ã�grin��¶�ݶ�Ц      Ц�ޣ�laugh cry��
            
            //û�г����쳣�ͻ�����ִ�У����Ҳ���ִ��catch�е���䡣
            System.out.println("�ɹ���");
        }
        catch(FileNotFoundException e){
            System.out.println("E:/�洢�ļ���/һЩ�ļ�/�����ֽ/SogouWP/Net/WallPaper/10298.jpg������");
            
            //e.printStackTrace(); ���ӡ�������ĵ��úۼ�
            											/*
       		��Ӧ���ǵ���·��								 *	at java.io.FileInputStream.open0(Native Method)
														 *	at java.io.FileInputStream.open(FileInputStream.java:195)
														 *	at java.io.FileInputStream.<init>(FileInputStream.java:138)
														 *	at exception.TestException21.main(TestException21.java:28)
            											 */
            
            
            e.printStackTrace();
        }
         
    }

}
