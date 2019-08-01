package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 直接进行字符串的读写
 * @author New year
 *		DataInputStream 数据输入流 
 *		DataOutputStream 数据输出流
 *
 *			使用数据流的writeUTF()和readUTF() 可以进行数据的格式化顺序读写
 *			如本例，通过DataOutputStream 向文件顺序写出 布尔值，整数和字符串。 然后再通过DataInputStream 顺序读入这些数据。
 *			
 *				注： 要用DataInputStream 读取一个文件，这个文件必须是由DataOutputStream 写出的，否则会出现EOFException，因为DataOutputStream 在写出的时候会做一些特殊标记，只有DataInputStream 才能成功的读取。
 *		
 *		
 */
public class TestStream8_1 {

	public static void main(String[] args) {

		write();		//在原来有一个文件的情况下，看它是什么情况，，是直接覆盖，还是在后面插入，还是抛出异常。
		read();

	}				//运行了一遍是正常的，读取到了写入的数据。再看一下文件的情况是： 里面原来存的AB 被修改了，，原来的内容被覆盖了。原来的内容被丢失了。
	
					//那如果要保存原来的数据，在运来的数据之后插入数据该怎么搞？
	
	private static void read() {
		File f = new File("f:demo/lol.txt");
		try (
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);		//数据流也是要建立在基于流的基础上吗？
			){
				boolean b = dis.readBoolean();
				int i = dis.readInt();
				String str = dis.readUTF();
				
				System.out.println("读取到布尔值:"+b);
	            System.out.println("读取到整数:"+i);
	            System.out.println("读取到字符串:"+str);
			
			
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
