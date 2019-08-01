package stream;

import java.util.Scanner;

/**
 * Scanner读取字符串
 * 
 * @author New year
 * 
 * 		使用System.in.read虽然可以读取数据，但是很不方便
 *		使用Scanner就可以逐行读取了
 *
 */
public class TestStream10_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true){					//为什么都是死循环输入输出
			String line = s.nextLine();
			System.out.println(line);
		}
			
			
	}

}
