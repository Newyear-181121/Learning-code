package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 多异常捕捉办法2
 * 			是把多个异常，放在一个catch里统一捕捉
 * 			catch (FileNotFoundException | ParseException e) {
 * 			这种方式从 JDK7开始支持，好处是捕捉的代码更紧凑，不足之处是，一旦发生异常，不能确定到底是哪种异常，需要通过instanceof 进行判断具体的异常类型
 * 			if (e instanceof FileNotFoundException)
 *			System.out.println("d:/LOL.exe不存在");
 *			if (e instanceof ParseException)
 *			System.out.println("日期格式解析错误");
 * @author New year
 *
 */
public class TestException2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动创建根方法			//根好像是存根里的根
		
		File f = new File("D:/lol.exe");
		
		try {
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(f);
			//这里出现Exception 后面的code就不会执行了。
			//只有当这里的code正常才会执行后面的代码。
			
			System.out.println("成功打开");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date d = sdf.parse("0000-22-33");
		}catch(FileNotFoundException | ParseException e){
			if (e instanceof FileNotFoundException)
				System.out.println("d:/LOL.exe不存在");
			if (e instanceof ParseException)		//parse  //解析器           异常
				System.out.println("日期格式解析错误");
			
			//不管是否发生哪种异常，都打印方法调用路线
			e.printStackTrace();
		}
		
	}

}
