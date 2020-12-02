package ny.base.multipleThread.定时调度;

import ny.base.常用类.myUtil.Now;
import ny.base.常用类.myUtil.Out;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @auther: NewYear
 * @Date: 2020/12/2 23:11
 * @version: 0.0.1
 * @function:
 * @description: TestTimer
 */
public class TestTimer {
    public static void main(String[] args) {
        Timer t = new Timer();
        //执行安排
        Out.outNow();
        t.schedule(new MyTime(),5000);
    }

}

class MyTime extends TimerTask{
    @Override
    public void run() {
        Out.outNow();
        Out.out("定时任务执行的内容。");
    }
}
