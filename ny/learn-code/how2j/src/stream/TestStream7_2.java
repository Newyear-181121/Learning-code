package stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 使用缓存流写出数据
 * 		flush
 * 			有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。 这时候就需要用到flush
 * 
 * 			PrintWriter 缓存字符输出流， 可以一次写出一行数据
 * @author New year
 *
 */
public class TestStream7_2 {

	public static void main(String[] args) {
		// 向文件lol2.txt中写入三行语句
		File f = new File("f:demo/lol-olo.txt");//先试一下没有这个文件看会不会创建这个文件
		
		try (									//一般都是在try的括号里面创建流了，，应为他会自动关闭，而不需要添加finally 块关闭流      但是要记得打开了流就一定要关闭它，
				//  创建文件字符流
				FileWriter fw = new FileWriter(f);
				//  缓存流必须建立在一个存在的流的基础上
				PrintWriter pw = new PrintWriter(fw);
			) {
				pw.println("看看可不可以直接输入中文");			//在没有文件的请款下会创建这个文件，并输入内容
								
				//强制把缓存中的数据写入硬盘，无论缓存是否已满
                pw.flush();
                
				pw.println("garen kill teemo");							//如果是没有一系列的文件数的情况下，要先判断是否有这个文件，没有则使用___.mkdirs（）方法，，他会讲没有的目录都创建好。
				pw.println("中文应该是可以直接输入的");
                pw.flush();
				pw.println("没有文件的情况下可以直接创建这个文件的");

                pw.flush();		//这个方法是吧上面一行的缓存中的数据写入
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
