package ny.base.net.tcp.服务器聊天室;

import ny.base.常用类.myUtil.Out;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 21:07
 * @version: 0.0.1
 * @description: Receive
 */
public class Receive implements Runnable{
    private Socket socket;
    private DataInputStream dis;
    private boolean isRunning = true;

    public Receive(Socket socket){
        this.socket = socket;
        try {
            this.dis = new DataInputStream(socket.getInputStream());
        } catch (UnknownHostException e){
            e.printStackTrace();
            Out.out("socket 建立失败，不是道这个主机名是啥");
        } catch (IOException e) {
            close();
            Out.out("声明时发生异常");

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

    public void close(){
        this.isRunning = false;
        Util.close(dis,socket);
    }

    @Override
    public void run() {
        while(isRunning) {
            Out.out(receive());
        }
    }
}
