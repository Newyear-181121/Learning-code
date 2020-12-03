package ny.设计模式.单例模式;

import multiplethread.Utils;
import ny.base.常用类.myUtil.Out;

/**
 *  单例模式： 在懒汉式套路基础上加上并发控制，保证在多线程环境下，对外只提供一个对象。
 *      1. 构造器私有化 --> 避免外部new构造器
 *      2. 提供私有 的静态属性 --> 存储对象的地址
 *      3. 提供公共静态方法 --> 获取属性
 *
 * @auther: NewYear
 * @Date: 2020-12-03 13:29
 * @version: 0.0.1
 * @description: DoubleCheckedLock
 */
public class DoubleCheckedLock {

    // 2. 提供私有静态方法，这里没有直接创建对象，就是懒汉式
    // 没有 volatile 时，其他线程可能会访问一个没有初始化的对象。（及初始化还未完成，就返回了一个引用。）
    private static volatile DoubleCheckedLock instance;  // 4. 添加 volatile 关键字避免指令重排

    // 1. 私有化构造器，只有自己能创建自己的对象。
    private DoubleCheckedLock() {
    }

    /**
     * 3.
     */
    public static DoubleCheckedLock getInstance(){
        // 3.3 双重检测，保证有对象时，不会花费多余的时间，等待锁的释放。
        if (null != instance){      // 避免不必要的同步，已经存在对象
            return instance;
        }
        /**
         *  3.2 保证线程安全
         *      没有对象的时候要在线程安全的情况下创建对象。
         */
        synchronized(DoubleCheckedLock.class) {
            // 3.1 什么时候创建对象
            if (null == instance) {
                instance = new DoubleCheckedLock();
                // new 一个对象的时候 会发生三件事情。
                /*1.开辟空间 2.初始化对象信息 3.返回对象的地址给引用  */
                // 在这三步执行的时候可能会发生指令重排，为了避免这种请款，要给这个对象添加 volatile 关键字修饰
            }
        }
        return instance;
    }

    /**
     * 没有实现安全措施的情况
     * @param time 模拟延时的时间
     * @return 实例对象。
     */
    public static DoubleCheckedLock getInstance01(int time){

            if (null == instance) {
                Utils.sysSleep(time);   // 结果：当一个线程在这里延时的时候，另一个线程，获取到的 instance 值 还是空，也会通过判断进入到这里来。
                instance = new DoubleCheckedLock();
            }
        return instance;
    }

    public static void main(String[] args) {


        test();     // 同时只能执行一个方法，可以看出差别。
    }
    public static void test(){
        Thread t = new Thread(() -> {
            Out.out(DoubleCheckedLock.getInstance());
        });
        t.start();
        Out.out(DoubleCheckedLock.getInstance());
    }

    public static void test01(){
        Thread t = new Thread(() -> {
            Out.out(DoubleCheckedLock.getInstance01(500));
        });
        t.start();
        Out.out(DoubleCheckedLock.getInstance01(1000));
    }
}
