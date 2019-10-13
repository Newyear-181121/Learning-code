package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 文件输入流
 * @author New year
 *
 */
public class TestStream2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f = new File("f:/demo/lol.txt");
			// 创建基于文件的输入流
			FileInputStream fis = new FileInputStream(f);			//系统找不到指定路径  这是还没有创建这个文件。
			//// 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
			
		}catch (IOException e ) {
			
			e.printStackTrace();
		}
	}

}
/*
 * 如下代码，就建立了一个文件输入流，这个流可以用来把数据从硬盘的文件，读取到JVM(内存)。
 */


//自己建立一个文件输出流


class TestStream2_1_1  {
	
	public void outStr1() throws IOException{
		File f1 = new File("f:/demo/outStream.out");
		
		FileOutputStream fos = new FileOutputStream(f1);
			
	}
	
	public void outStr2()  {
		
		TestStream2_1_1  ts211 = new TestStream2_1_1();
		
		try{
			ts211.outStr1();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	
}










