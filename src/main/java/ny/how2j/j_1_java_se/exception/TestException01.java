package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * 常见异常
 * @author New year
 *
 */
public class TestException01 {
	
	public static void main(String[] args) throws FileNotFoundException {
        
        File f= new File("E:/存储文件夹/一些文件/桌面壁纸/SogouWP/Net/WallPaper/10298.jpg");
          
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
        new FileInputStream(f);
        System.out.println("尝试打开文件");
          
        // new FileInputStream(f) 试图打开某文件
        
        
        //OutOfIndexException 数组下标越界异常
        int[] a = new int[3];
        a[5] = 8;
        System.out.println("OutOfIndexException 数组下标越界异常");
        
        
        //NullPointerException 空指针异常
        String str = new String();
        str.length();
        System.out.println("NullPointerException 空指针异常");
    }

}
/*
ParseException 解析异常，日期字符串转换为日期对象的时候，有可能抛出的异常

OutOfIndexException 数组下标越界异常
OutOfMemoryError 内存不足				//这是错误，
ClassCastException 类型转换异常
ArithmeticException 除数为零
NullPointerException 空指针异常			//对象为空时，访问他的属性会出现异常
*/