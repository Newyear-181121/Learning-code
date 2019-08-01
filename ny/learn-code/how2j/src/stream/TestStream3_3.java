package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 以字节流的形式向文件写入数据
 * @author New year
 *
 *OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
 *FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据
 *
 * 注: 如果文件d:/lol2.txt不存在，写出操作会自动创建该文件。 
 * 但是如果是文件 d:/xyz/lol2.txt，而目录xyz又不存在，会抛出异常
 *
 */
public class TestStream3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//创建文件对象
			//准备文件lol2.txt  先试试不创建文件				//没有创建文件夹的情况下果然    创建了一个文件且输入了数组中的数据
			File f = new File("f:/demo/lol2.txt");
			
			//准备一个数组，有如下内容，，其对因的字符是X，Y
			byte data[] = { 88,89 };
			//这里准备的是数字，，虽然有对应的ASCII码，，但是哪一步是将数字转化成字母字符的呢？
			
			//加一个遍历数组
			for(byte b : data){
				System.out.println(b);
			}//在这里的时候还是数字输出
			
			//创建文件的输出流        的对象
			FileOutputStream fos = new FileOutputStream(f);
			//把数据写入到输出流
			fos.write(data);
			
			//这里是自动转换的吗？
			
			//关闭输出流
			fos.close();
		}catch(IOException e){
			e.printStackTrace();//异常处理依然是打印   堆     痕迹  
		}
		
	}

}
