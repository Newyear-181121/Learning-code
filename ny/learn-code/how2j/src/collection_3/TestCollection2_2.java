package collection_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *    ArrayList和LinkedList
 * 
 * @author New year
 *
 * ArrayList和LinkedList的区别 
 * 
 * ArrayList 插入，删除数据慢
 * LinkedList， 插入，删除数据快
 * 
 * ArrayList是顺序结构，所以定位很快，指哪找哪。 就像电影院位置一样，有了电影票，一下就找到位置了。
 * LinkedList 是链表结构，就像手里的一串佛珠，要找出第99个佛珠，必须得一个一个的数过去，所以定位慢 
 */
public class TestCollection2_2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		insertFirst(l, "ArrayList");
		modify(l,"ArrayList");				//修改数据更快
		
		l = new LinkedList<>();
		insertFirst(l, "LinkedList"); 		//插入数据更快
		modify(l,"LinkedList");
	}

	/**
	 * 插入数据 
	 * @param l
	 * @param type
	 */
	private static void insertFirst(List<Integer> l, String type) {
		int total = 1000 * 100;
		final int number = 5 ;
		long start = System.currentTimeMillis();
		for (int i = 0 ; i < total ; i++) {
			l.add(0,number);
		}
		long end = System.currentTimeMillis();
		System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
	}
	
	
	/**
	 * 定位数据 
	 * @param l
	 * @param type
	 */
	private static void modify(List<Integer> l, String type) {
		int total = 100 * 1000 ; 
		int index = total/2 ;
		final int number = 5 ;
		//初始化
		for ( int i = 0 ; i < total ; i++) {
			l.add(number);
			
		}
		
		long start = System.currentTimeMillis();
		
		for ( int i = 0 ; i < total ; i++) {
			int n = l.get(index);
			n++;
			l.set(index, n);
		}
		long end = System.currentTimeMillis();
		System.out.printf("%s总长度是%d，定位到第%d个数据，取出来，加1，再放回去%n 重复%d遍，总共耗时 %d 毫秒 %n", type,total, index,total, end - start);
		System.out.println();
	}
	
	
	
}
