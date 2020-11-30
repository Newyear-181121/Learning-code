package ny.base.multipleThread;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-30 16:12
 * @version: 0.0.1
 * @description: TestState  线程的状态
 */
public class TestState {


    public static void main(String[] args) {

        Thread.State state ;

        Thread t = new Thread(() -> {
            for(int i = 0 ; i < 10; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Out.out("线程在运行");

        });
        state = t.getState();
        Out.out("创建线程后的状态:",state);  //NEW

        t.start();
        state = t.getState();
        Out.out("start()线程后的状态:",state);    //RUNNABLE

        while (state != Thread.State.TERMINATED){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = t.getState();
            Out.out(state);    //TIMED_WAITING
        }

        state = t.getState();
        Out.out(state);         //TERMINATED
    }

}
