package ny.base.multipleThread;

import multiplethread.KillThread;
import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-25 22:43
 * @version: 0.0.1
 * @description: TestThread
 *
 *      实现多线程的方式有三种：
 *          1. 继承 Thread 类  一般不建议使用这种方式，使用继承有局限性，java是单继承的。
 *          2. 实现 Runnable 接口  一般建议使用这种方式
 *          3. 实现 Callable 接口   用的不多。
 *
 *
 * @see (KillThread) 其他例子
 *
 */
public class TestThread extends Thread {

    @Override
    public void run() {
        Out.out("创建了一个新线程");
    }

    public static void main(String[] args) {
        TestThread tt = new TestThread();

        tt.start();  // 不保证新线程立即运行。  由CPU调用，，，

                     // start方法，告知调度器，你可以调度我了。
    }
}
