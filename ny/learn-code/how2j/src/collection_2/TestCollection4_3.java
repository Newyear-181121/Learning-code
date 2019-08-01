package collection_2;

import java.util.HashSet;
import java.util.Iterator;


/**
 * 遍历 
 * @author New year
 *Set不提供get()来获取指定位置的元素 
 *所以遍历需要用到迭代器，或者增强型for循环 
 */
public class TestCollection4_3 {

	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<Integer>();
		
		for (int i = 0 ; i < 20 ; i++) {
			numbers.add(i);
		}
		
		//Set不提供get方法来获取指定位置的元素
        //numbers.get(0)
         
        //遍历Set可以采用迭代器iterator
		for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
			Integer i = (Integer) iterator.next();
			System.out.println(i);
		}
		
		//或者采用增强型for循环
		for (Integer i : numbers) {
			System.out.println(i);
		}
	}

}
