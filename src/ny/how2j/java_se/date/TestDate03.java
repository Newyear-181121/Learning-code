package date;

import java.util.Date;

public class TestDate03 {
	
	public static void main(String[] args) {
        Date now= new Date();
  
        //��ǰ���ڵĺ�����
        System.out.println("Date.getTime() \t\t\t����ֵ: "+now.getTime());
        //ͨ��System.currentTimeMillis()��ȡ��ǰ���ڵĺ�����
        System.out.println("System.currentTimeMillis() \t����ֵ: "+System.currentTimeMillis());
           
    }

}
