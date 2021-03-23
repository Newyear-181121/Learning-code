package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * 异常处理
 * 		异常处理常见手段： try catch finally throws
 * @author New year
 *
 */
public class TestException2_1 {
	
	public static void main(String[] args) {
        
        File f= new File("E:/存储文件夹/一些文件/桌面壁纸/SogouWP/Net/WallPaper/0000.jpg");//这里的文件error  try块中就会throw exception
         																				 //here 的file right try块中的code就不会执行		
        /**
         * 将可能抛出异常的代码try里
         * 将可能抛出FileNotFoundException 文件不存在异常的代码放在try里
         */
        try{	//try 块中加入可能会出现异常的语句
        	
            System.out.println("试图打开 E:/存储文件夹/一些文件/桌面壁纸/SogouWP/Net/WallPaper/10298.jpg");
            
            new FileInputStream(f);		//尝试打开f中的文件，如果找不到就会出现异常。
            							//出现异常就会调用下面的catch方法抓住异常，并执行catch中的方法。
            
            
            //((Throwable) f).printStackTrace();//这个打印调用痕迹不会用（grin）露齿而笑      笑哭（laugh cry）
            
            //没有出现异常就会正常执行，并且不会执行catch中的语句。
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("E:/存储文件夹/一些文件/桌面壁纸/SogouWP/Net/WallPaper/10298.jpg不存在");
            
            //e.printStackTrace(); 会打印出方法的调用痕迹
            											/*
       		这应该是调用路线								 *	at java.io.FileInputStream.open0(Native Method)
														 *	at java.io.FileInputStream.open(FileInputStream.java:195)
														 *	at java.io.FileInputStream.<init>(FileInputStream.java:138)
														 *	at exception.TestException21.main(TestException21.java:28)
            											 */
            
            
            e.printStackTrace();
        }
         
    }

}
