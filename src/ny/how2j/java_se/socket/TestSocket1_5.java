package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ʹ��java ִ��ping����
 * @author New year
 *		
 *���� Runtime.getRuntime().exec() ��������һ��windows��exe����
 *��ͼ��ʹ��java���� ping 192.168.2.106�������������ַ���
 */
public class TestSocket1_5 {

	public static void main(String[] args) throws IOException {
		
		Process p = Runtime.getRuntime().exec("ping " + "192.168.28.1");		//�����ַҪ���Լ����Ե�IP��ַ
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		StringBuilder sb = new StringBuilder();	
		while((line = br.readLine()) != null) {
			if (line.length() != 0) {
				sb.append(line + "\r\n");
			}
		}
		System.out.println("����ָ��ص���Ϣ�ǣ�");
		System.out.println(sb.toString());
	}

}
