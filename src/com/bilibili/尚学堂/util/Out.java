package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义输出
 * 封装 输出。
 */
public class Out {
    public static void out(String str){
        System.out.println(str);
    }

    /**
     * 输出执行此方法的时间。
     */
    public static void time(){
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1str = simpleDateFormat.format(date1);
        System.out.println(date1str);
    }
}
