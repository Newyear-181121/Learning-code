package exception;


/**
 * 错误
 * 		错误Error，指的是系统级别的异常，通常是内存用光了
 * 		在默认设置下，一般java程序启动的时候，最大可以使用16m的内存
 * 		如例不停的给StringBuffer追加字符，很快就把内存使用光了。抛出OutOfMemoryError
 * 		与运行时异常一样，错误也是不要求强制捕捉的
 * @author New year
 *
 */
public class TestException3_3 {
	
	public static void main(String[] args){
		
		//这是一个可以增加容量的字符串类还有一个是Stringbuild//好像是这个名字，但是不常用
		
		//StringBuffer是可变长的字符串
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < Integer.MAX_VALUE; i++){
			sb.append('a');
		}
	}

}


/*
 总体上异常分三类： 
1. 错误
2. 运行时异常		与可查异常不同之处在于，即便不进行try catch，也不会有编译错误 
3. 可查异常

*/



