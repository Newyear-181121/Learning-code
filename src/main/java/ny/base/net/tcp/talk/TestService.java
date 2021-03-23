package ny.base.net.tcp.talk;

import multiplethread.Utils;
import ny.base.常用类.myUtil.Out;
import org.junit.Test;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 14:10
 * @version: 0.0.1
 * @description: TestService
 *
 *  测试成功
 */
public class TestService {
    public static void main(String[] args) {
        TestService s = new TestService();

        //s.test02();
        //s.test03();

        s.test04();
    }


    /**
     * 多线程控制台socket交互
     * service 端。
     * 需要启动对应的 client端 才行
     */
    public void test01(){
        Service service = new Service(9999);

        Thread tr = new Thread(() -> {
            service.receiveOnConsole();
        });
        Thread ts = new Thread(() -> {
            service.sendOnConsole();
        });

        tr.start();
        ts.start();
    }

    public void test02(){
        Service service = new Service(9998);


        String str = service.receive();
        Out.out(str);

        Utils.sysSleep();
        String data = "service success";
        service.send(data);


    }

    public void test03() {
        Service service = new Service(9997);

        //service.receiveFile("D:/demo/words_socket_receive.txt");

        service.sendFile("D:/demo/words.txt");

        service.close();
    }

    /**
     * service 可以接收多个客户端连接,这个测试失败。
     */
    public void test04(){
        Service service = new Service(9996,true);
    }
}
