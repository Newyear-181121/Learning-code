package ny.base.net.tcp.服务器聊天室;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 20:06
 * @version: 0.0.1
 * @description: Client
 */
public class Client {
    private Socket socket;

    public Client(String hostname,int port) {
        try {
            this.socket = new Socket(hostname,port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Client(int port) {
        this("localhost",port);
    }

    public void talk(){
        new Thread(new Send(socket)).start();
        new Thread(new Receive(socket)).start();
    }


}
