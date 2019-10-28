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
			File f = new File("f:/demo/loll.txt");				//声明文件对象
			System.out.println("有异常的时候这条语句是已经执行了的   001");
			
			FileInputStream fis =  new FileInputStream(f);	//声明字节流输入对象     	相当于打开了字节流输入接口
			
			
			System.out.println("有异常的时候没有执行到这条语句   002");//说明上面的语句出行错误抛出了异常
			
			
			System.out.println("打开字节输入流");
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
