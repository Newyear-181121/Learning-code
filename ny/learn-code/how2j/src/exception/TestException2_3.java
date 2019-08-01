package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 多异常捕捉办法1
 * @author New year
 *
 */
public class TestException2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动产生方法根
		//自动产生根方法
		
		File f = new File("E:/存储文件夹/一些文件/桌面壁纸/SogouWP/Net/WallPaper/10298.jpg");
								//把原来错误的文件地址改成正确的。
		try{
			System.out.println("try打开 d：/LOL.EXE");
			new FileInputStream(f);
			System.out.println("成功打开");
			
			//第一个异常没有throw 才会运行下面的code
			//如果第一个code 就throw 了 就不会运行第二个code了。
			SimpleDateFormat sdf = new SimpleDateFormat("y--d");//yyyy-mm-dd
			
			System.out.println("运行到了这一步吗？02");//上面就没有运行过来
								//难道是第一个异常出现了就直接throw 了，就没有运行下面的代码。
			
			//更前面不一样就会有exception
			Date d = sdf.parse("2016-03");//yyyy-mm-dd   只要这里跟前面的格式设置一样就不会有错误了
			
			System.out.println(d);
			System.out.println("运行到了这一步吗？01");
			
			
		}catch (FileNotFoundException e){			//这里是对应异常的处理方法
			//这里的处理方法就是打印下列信息，方便找错学习
			System.out.println("要打开的文件不存在");
			//打印方法调用路线。
			e.printStackTrace();
		}catch (ParseException e){
			System.out.println("日期格式解析错误");
			e.printStackTrace();//打印方法调用路线。
		}
	}

}
