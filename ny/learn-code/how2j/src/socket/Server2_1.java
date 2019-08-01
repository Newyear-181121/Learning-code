package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 建立连接 
 * @author New year
 *
 *1. 服务端开启8888端口，并监听着，时刻等待着客户端的连接请求 
 *2. 客户端知道服务端的ip地址和监听端口号，发出请求到服务端 
 *客户端的端口地址是系统分配的，通常都会大于1024 
 *一旦建立了连接，服务端会得到一个新的Socket对象，该对象负责与客户端进行通信。 
 *注意： 在开发调试的过程中，如果修改过了服务器Server代码，要关闭启动的Server,否则新的Server不能启动，因为8888端口被占用了 
 */
public class Server2_1 {

	public static void main(String[] args) {

		try {
			//服务端打开端口8888
			ServerSocket ss = new ServerSocket(8888);
			
			//在8888端口上监听，看是否有连接请求过来
			System.out.println("监听在端口号:8888");
			Socket s = ss.accept();
			
			System.out.println("有连接过来" + s);
			
			s.close();
			ss.close();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}

}
