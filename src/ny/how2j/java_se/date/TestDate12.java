package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate12 {
	
	public static void main(String[] args) {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
  
        String str = "2016/1/5 12:12:12";
          
        try {
            Date d = sdf.parse(str);
            System.out.printf("�ַ��� %s ͨ����ʽ  yyyy/MM/dd HH:mm:ss %nת��Ϊ���ڶ���: %s",str,d.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          
    }

}
