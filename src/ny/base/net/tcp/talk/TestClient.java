package ny.base.net.tcp.talk;

import multiplethread.Utils;
import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 14:10
 * @version: 0.0.1
 * @description: TestClient
 *
 *  测试成功。
 */
public class TestClient {

    public static void main(String[] args) {
        TestClient c = new TestClient();
        //c.test02();

        c.test03();

    }

    /**
     *多线程控制台socket交互
     *  client端
     *  需要启动对应的 service 才行
     */
    public void test01() {
        Client client = new Client(9999);

        Thread tr = new Thread(() -> {
            client.sendOnConsole();
        });
        Thread ts = new Thread(() -> {
            client.receiveOnConsole();
        });

        tr.start();
        ts.start();
    }


    /**
     * 测试
     */
    public void test02(){
        Client client = new Client(9998);


        String str = "client success";    //这个发送字符串只能发送一次
        client.send(str);

        Utils.sysSleep();
        String data = client.receive();
        Out.out(data);
    }


    public void test03(){
        Client client = new Client(9997);

        //client.sendFile("D:/demo/words.txt");

        client.receiveFile("D:/demo/words_client_receice.txt");

        client.close();
    }
}
