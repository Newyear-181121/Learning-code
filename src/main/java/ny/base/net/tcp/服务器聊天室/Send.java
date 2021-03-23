package ny.base.net.tcp.服务器聊天室;

import ny.base.常用类.myUtil.Out;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 21:07
 * @version: 0.0.1
 * @description: Send
 */
public class Send implements Runnable{
    private Socket socket;
    private DataOutputStream dos;
    private boolean isRunning = true;

    public Send(Socket socket){
        this.socket = socket;
        try {
            this.dos = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException e){
            e.printStackTrace();
            Out.out("socket 建立失败，不是道这个主机名是啥");
        } catch (IOException e) {
            close();
            Out.out("声明时发生异常");
        }
    }

    /**
     * 发送 字符串到套接字
     * @param str 需要发送的字符串
     */
    public void send(String str){
        try {
            dos.writeUTF(str);
            dos.flush();        // 刷新输出流，把缓冲流中的字符强制输出到流中。
        } catch (IOException e) {
            close();
            Out.out("发送信息时发生异常");
        }
    }

    public String getOnConsloe(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = null;
        try {
            data = reader.readLine(); // 从缓冲流中读取一行数据。
        } catch (IOException e) {
            close();
            Out.out("获取控制台消息时发生异常");
        }
        return data;
    }

    public void close(){
        this.isRunning = false;
        Util.close(dos,socket);
    }

    @Override
    public void run() {
        while(isRunning) {
            send(getOnConsloe());
        }
    }
}
