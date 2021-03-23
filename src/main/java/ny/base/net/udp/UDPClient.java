package ny.base.net.udp;

import ny.base.net.udp.talk.TalkReceive;
import ny.base.net.udp.talk.TalkSend;
import ny.base.常用类.myUtil.Out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 *
 * 基本流程： 发送端
 *  1. 使用DatagramSocket 指定端口 创建发送端
 *  2. 准备数据 一定转成字节数组
 *  3. 封装成DatagramPacket 包，需要指定目的地
 *  4. 发送包 send (DatagramPacket p)
 *  5. 释放资源
 *
 * @auther: NewYear
 * @Date: 2020-12-04 8:58
 * @version: 0.0.1
 * @description: UDPClient
 */
public class UDPClient {

    public static void main(String[] args) throws IOException{
        UDPClient client = new UDPClient();

        // 简单流程
        //String data = "想要发送什么数据，就发送什么数据";
        //client.client(8888,"localhost",6666,data);

        // 多次交流
        //client.clientTalk(8888,"localhost",6666);

        // 多线程交流
        client.talk();
    }

    /**
     * 启动一个简单的udp客户端
     * @param clientPort 客户端端口
     * @param hostname 服务端主机名
     * @param hostport 接收方端口
     * @param data  要发送的字符串
     * @throws IOException
     */
    public void client(int clientPort,String hostname,int hostport,String data) throws IOException {
        Out.out("发送方启动");
        //1
        DatagramSocket client = new DatagramSocket(clientPort);
        //2
        byte[] datas = data.getBytes();
        //3
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(hostname,hostport));
        // 4
        client.send(packet);
        // 5
        client.close();
    }


    /**
     * 多次发送数据，从控制台输入
     * @param clientPort
     * @param hostname
     * @param hostport
     * @throws IOException
     */
    public void clientTalk(int clientPort,String hostname,int hostport) throws IOException {
        Out.out("发送方启动");
        //1
        DatagramSocket client = new DatagramSocket(clientPort); // 声明一个套接字
        //2
        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            //3
            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(hostname, hostport));
            // 4
            client.send(packet);
            if (data.equals("quit")){
                break;
            }
        }
        // 5
        client.close();
    }


    /**
     * 使用多线程进行双向交流
     */
    public void talk(){
        new Thread(new TalkSend(7777,"localhost",8889)).start();    // 发送线程
        new Thread(new TalkReceive(8890)).start();  // 接收线程
    }

}
