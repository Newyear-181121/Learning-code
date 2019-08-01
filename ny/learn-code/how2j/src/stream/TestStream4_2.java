package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 在finally中关闭  流
 * 			这是标准的关闭流的方式
 * 			1. 首先把流的引用声明在try的外面，如果声明在try里面，其作用域无法抵达finally.
 * 			2. 在finally关闭之前，要先判断该引用是否为空
 * 			3. 关闭的时候，需要再一次进行try catch处理
 * @author New year
 *
 *			这是标准的严谨的关闭流的方式，但是看上去很繁琐，所以写不重要的或者测试代码的时候，都会采用上面的有隐患try的方式，因为不麻烦~
 */
public class TestStream4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("f:demo/lol.txt");
		
		//先在try块外声明一个空的字节输入流            		先打开流    开关名设好      开关内容待定。
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {			//这里的内容是，，，不管有没有出现异常都会运行这一步，，，所以先判断有没有开启流，如果开启了，就关闭，如果没有开启就不执行if后的代码。
			//  在finally  里关闭流      
			if (null != fis){		//加入try块是防止关闭的时候出现错误
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
