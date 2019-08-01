package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流把字符串写入到文件
 * @author New year
 *			FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
 */
public class TestStream5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("f:/demo/lol2.txt");
		
		// 创建基于文件的writer
		try (FileWriter fr = new FileWriter(f)) {
			
			// 以字符流的形式把数据写入到文件中
			String data = "使用字符流把字符串写入到文件";	
			
			char[] cs = data.toCharArray();			//这里是把  字符串转换成字符型的数组
			fr.write(cs);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
