package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �������� 
 * @author New year
 *
 *1. ����˿���8888�˿ڣ��������ţ�ʱ�̵ȴ��ſͻ��˵��������� 
 *2. �ͻ���֪������˵�ip��ַ�ͼ����˿ںţ��������󵽷���� 
 *�ͻ��˵Ķ˿ڵ�ַ��ϵͳ����ģ�ͨ���������1024 
 *һ�����������ӣ�����˻�õ�һ���µ�Socket���󣬸ö�������ͻ��˽���ͨ�š� 
 *ע�⣺ �ڿ������ԵĹ����У�����޸Ĺ��˷�����Server���룬Ҫ�ر�������Server,�����µ�Server������������Ϊ8888�˿ڱ�ռ���� 
 */
public class Server2_1 {

	public static void main(String[] args) {

		try {
			//����˴򿪶˿�8888
			ServerSocket ss = new ServerSocket(8888);
			
			//��8888�˿��ϼ��������Ƿ��������������
			System.out.println("�����ڶ˿ں�:8888");
			Socket s = ss.accept();
			
			System.out.println("�����ӹ���" + s);
			
			s.close();
			ss.close();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}

}
