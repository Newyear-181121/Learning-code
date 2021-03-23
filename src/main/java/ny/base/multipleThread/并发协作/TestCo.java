package ny.base.multipleThread.并发协作;

import ny.base.常用类.myUtil.Out;

/**
 * 协作模型：生产者消费者实现方式一：管程法
 *      借助缓冲区
 * @auther: NewYear
 * @Date: 2020-12-02 15:25
 * @version: 0.0.1
 * @description: TestCo
 */
public class TestCo {

    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();
    }
}

/**
 * 四个角色
 * 多线程生产者
 * 多线程消费者
 * 缓冲区
 * 数据
 */

/**
 * 多线程生产者
 */
class Productor extends Thread{
    SynContainer container;
    public Productor(SynContainer container) {
        this.container = container;
    }

    /**
     * 生产
     */
    public void run(){
        for (int i = 0 ; i < 1000; i++){
            Out.out("生产第-->"+i+"个数据，此时容器容量是："+container.count);
            container.push(new Date(i));
        }
    }
}

/**
 * 多线程消费者
 */
class Consumer extends Thread{
    SynContainer container;
    public Consumer(SynContainer container) {
        this.container = container;
    }

    /**
     * 消费
     */
    public void run(){
        for (int i = 0 ; i < 1000; i++){
            Out.out("消费第-->"+container.pop().id +"个数据，此时容器容量是："+container.count);
            container.pop();
        }
    }
}

/**
 * 缓冲区
 */
class SynContainer{
    Date[] dates = new Date[10];  // 存储数据的容器
    int count = 0 ; // 计数器

    /**
     * 生产者 存数据
     * 生产
     */
    public synchronized void push(Date date){
        // 1. 何时生产 判断容器中是否有空间
        // 2.1 没有空间 不能生产
        if(count == dates.length){
            Utils.myWait(this); // 线程阻塞  消费者通知生产解除阻塞
        }
        // 2.2 存在空间 可以生产
        dates[count] = date;
        count++;
        this.notifyAll();       //生产数据后通知 消费者可以消费数据了。
    }

    public synchronized Date pop(){
        // 1. 何时消费 判断容器中是否有数据。
        // 2.1 没有数据  只能等待
        if (count == 0){
            Utils.myWait(this); // 线程阻塞  生产者通知消费解除阻塞
        }
        count--;
        Date date = dates[count];
        this.notifyAll();       // 消费数据后通知 生产者可以生产数据了。
        return date;
    }

}

/**
 * 数据
 */
class Date{
    int id;

    public Date(int id) {
        this.id = id;
    }
}