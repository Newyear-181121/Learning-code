package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Throwable
 * 		Throwable是类，Exception和Error都继承了该类
 * 		所以在捕捉的时候，也可以使用Throwable进行捕捉
 * @author New year
 *
 */
public class TestException4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("d:/LOL.exe");
		
		try {
			new FileInputStream(f);
		} catch (Throwable t) {		//所以在捕捉的时候，也可以使用Throwable进行捕捉
			
			t.printStackTrace();
		}
	}

}
