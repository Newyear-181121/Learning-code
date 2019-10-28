package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 可查异常
 * 		可查异常即必须进行处理的异常
 * 		要么try catch住,要么往外抛，谁调用，谁处理，
 * 		比如 FileNotFoundException
 *		如果不处理，编译器，就不让你通过
 * @author New year
 *
 */
public class TestException3_1 {
	
	public static void main(String[] args) {
		
		File f = new File("d:13.321");
		
		try{
			System.out.print("try open file");
			new FileInputStream(f);
			System.out.println("success");
		}catch(FileNotFoundException e){
			System.out.println("open failure");
			e.printStackTrace();
			
		}
	}

}
