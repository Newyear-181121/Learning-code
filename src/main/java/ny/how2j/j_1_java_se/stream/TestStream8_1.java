package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ֱ�ӽ����ַ����Ķ�д
 * @author New year
 *		DataInputStream ���������� 
 *		DataOutputStream ���������
 *
 *			ʹ����������writeUTF()��readUTF() ���Խ������ݵĸ�ʽ��˳���д
 *			�籾����ͨ��DataOutputStream ���ļ�˳��д�� ����ֵ���������ַ����� Ȼ����ͨ��DataInputStream ˳�������Щ���ݡ�
 *			
 *				ע�� Ҫ��DataInputStream ��ȡһ���ļ�������ļ���������DataOutputStream д���ģ���������EOFException����ΪDataOutputStream ��д����ʱ�����һЩ�����ǣ�ֻ��DataInputStream ���ܳɹ��Ķ�ȡ��
 *		
 *		
 */
public class TestStream8_1 {

	public static void main(String[] args) {

		write();		//��ԭ����һ���ļ�������£�������ʲô���������ֱ�Ӹ��ǣ������ں�����룬�����׳��쳣��
		read();

	}				//������һ���������ģ���ȡ����д������ݡ��ٿ�һ���ļ�������ǣ� ����ԭ�����AB ���޸��ˣ���ԭ�������ݱ������ˡ�ԭ�������ݱ���ʧ�ˡ�
	
					//�����Ҫ����ԭ�������ݣ�������������֮��������ݸ���ô�㣿
	
	private static void read() {
		File f = new File("f:demo/lol.txt");
		try (
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);		//������Ҳ��Ҫ�����ڻ������Ļ�������
			){
				boolean b = dis.readBoolean();
				int i = dis.readInt();
				String str = dis.readUTF();
				
				System.out.println("��ȡ������ֵ:"+b);
	            System.out.println("��ȡ������:"+i);
	            System.out.println("��ȡ���ַ���:"+str);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void write()	{
		File f = new File("f:demo/lol.txt");
		try (
				FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
			){
				dos.writeBoolean(true);
				dos.writeInt(300);
				dos.writeUTF("123 this is gareen");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
