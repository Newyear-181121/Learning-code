package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * throws
 * @author New year
 *
 */
public class TestException2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();
		
		/*
			主方法调用method1
			method1调用method2
			method2中打开文件
		 */
	}
	
	
	//method1选择本地try catch住 一旦try catch住了，就相当于把这个异常消化掉了，主方法在调用method1的时候，就不需要进行异常处理了
	private static void method1(){
		try{
			method2();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}

	
	//method2中需要进行异常处理	  //但是method2不打算处理，而是把这个异常通过throws抛出去
	private static void method2() throws FileNotFoundException {
	//那么method1就会接到该异常。 处理办法也是两种，要么是try catch处理掉，要么也是抛出去。	
		
		File f = new File("123.321");
		
		System.out.println("try open 123.321");
		new FileInputStream(f);
		System.out.println("success");
	}
}


/**
throws与throw这两个关键字接近，不过意义不一样，有如下区别：
1. throws 出现在方法声明上，而throw通常都出现在方法体内。
2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象。



 */
