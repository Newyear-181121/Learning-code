package ny.base.net.tcp;

import ny.base.常用类.myUtil.Out;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * 简单流程 ；
 *  1 指定端口 使用ServerSocket 创建服务器
 *  2 阻塞等待连接 accept
 *  3 操作 输入输出流操作
 *  4 释放资源
 *
 * @auther: NewYear
 * @Date: 2020-12-04 10:45
 * @version: 0.0.1
 * @description: TCPServer
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        TCPServer server = new TCPServer();

        //server.server(8888);
        //server.serverTalk(8888);

        server.talk();
    }


    /**
     * TCP 使用的基本流程
     * @param serverPort 服务端开启监听的端口。
     * @throws IOException
     */
    public void server(int serverPort) throws IOException {
        ServerSocket server = new ServerSocket(serverPort);
        Socket client = server.accept();
        Out.out("建立了一个客户端连接");

        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();
        Out.out(data);

        dis.close();
        client.close();
    }

    /**
     * rcp 多次 单向接收
     * @param serverPort
     * @throws IOException
     */
    public void serverTalk(int serverPort) throws IOException {
        ServerSocket server = new ServerSocket(serverPort);
        Socket client = server.accept();
        Out.out("建立了一个客户端连接");

        DataInputStream dis;
        dis = new DataInputStream(client.getInputStream());
        while(true) {
            String data = dis.readUTF();
            Out.out(data);
            if (data.equals("quit")| data.equals("exit")){
                break;
            }

        }
        dis.close();
        client.close();
    }

    /**
     * 使用多线程，tcp交互
     */
    public void talk(){
    }
}
