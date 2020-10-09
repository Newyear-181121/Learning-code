package stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写入数据到文件
 * @author New year
 *
 */
public class TestStream3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			File f = new File("d:/demo/xyz/abc/lolw.txt");
			
			
			//因为默认情况下，文件系统中不存在 d:\xyz\abc\def，所以输出会失败
		
			//首先获取文件所在的目录
			File dir = f.getParentFile();
			//如果该目录不存在，则创建该目录
			if(!dir.exists()){

				//dir.mkdir();		//使用mkdir会抛出异常，因为该目录的父目录也不存在
				dir.mkdirs();		//使用mkdirs则会把不存在的目录都创建好
				
			}
			
			byte data[] = {89,89};
			
			//声明数据流  打开数据流   打开字节流
			FileOutputStream fos = new FileOutputStream(f);
			
			fos.write(data); //写入数据
			
			fos.close();//关闭流			//在try块中关闭数据流有一个隐患           那就是当前面出现异常抛出时，就没有执行这一行代码。
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序结束");
	}

}
