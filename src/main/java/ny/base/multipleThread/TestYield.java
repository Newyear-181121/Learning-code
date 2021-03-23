package ny.base.multipleThread;

import ny.base.常用类.myUtil.Out;

import static java.lang.Thread.yield;

/**
 * @auther: NewYear
 * @Date: 2020-11-30 14:49
 * @version: 0.0.1
 * @description: TestYield yield  礼让线程，暂停线程，直接进入就绪状态。
 */
public class TestYield {

    public static void main(String[] args) {
        Yield y = new Yield();
        new Thread(y,"one").start();
        new Thread(y,"two").start();
    }



}

class Yield implements Runnable{

    @Override
    public void run()  {
        Out.out(Thread.currentThread().getName(),"  start");
        yield();
        Out.out(Thread.currentThread().getName(),"   end");
    }
}
