package exception;

import java.io.File;
import java.io.FileInputStream;

/**
 * 使用异常的父类进行catch
 * 		用父类catch exception
 * @author New year
 *
 */
public class TestException2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  //每次都会出现这句话，啥意思啊？
		//任务标记？？？			
		//		自动-产生        		方法    （树根，票根）根
		//自动产生根方法
		
		File f = new File("d:/LOL.exe");
		
		try{
			System.out.println("try打开 d:LOL.EXE");
			//尝试打开f中的文件。
			new FileInputStream(f);		
			System.out.println("成功打开");
			
			
			//FileNotFoundException是Exception的子类，使用Exception也可以catch住FileNotFoundException。
			//TestException21  中用的是FileNotFoundException类。
		}catch(Exception e){
			System.out.println("d:/LOL.EXE不存在");
			
			e.printStackTrace();	//打印调用方法路线。	
		}
	}

}
