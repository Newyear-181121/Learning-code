package stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 使用字符流读取文件
 * @author New year
 *		FileReader 是Reader子类，以FileReader 为例进行文件读取
 */
public class TestStream5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//自动创建方法存根
		//这里的文件是需要提前准备好的		原文：// 准备文件lol.txt其中的内容是AB
		File f = new File("f:lol.txt");
		//创建基于文件的Reader
		try (FileReader fr = new FileReader(f)) {
			// 创建字符数组，其长度就是文件的长度
			char[] all = new char[(int) f.length()];
			// 以字符流的形式读取文件所有内容
			fr.read(all);//这里的方法也是read
			for (char b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
