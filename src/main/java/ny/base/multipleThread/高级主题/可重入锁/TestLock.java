package ny.base.multipleThread.高级主题.可重入锁;

import multiplethread.Utils;
import ny.base.常用类.myUtil.Out;

/**
 *
 * 可重入锁，锁可以延续使用
 *
 * @auther: NewYear
 * @Date: 2020-12-03 14:06
 * @version: 0.0.1
 * @description: TestLock
 */
public class TestLock {

    public void test(){
        synchronized (this){    // 第一次获得锁
            while(true){
                synchronized (this){    // 第二次获得同样的锁
                    Out.out("锁重入了");
                }
                Utils.sysSleep();
            }
        }
    }

    public static void main(String[] args){
        new TestLock().test();
    }
}
