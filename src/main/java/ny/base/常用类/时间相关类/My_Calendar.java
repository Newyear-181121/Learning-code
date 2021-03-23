package ny.base.常用类.时间相关类;

import ny.base.常用类.myUtil.Out;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @auther: NewYear
 * @Date: 2020-10-13 15:26
 * @version: 0.0.1
 * @description: My_Calendar
 */
public class My_Calendar {
    String str;
    public static void main(String[] args) {

        My_Calendar c = new My_Calendar();

        Out.out("请输入日期（格式：2020-20-20）：");
        Scanner scanner = new Scanner(System.in);
        c.str = scanner.nextLine();

        try {
            c.calendar1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        c.calendar2();
    }

    public void calendar1() throws Exception{

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(str);  //得到了时间对象。

        Calendar c = new GregorianCalendar();
        c.setTime(date);

        //Out.out(c);  //输出这个对象的所有属性

        Out.out("日\t一\t二\t三\t四\t五\t六\t");
        c.set(Calendar.DAY_OF_MONTH,1);
        for (int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }

        for (int i = 1 ; i<=c.getActualMaximum(Calendar.DATE) ; i++){
            System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
            if (c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                Out.out();
            }
            c.add(Calendar.DAY_OF_MONTH,1);
        }
        Out.out();
    }

    public void calendar2(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date date = null;
        try {
            date = df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar c = new GregorianCalendar();
        c.setTime(date);

        int day = c.get(Calendar.DAY_OF_MONTH);     //保存 当前天数。
        int days = c.getActualMaximum(Calendar.DATE);   //获取这个月的最大天数。

        Out.out("日\t一\t二\t三\t四\t五\t六\t");
        c.set(Calendar.DAY_OF_MONTH,1);
        for (int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
            System.out.print("\t");
        }

        for (int i = 1 ; i<=days ; i++){
            if (day == c.get(Calendar.DAY_OF_MONTH)){
                System.out.print("** "+c.get(Calendar.DAY_OF_MONTH) + " **\t");
            }else {
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
            }

            if (c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                Out.out();
            }
            c.add(Calendar.DAY_OF_MONTH,1);
        }
    }
}
