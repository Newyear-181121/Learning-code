package ny.base.multipleThread;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-30 15:51
 * @version: 0.0.1
 * @description: TestJoin  线程合并
 */
public class TestJoin {



    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for(int i = 0 ; i<100;i++) {
                Out.out(Thread.currentThread().getName() + " lamdba...");
            }
        });
        t.start();
        for(int i = 0 ; i<100;i++) {
            if (i == 50){
                t.join(); // 把线程 t 插入到 main方法中来。
            }
            Out.out(Thread.currentThread().getName() + " main...");
        }

    }

}
