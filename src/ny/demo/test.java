package ny.demo;

import java.io.IOException;
import java.net.*;

/**
 * 监听指定端口
 */
public class test {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(5555,InetAddress.getByName("0.0.0.0"));
        byte[] buf = new byte[1024];
        DatagramPacket dp_receive = new DatagramPacket(buf, 1024);
        System.out.println("udp start listen on 5555");
        ds.receive(dp_receive);
        System.out.println("收到udp消息");
        System.out.println("客户端发送udp端口为" + dp_receive.getPort());
    }

    String s = "";
}
