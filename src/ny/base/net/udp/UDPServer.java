package ny.base.net.udp;

import ny.base.常用类.myUtil.Out;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * 基本流程： 接收端
 *  1. 使用DatagramSocket 指定端口 创建接收端
 *  2. 准备容器 封装成DatagramPacket 包
 *  3. 阻塞式接收包裹 (receive（DatagramPacket p)
 *  4. 分析数据
 *      byte[] getData()
 *             getLength()
 *  5. 释放资源
 *
 *
 * @auther: NewYear
 * @Date: 2020-12-04 8:57
 * @version: 0.0.1
 * @description: UDPServer
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        UDPServer server = new UDPServer();
        server.server(6666);
    }


    /**
     * 启动一个简单的udp服务端
     * @param serverPort    接收方端口
     * @throws IOException
     */
    public void server(int serverPort) throws IOException{
        Out.out("接收方启动");
        //1
        DatagramSocket server = new DatagramSocket(serverPort);
        // 2.
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        //3.
        server.receive(packet);// 阻塞式
        //4.
        byte[] datas = packet.getData();
        int len = packet.getLength();
        Out.out(new String(datas,0,len));
        //5
        server.close();
    }
}
