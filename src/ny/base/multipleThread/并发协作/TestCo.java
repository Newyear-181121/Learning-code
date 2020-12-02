package ny.base.multipleThread.并发协作;

import ny.base.常用类.myUtil.Out;

/**
 * 协作模型：生产者消费者实现方式一：管程法
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
        for (int i = 0 ; i < 100; i++){
            Out.out("生产-->"+i+"个数据");
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
            Out.out("消费-->"+container.pop().id +"个数据");
            container.pop();
        }
    }
}

/**
 * 缓冲区
 */
class SynContainer{
    Date[] dates = new Date[50];  // 存储数据的容器
    int count = 0 ; // 计数器

    /**
     * 生产者 存数据
     * 生产
     */
    public synchronized void push(Date date){
        dates[count] = date;
        count++;
    }

    public synchronized Date pop(){
        count--;
        return dates[count];
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