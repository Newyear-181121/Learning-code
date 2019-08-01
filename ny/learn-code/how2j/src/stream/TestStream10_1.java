package stream;

import java.io.IOException;
import java.io.InputStream;		//这个类导入的时候多个选择，导入错了的话会有错误。




/**
 * 	System.in
 * @author New year
 * 		
 * 		System.out 是常用的在控制台输出数据的 
 *		System.in 可以从控制台输入数据
 *
 */
public class TestStream10_1 {

	public static void main(String[] args) {
		//  从控制台输入
		try (InputStream is = System.in;) {		//System.in  也是流，，输入流，，，输入到Java虚拟机的
			while (true) {
				//	敲入a,然后敲回车可以看到
				//  97 13 10
				//  97是a的ASCII码
				//  13 10分别对应回车换行
				int i = is.read();				//这里读取打印的都是ASCII
				System.out.println(i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
