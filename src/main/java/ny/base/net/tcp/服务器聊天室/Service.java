package ny.base.net.tcp.服务器聊天室;

import ny.base.常用类.myUtil.Out;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 20:05
 * @version: 0.0.1
 * @description: Service
 */
public class Service {

    private boolean isRunning = true;
    private ServerSocket server;
    private Socket socket;

    private CopyOnWriteArrayList<Channel> allList = new CopyOnWriteArrayList<>();   //增加一个容器，保存所有声明的 数据管道

    public Service(int serverPort) {
        try {
            server = new ServerSocket(serverPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从监听的端口获取 socket 连接。
     * @return socket 连接
     */
    public Socket getsocket(){
        try {
            Out.out("在没有客户端连接的情况下，下面的方法会阻塞主线程，直到有client端来建立连接生成了新的socket连接");
            socket  =  this.server.accept();
            Out.out("生成了新的socket连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;
    }

    public void run(){
        while (isRunning){
            Socket csocket = getsocket();
            Channel channel = new Channel(csocket);
            allList.add(channel);
            new Thread(channel).start();
        }
    }



    /**
     * 内部类
     */
    public class Channel implements Runnable{

        private Socket socket;
        private boolean isRunning; // 循环是否停止
        private DataOutputStream dos;
        private DataInputStream dis;

        public Channel(Socket socket) {
            isRunning = true;
            this.socket = socket;
            try {
                dis = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                Out.out("创建资源的时候发生异常");
                close();
            }
        }

        /**
         * 发送 字符串到套接字
         * @param str 需要发送的字符串
         */
        public void send(String str){
            try {
                dos.writeUTF(str); // 把控制台获取到的数据输入到 套接字。
                dos.flush();        // 刷新输出流，把缓冲流中的字符强制输出到流中。
            } catch (IOException e) {
                close();
                Out.out("发送消息时发生异常");
            }
        }

        /**
         * 获取socket流中的字符串。
         * @return
         */
        public String receive(){
            String data = null;
            try {
                data = dis.readUTF();
            } catch (IOException e) {
                close();
                Out.out("接收消息时发生异常");
            }
            return data;
        }

        /**
         * 把消息发送给其他所有client
         * @param msg
         */
        public void sendOther(String msg){
            for (Channel other:allList){
                if (other == this){
                    continue;
                }
                other.send(msg);
            }
        }




        /**
         * 释放资源
         *  线程方法也要停止。
         */
        public void close(){
            this.isRunning = false;
            Util.close(dis,dos,socket);
        }


        @Override
        public void run() {
            while (isRunning){
                String msg = receive();
                send(msg);
                if (msg.equals("")){
                    sendOther(msg);
                }

            }
        }
    }

}
