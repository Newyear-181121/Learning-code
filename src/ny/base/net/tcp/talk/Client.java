package ny.base.net.tcp.talk;

import ny.base.常用类.myUtil.Out;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @auther: NewYear
 * @Date: 2020-12-04 13:36
 * @version: 0.0.1
 * @description: Client
 *
 *      1. 创建一个socket
 *      2. 建立数据输入输出流
 *      3. 使用数据流 发送接收数据
 *
 *      client 本身不监听端口，只向已监听的端口发送信息建立新连接。
 */
public class Client {

    private Socket socket;  // 套接字连接
    private DataOutputStream dos; // 数据输入流
    private DataInputStream dis;

    /**
     * 构造函数，生成一个 向指定主机的指定端口 建立的一个tcp 连接
     * @param hostname 指定主机名
     * @param hostport 指定端口号
     */
    public Client(String hostname, int hostport) {
        try {
            this.socket = new Socket(hostname, hostport);
            this.dos = new DataOutputStream(socket.getOutputStream());
            this.dis = new DataInputStream(socket.getInputStream());
        } catch (UnknownHostException e){
            e.printStackTrace();
            Out.out("socket 建立失败，不是道这个主机名是啥");
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    /**
     *  构造
     * @param localhostport 本机server端监听的端口。
     */
    public Client(int localhostport){
        this("localhost",localhostport);
    }


    //-------------------------------------------------------------------------------- socket & Console


    /**
     * 向socket 连接发送控制台的数据
     * 可以持续发送，连接不会断开。
     */
    public void sendOnConsole() {
        /* 一个套接字只需要一个流 */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // 从控制台获取数据
        String data = null;
        try {
            while (true) {
                data = reader.readLine(); // 从缓冲流中读取一行数据。
                dos.writeUTF(data); // 把控制台获取到的数据输入到 套接字。
                dos.flush();        // 刷新输出流，把缓冲流中的字符强制输出到流中。
                if (data.equals("quit") | data.equals("exit")) {
                    break;
                }
            }
            if (dos != null) dos.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *  把socket 中的数据流写出到控制台
     */
    public void receiveOnConsole(){
        String data = null;
        try {
            while(true) {
                data = dis.readUTF();
                Out.out(data);
                if (data.equals("quit") | data.equals("exit")) {
                    break;
                }
            }
            if (dis != null) dis.close();
            if (socket != null ) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-------------------------------------------------------------------------------- socket & String

    /**
     * 发送 字符串到套接字
     * @param str 需要发送的字符串
     */
    public void send(String str){
        try {
            dos.writeUTF(str);
            dos.flush();        // 刷新输出流，把缓冲流中的字符强制输出到流中。
        } catch (IOException e) {
            e.printStackTrace();
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
            e.printStackTrace();
        }
        return data;
    }


    //-------------------------------------------------------------------------------- socket & File

    /**
     * 发送文件到套接字
     * @param filename  要发送的文件的路径
     */
    public void sendFile(String filename){
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(filename));

            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                dos.write(flush, 0, len);    // 从文件输入流写到 socket 输出流。
                /**
                 *
                 * 流方向： 文件是对象，文件输入流，就是从文件输入到程序内存
                 *          socket是对象，socket输出流， 就是从程序内从输出到 socket。
                 */
            }
            dos.flush();

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从 socket 读取文件  到指定路径。
     * @param filename 文件要保存的路径。
     */
    public void receiveFile(String filename) {
        try {
            OutputStream os = new BufferedOutputStream(new FileOutputStream(filename));
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = dis.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-------------------------------------------------------------------------------------------- close
    /**
     * 关掉创建的连接
     */
    public void close(){
        try{
            if (dis != null) dis.close();
            if (dos != null) dos.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
