package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用try()的方式
 * 			意思是在try的括号里写code的用法
 * 
 * 		把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
 * 		这种编写代码的方式叫做 try-with-resources， 这是从JDK7开始支持的技术
 * 		
 * 		所有的流，都实现了一个接口叫做 AutoCloseable，任何类实现了这个接口，都可以在try()中进行实例化。 并且在try, catch, finally结束的时候自动关闭，回收相关资源。
 * @author New year
 *
 */
public class TestStream4_3 {
	public static void main(String[] args) {
		
		File f = new File("f:demo/lol.txt");
		
		//把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
		try (FileInputStream fis = new FileInputStream(f)) {
			byte[] all = new byte[(int) f.length()];//这里的length这个方法是只有在数组里才能使用吗？都是获取对象的长度    ，，数组的长度，文件的长度
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		//所有的处理异常的一般方法都是打印堆栈痕迹吗？
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
