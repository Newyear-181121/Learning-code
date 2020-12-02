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
     * @param millis 休眠的毫秒数
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

    /**
     * 每过十毫秒 输出时间 并且不换行。
     */
    public static void outDaemo(){
        Thread thread = new Thread(){
            public void run(){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  :  ");
                while(true){
                    System.out.print(sdf.format(new Date()));
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        thread.setDaemon(true);	//设置成守护进程，其他程停止之后他会自动停止。
        thread.start();	// 这个线程就是后台输出时间。
    }


    /**
     * 设置守护线程，其它线程停止后他自动停止。
     * 每过十毫秒 输出时间 和 obj
     * @param obj 传入对象,最后使用的字符串
     */
    public static void outDaemo(Object obj){
        Thread thread = new Thread(){
            public void run(){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  :  ");
                while(true){
                    System.out.println(sdf.format(new Date())+obj);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        thread.setDaemon(true);
        thread.start();
    }

    /**
     * 把这个线程加到当前前程来。
     * @param t  这样没用。
     *
     *           这个方法没有效果。
     */
/*    public static void myJoin(Thread t){
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
*/


}
