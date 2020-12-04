package ny.base.net.udp.talk;

import ny.base.常用类.myUtil.Out;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 *  接收端：接收线程
 *      接收指定端口的数据。
 *
 * @auther: NewYear
 * @Date: 2020-12-04 9:54
 * @version: 0.0.1
 * @description: TalkReceive
 */
public class TalkReceive implements Runnable {


    private DatagramSocket server;

    public TalkReceive(int serverPort) {
        try {
            this.server = new DatagramSocket(serverPort);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    /**
     * 接收
     */
    public void receive(){
        while(true) {

            byte[] container = new byte[1024 * 60];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            try {
                server.receive(packet);// 阻塞式
                byte[] datas = packet.getData();
                int len = packet.getLength();
                String data = new String(datas, 0, len);
                Out.out(new String(data));
                if (data.equals("quit")) {
                    break;
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        //5
        server.close();
    }

    @Override
    public void run() {
        receive();
    }
}
