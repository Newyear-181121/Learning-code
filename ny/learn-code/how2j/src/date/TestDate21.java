package date;

import java.util.Calendar;
import java.util.Date;

public class TestDate21 {
	
	public static void main(String[] args) {
        //���õ���ģʽ��ȡ��������Calendar.getInstance();
        Calendar c = Calendar.getInstance();
          
        //ͨ����������õ����ڶ���
        Date d = c.getTime();
  
        Date d2 = new Date(0);
        c.setTime(d2); //������������������� : 1970.1.1 08:00:00
    }

}
