package stream;

import java.io.UnsupportedEncodingException;

/**
 * 一个汉字使用不同编码方式的表现
 * @author New year
 *
 */
public class TestStream6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "中";
		showCode(str);//调用这个静态方法  显示字符
	}
	
	//下面是两个静态方法，使用了多态方法，方法名一样，参数不一样。
	
	
	private static void showCode(String str) {
		String[] encodes = { "BIG5" , "GBK" , "GB2312" , "UTF-8" , "UTF-16" , "UTF-32" };
		for (String encode : encodes) {
			//每种编码方式都调用一次这个方法
			showCode(str ,encode);			//调用带两个参数的方法
		}
	}
										//str是字符串  中		encode是编码方式
	private static void showCode(String str,String encode){
		
		try {
			System.out.printf("字符：\" %s \" 的在编码方式  %s 下的十六进制值是   %n", str, encode);			//这里%n   是回车换行     printf  用法与c中用法相同。
			
			
			byte[] bs = str.getBytes(encode);		//getBytes   是什么意思？？
			
			for (byte b : bs) {
				int i = b&0xff;
				System.out.print(Integer.toHexString(i) + "\t");		//这里使用了一个int的包装类  Integer 
			}
			System.out.println();
			System.out.println();
		} catch (UnsupportedEncodingException e) {		//只要正常输入，就不会有问题  ，只要不正常  就会有异常。
			System.out.printf("UnsupportedEncodingException: %s编码方式无法解析字符%s\n", encode, str);
			e.printStackTrace();
		}
	}

}
