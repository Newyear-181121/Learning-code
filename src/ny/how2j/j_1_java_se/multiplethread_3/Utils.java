package multiplethread_3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: NewYear
 * @Date: 2020-12-01 10:04
 * @version: 0.0.1
 * @description: Utils  工具类，同一个包下的工具类。
 */
public class Utils {
    public static String now() {
        return new SimpleDateFormat("HH:mm:ss   ").format(new Date());		//返回时间，当前时间
    }

    /**
     * 使用系统的sleep 方法。
     * 这里就是把 try catch 封装了一下。
     * @param millis
     */
    public static void sysSleep(int millis){
        try {
            Thread.sleep(millis);		//这里是暂停1000毫秒的意思
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 暂停 1000 毫秒
     */
    public static void sysSleep(){
        sysSleep(1000);
    }
}
