package ny.base.multipleThread;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-27 15:02
 * @version: 0.0.1
 * @description: LambdaThread   Lambda 表达式可以用来简化使用一次的 的线程方法
 *
 * @see () 其他的Lambda 例子
 */
public class LambdaThread  {

    /**
     * 静态内部类
     *  好处，不使用不会编译，使用才会编译。
     */
    static class Thread01 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                Out.out("静态内部类----线程实现Runnable接口", i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Thread01()).start();  // 之前使用多线程的时候用的是外部类而已                001


        /**
         * 局部内部类
         */
        class Thread02 implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Out.out("局部内部类++++线程实现Runnable接口", i);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        new Thread(new Thread02()).start();     //                                              002

        /**
         * 匿名内部类  声明必须借助接口或父类
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Out.out("匿名内部类****线程实现Runnable接口", i);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start(); //                                                                          003

        /**
         * jdk1.8 开始 的 Lambda
         */
        new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    Out.out("lambda++++线程实现Runnable接口", i);
                }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }).start();     //                                                                  004






    }



}
