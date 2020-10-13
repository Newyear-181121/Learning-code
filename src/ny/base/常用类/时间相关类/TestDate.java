package ny.base.常用类.时间相关类;

import ny.base.常用类.myUtil.Out;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @auther: NewYear
 * @Date: 2020-10-13 14:26
 * @version: 0.0.1
 * @description: TestDate
 */
public class TestDate {

    Date d; // 成员变量声明后，在类中到处都可以使用， 但是如果不赋值就调用该对象的方法，就会报空指针异常。

    public static void main(String[] args) {
        TestDate td = new TestDate();

        td.test1();
        try {
            td.calendar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1(){
        d = new Date();

        Out.out(d);
        Out.out(d.getTime());
    }


    public void calendar() throws Exception{

    }
}
