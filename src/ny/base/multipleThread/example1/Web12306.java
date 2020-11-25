package ny.base.multipleThread.example1;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-25 23:14
 * @version: 0.0.1
 * @description: Web12306
 */
public class Web12306 implements Runnable{

    private int ticketNums = 99;

    @Override
    public void run() {
        while(true){
            if (ticketNums < 0 ){
                break;
            }
            Out.out(Thread.currentThread().getName()+"---->"+ticketNums--);
        }
    }

    public static void main(String[] args) {
        // 一份资源多个代理
        Web12306 web = new Web12306();
        Out.out(Thread.currentThread().getName());

        new Thread(web,"001").start();
        new Thread(web,"002").start();
        new Thread(web,"003").start();
    }
}
