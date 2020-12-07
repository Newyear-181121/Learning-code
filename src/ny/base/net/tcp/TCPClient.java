package ny.base.net.tcp;

import ny.base.net.tcp.talk.Client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * 简单流程
 * 1 建立连接： 使用Socket 创建客户端   服务器的地址和端口
 * 2 操作 输入输出流操作
 * 3 释放资源
 *
 * @auther: NewYear
 * @Date: 2020-12-04 10:45
 * @version: 0.0.1
 * @description: TCPClient
 */
public class TCPClient {

    public static void main(String[] args) throws IOException {
        TCPClient client = new TCPClient();

        //client.client("localhost",8888);
        client.clientTalk("localhost",8888);


    }

    /**
     *  tcp 基本流程
     * @param hostname
     * @param hostport
     * @throws IOException
     */
    public void client(String hostname,int hostport) throws IOException {
        Socket client = new Socket(hostname,hostport);

        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        String data = "hello";

        dos.writeUTF(data);

        dos.flush();

        dos.close();
        client.close();

    }

    /**
     * tcp 多次单向输入
     * @param hostname
     * @param hostport
     * @throws IOException
     */
    public void clientTalk(String hostname,int hostport) throws IOException {
        Socket client = new Socket(hostname,hostport);      //声明套接字
        DataOutputStream dos = new DataOutputStream(client.getOutputStream()); // 声明套接字数据输出流

        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // 从控制台获取数据
            String data = reader.readLine();

            dos.writeUTF(data); // 把控制台获取到的数据输入到 套接字。
            dos.flush();
            if (data.equals("quit") | data.equals("exit")){
                break;
            }
        }
        dos.close();
        client.close();
    }



}
