package ny.base.net.udp;

import ny.base.常用类.myUtil.Out;

import java.io.IOException;
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
        String data = "想要发送什么数据，就发送什么数据";
        client.client(8888,"localhost",6666,data);
    }

    /**
     * 启动一个加单的udp客户端
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

}
