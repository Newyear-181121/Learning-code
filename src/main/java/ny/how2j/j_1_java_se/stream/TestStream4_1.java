package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 在try中关闭
 * @author New year
 *			这样做有一个弊端；
 *				如果文件不存在，或者读取的时候出现问题而抛出异常，那么就不会执行这一行关闭流的代码，存在巨大的资源占用隐患。 不推荐使用.
 */
public class TestStream4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f = new File("d:/demo/loll.txt");				//声明文件对象
			
			FileInputStream fis =  new FileInputStream(f);	//声明字节流输入对象     	相当于打开了字节流输入接口

			byte[] all = new byte[(int) f.length()];		//定义数组的长度就是文件的长度
			
			/**
			 * 这里的输入时之输入到Java虚拟机中的。
			 */
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
			//在try  里面关闭流
			fis.close();
			System.out.println("关闭了字节流");
			System.out.println("没有抛出异常的请款可以正常关闭流");
			
			
		} catch (IOException e ){
			System.out.println("没有关闭流，，，如果没有找到文件就抛出了异常，就没有关闭流。");
			e.printStackTrace();
		}
		
	}

}
