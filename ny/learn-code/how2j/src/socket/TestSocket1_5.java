package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用java 执行ping命令
 * @author New year
 *		
 *借助 Runtime.getRuntime().exec() 可以运行一个windows的exe程序
 *如图，使用java运行 ping 192.168.2.106，返回这样的字符串
 */
public class TestSocket1_5 {

	public static void main(String[] args) throws IOException {
		
		Process p = Runtime.getRuntime().exec("ping " + "192.168.28.1");		//这个地址要是自己电脑的IP地址
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		StringBuilder sb = new StringBuilder();	
		while((line = br.readLine()) != null) {
			if (line.length() != 0) {
				sb.append(line + "\r\n");
			}
		}
		System.out.println("本次指令返回的消息是：");
		System.out.println(sb.toString());
	}

}
