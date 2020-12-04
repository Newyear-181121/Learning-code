package ny.base.net.tcp.talk;

import ny.base.常用类.myUtil.Out;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther: NewYear
 * @Date: 2020-12-04 13:36
 * @version: 0.0.1
 * @description: TalkReceive
 */
public class TalkReceive implements Runnable {


    private ServerSocket server;
    private Socket socket;

    public TalkReceive(int serverPort) {
        try {
            server = new ServerSocket(serverPort);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void receive(){
        DataInputStream dis = null;
        String data = null;
        while(true) {

            try {
                socket = server.accept();
                dis = new DataInputStream(socket.getInputStream());
                data = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Out.out(data);
            if (data.equals("quit")| data.equals("exit")){
                break;
            }

        }

        try {
            if (dis != null) dis.close();
            if (socket != null ) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

    }
}
