package stream;

import java.util.Scanner;

/**
 * 使用Scanner从控制台读取整数
 * @author New year
 *
 */
public class TestStream10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();					//这里的变量a，是用来保存输入的数据的
		System.out.println("frist number:" + a);
		int b = s.nextInt();
		System.out.println("senced number:" + b);
		
	}

}
