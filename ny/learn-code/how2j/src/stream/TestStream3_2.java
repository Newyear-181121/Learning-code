package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 以字节流的形式读取文件内容
 * @author New year
 *
 *InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
 *FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
 *
 */
public class TestStream3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//创建文件对象
			//需要准备一个文件  lol。TXT 其中有内容  ，是AB和ab  对应ASCII是65 65 和97 98
			File f = new File("f:/demo/LOL.txt");
			
			//创建  基于文件的    输入流
			FileInputStream fis = new FileInputStream(f);
			
			//创建数组    字节数组     ，长度为  长度就是文件的长度
			//应为在这行code前创建了 文件输入流  所以这里才可以读取文件的长度，所以文件的长度才确定。
			byte[] all = new byte[(int) f.length()];
			
			//以字节流的形式读取文件所有内容
			fis.read(all);
			
			//这是以for的增强形式遍历数组
			for(byte b : all){
				System.out.println(b);
			}
			
			/**
			 * 每次使用完流，都应该进行关闭
			 * 
			 * 都要关闭流，
			 * 有开有关。
			 */
			fis.close();//这是关闭流
			
		}catch (IOException e){
			
			e.printStackTrace();
		}
	}

}



/*
原始文件内容：
		AB
		
		ab
		
		
-----------------
控制台输出：
		65
		66
		13							13和10   应该是换行回车的ASCII码。
		10
		13
		10
		97
		98
		13
		10
		13
		10
		13
		10
*/

		
