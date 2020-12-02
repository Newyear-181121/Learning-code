package ny.base.常用类.myUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: NewYear
 * @Date: 2020/12/2 23:15
 * @version: 0.0.1
 * @function:
 * @description: Now
 */
public class Now {
    /**
     * 返回现在的时间
     * @return
     */
    public static String now() {
        return new SimpleDateFormat("HH:mm:ss   ").format(new Date());
    }
}
