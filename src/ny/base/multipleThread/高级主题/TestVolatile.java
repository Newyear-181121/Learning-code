package ny.base.multipleThread.高级主题;

import multiplethread.Utils;
import ny.base.常用类.myUtil.Out;

/**
 *
 *      volatile  用于保证数据的同步，也就是可见性
 *
 *          不使用这个关键字的时候出现的 循环不会终止的异常情况是因为：
 *              主内存 和方法内存中的数据未同步。
 *
 *      volatile 可以避免指令重排。
 *      但是不保证原子性。
 *
 * @auther: NewYear
 * @Date: 2020-12-03 11:02
 * @version: 0.0.1
 * @description: TestVolatile
 */
public class TestVolatile {
    private static int num = 0 ;        // 不加 volatile  关键字修饰的时候 这个简单的循环不会结束的。
    public static void main(String[] args){
        new Thread(() -> {
            while(num == 0){        // 如果循环里面不写 循环会保持很久。
                // Out.out("test");
            }
        }).start();
        Utils.sysSleep(10);
        num = 1;
    }


}
