package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * finally
 * @author New year
 *
 */
public class TestException2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动产生根方法
		
		File f = new File("g;/lol.cpp");
		
		try {
			System.out.println("try 打开  f 中的文件");
			new FileInputStream(f);
			
			System.out.println("success");//打印了这里说明上面的code就执行了。
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			// 		自动       产生 		抓住		块
			
			System.out.println("d:/LOL.exe不存在");
			e.printStackTrace();
			System.out.println("d:/LOL.exe不存在002");
		}finally{
			System.out.println("无论文件是否存在， 都会执行的代码");
		}
	}

}
