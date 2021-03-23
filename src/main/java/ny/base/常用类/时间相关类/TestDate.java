package ny.base.常用类.时间相关类;


import org.junit.jupiter.api.Test;
import java.util.Date;

/**
 *    常用类 DATE
 *
 * @auther: NewYear
 * @Date: 2020-10-13 14:26
 * @version: 0.0.1
 * @description: TestDate
 */
public class TestDate {
    Date now ;

    /**
     * 打印输出当前时间
     */
    @Test
    public void outNow(){

        //注意：是java.util.Date;
        //而非 java.sql.Date，此类是给数据库访问的时候使用的
        now= new Date();

        //打印当前时间
        System.out.println("当前时间:"+now.toString());

        //getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
        System.out.println("当前时间getTime()返回的值是："+now.getTime());


        //通过System.currentTimeMillis()获取当前日期的毫秒数
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());

    }

    /**
     * 构造函数测试，  构造函数传入一个参数，则表示构造一个从标准时间经历了多少毫秒数的时间。
     */
    @Test
    public void test01(){

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的时间日期(标准时间)是:"+zero);

        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间"+d2);
    }
}
