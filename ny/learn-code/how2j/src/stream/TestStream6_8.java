package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 用FileInputStream 字节流正确读取中文
 * @author New year
 *
 *		为了能够正确的读取中文内容
 *		1. 必须了解文本是以哪种编码方式保存字符的
 *		2. 使用字节流读取了文本后，再使用对应的编码方式去识别这些数字，得到正确的字符
 *		如本例，一个文件中的内容是字符中，编码方式是GBK，那么读出来的数据一定是D6D0。
 *		再使用GBK编码方式识别D6D0，就能正确的得到字符中
 *		
 *		注： 在GBK的棋盘上找到的中字后，JVM会自动找到中在UNICODE这个棋盘上对应的数
 *		字，并且以UNICODE上的数字保存在内存中。
 */
public class TestStream6_8 {

	public static void main(String[] args) {
		
		File f = new File("f:demo\\test.txt");
		try (FileInputStream fis = new FileInputStream(f);) {			//在try块的括号中打开的流会自动关闭。。。。。
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			
			
			System.out.println("文件中读出来的数据是：");
			for (byte b: all) {
				int i = b&0x000000ff;		//只取16进制的后两位
				System.out.println(Integer.toHexString(i));		//这里的Integer.toHexString(i)是什么意思？？
			}
			System.out.println("把这个数字，放在GBK的棋盘上去：");
			String str = new String(all,"GBK");			//这里就是编译方法     前面的all是编译内容  初始代码          ，，  后面的是编译方式
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
