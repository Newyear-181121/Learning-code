package ny.base.net.tcp.服务器聊天室;

import java.io.Closeable;
import java.io.IOException;

/**
 * @auther: NewYear
 * @Date: 2020-12-08 10:13
 * @version: 0.0.1
 * @description: Util
 */
public class Util {
    /**
     * 释放资源
     * @param targets
     */
    public static void close(Closeable... targets){
        for(Closeable target : targets){
            try {
                if (null != targets) {
                    target.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
