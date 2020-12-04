package ny.base.net.udp;

import ny.base.常用类.myUtil.Out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

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

        //String data = "想要发送什么数据，就发送什么数据";
        //client.client(8888,"localhost",6666,data);

        client.clientTalk(8888,"localhost",6666);
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

}
