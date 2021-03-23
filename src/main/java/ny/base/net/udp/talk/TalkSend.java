package ny.base.net.udp.talk;

import ny.base.常用类.myUtil.Out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 *
 *  发送端：发送线程
 *      从控制台接收字符串
 *         向指定客户端的指定端口发送 字符串。
 *
 * @auther: NewYear
 * @Date: 2020-12-04 9:54
 * @version: 0.0.1
 * @description: TalkSend
 */
public class TalkSend implements Runnable {

    private DatagramSocket client;
    private BufferedReader reader;
    private String hostname;
    private int hostport;

    public TalkSend(int clientPort,String hostname,int hostport) {
        this.hostname = hostname;
        this.hostport = hostport;
        try {
            this.client = new DatagramSocket(clientPort);
            this.reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
            Out.out("创建套接字异常");
        }
    }

    public void send(){
        while(true) {
            try {
                String data = reader.readLine();
                byte[] datas = data.getBytes();
                //3
                DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(this.hostname, this.hostport));
                // 4
                client.send(packet);
                if (data.equals("quit")) {
                    break;
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        client.close();
    }

    @Override
    public void run() {
        send();
    }
}
