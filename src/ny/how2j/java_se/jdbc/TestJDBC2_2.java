package jdbc;


/**
 * ��ʼ������ 
 * @author New year
 *
 *
 *ͨ��Class.forName("com.mysql.jdbc.Driver");
 *��ʼ��������com.mysql.jdbc.Driver
 *���� mysql-connector-java-5.0.8-bin.jar��
 *��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
 *
 *Class.forName�ǰ��������ص�JVM�У����ص�ʱ�򣬾ͻ�ִ�����еľ�̬��ʼ���飬��������ĳ�ʼ������ع����� 
 */
public class TestJDBC2_2 {

	public static void main(String[] args) {

		//��ʼ������
        try {
            //������com.mysql.jdbc.Driver
            //���� mysql-connector-java-5.0.8-bin.jar��
            //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
              
            System.out.println("���ݿ��������سɹ� ��");
   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
/*
 			��ʼ��������Ҳû���ã�������������û��װMySQL ���ݿ⣬
 			ֻ����������ϲ�װ�����ݿ⡣
 			
 			���õĿ�   �����������ݿ��õġ�
 			
 			
 			
 */
