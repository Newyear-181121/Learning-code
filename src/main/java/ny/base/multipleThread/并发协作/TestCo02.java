package ny.base.multipleThread.并发协作;

import ny.base.常用类.myUtil.Out;

/**
 * 协作模型：生产者消费者实现方式一：信号等法
 *      借助标志位
 * @auther: NewYear
 * @Date: 2020-12-02 15:25
 * @version: 0.0.1
 * @description: TestCo
 */
public class TestCo02 {

    public static void main(String[] args) {
        TV tv = new TV();
        new Productor02(tv).start();
        new Consumer02(tv).start();
    }
}

/**
 * 三个个角色
 * 多线程 生产者
 * 多线程 消费者
 * 标志位  指示器
 */

/**
 * 多线程生产者
 */
class Productor02 extends Thread{
    TV tv;
    public Productor02(TV tv) {
        this.tv = tv;
    }

    /**
     * 生产
     */
    public void run(){
        for (int i = 0 ; i < 1000; i++){
            Out.out("生产者要生产第-->"+i+"个数据了");
            tv.play("好看的东东");
        }
    }
}

/**
 * 多线程消费者
 */
class Consumer02 extends Thread{
    TV tv;
    public Consumer02(TV tv) {
        this.tv = tv;
    }

    /**
     * 消费
     */
    public void run(){
        for (int i = 0 ; i < 1000; i++){
            Out.out("消费者想要消费了");
            tv.watch();
        }
    }
}

/**
 * 标志位所在的类
 *  也就是资源类。
 */
class TV{
    String view;

    //信号灯  // 标示位
    boolean flag = true;
    /* 标志位默认为真的时候 生产者生产  不为真则等待。
     * 标志位为假的时候 消费者等待
     *
     */

    /**
     * 生产者
     * 生产
     */
    public synchronized void play(String view){
        if (!flag){  // 标志位为真的时候 生产者等待
            Out.out("生产者生产了一个数据，想把数据放到标志器来，但是不行，标示符是false,必须等待消费者消费之前的数据");
            Utils.myWait(this);
            Out.out("生产者 等待结束，继续生产");
        }
        Out.out("生产者生产了，同时可以传入参数：",view);
        this.view = view;   // 把参数放到标示器所在的类中来了。
        Out.out("生产完毕，马上通知消费");

        this.notifyAll();    // 生产者生产后 通知消费者 可以消费了
        this.flag = !this.flag;     //转换标志位
    }

    public synchronized void watch(){
        if (flag){  // 标志位为假的时候 消费者等待
            Out.out("想消费也没有用，标志位是true，此时生产者在生产，无法消费，要扽生产者通知后才能消费");
            Utils.myWait(this);
            Out.out("消费者等待结束，马上要消费了。");
        }
        Out.out("消费者正在消费中，","消费的数据是："+this.view);

        this.flag = !this.flag;     //转换标志位
        this.notifyAll();    // 消费者消费完后 通知生产者 可以生产了
    }

}

