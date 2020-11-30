package multiplethread;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020/11/30 23:15
 * @version: 0.0.1
 * @function:
 * @description: Utils  工具类
 */
public class Utils {

    /**
     * 自定义延时方法。
     *      就是执行个循环而已。
     */
    public static void mySleep(){
        mySleep(50);
    }

    public static void mySleep(int x){
        if (x <= 0 ){
            //new RuntimeException("暂停时间有问题，太小了。");
            // 如果使用 异常的方式，时候的时候都要进行异常处理，会比较麻烦。
            Out.out("暂停时间太短了。");
        }
        while (x>0){
            System.out.println(x);
            x--;
        }
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
