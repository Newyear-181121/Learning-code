package ny.base.multipleThread;

import ny.base.常用类.myUtil.Out;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: NewYear
 * @Date: 2020-11-30 13:51
 * @version: 0.0.1
 * @description: TestTerminateThread  提供方法，外部控制线程的运行状态。
 *      终止线程 ：
 *      1. 线程正常执行完毕。
 *      2. 外部干涉 --> 加入标志位
 *          不要使用 stop destroy
 */
public class TestTerminateThread implements Runnable {

    // 1.  加入标识，标记线程是否可以运行
    private boolean flag = true;

    private String name ;

    public String nows(){
        return new SimpleDateFormat("mm:ss:").format(new Date(System.currentTimeMillis()));
    }


    public TestTerminateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0 ;
        // 2.  关联标识符
        while(flag){
            Out.out(name + "线程运行中： " + i++ + "  "+ nows());
        }
    }

    /**
     *  对外提供方法 改变标识符
     */
    public void terminater(){
        flag = false;
    }

    public static void main(String[] args) {
        TestTerminateThread t = new TestTerminateThread("终止线程");
        new Thread(t).start();

        for (int i = 0 ; i< 1000 ; i++){
            if(i == 600){
                t.terminater();// 外部控制线程终止了。
                Out.out("线程终止了。");
                break;
            }
            Out.out("外部循环的变量："+ i+ "  "+ t.nows());
        }
    }
}
