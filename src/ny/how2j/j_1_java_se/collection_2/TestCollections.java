package collection_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections是一个类，容器的工具类,就如同Arrays是数组的工具类 
 * @author New year
 *
 *一些基本的方法使用
 */
public class TestCollections {

	public static void main(String[] args) {

		//初始化集合numbers
		List<Integer> numbers = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++) {
			numbers.add(i);
			numbers.add(5*i);
		}
		
		System.out.println("集合中的数据:");
		System.out.println(numbers);
		
		
		//reverse 使List中的数据发生翻转
		Collections.reverse(numbers);
		
		System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);
        
        
        
        //shuffle 混淆List中数据的顺序 
        Collections.shuffle(numbers);
        
        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);
        
        
        //sort 对List中的数据进行排序 
        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);
        
        
        //swap 交换两个数据的位置 
        Collections.swap(numbers, 5, 15);
        System.out.println("交换5和15下标的数据后，集合中的数据:");//下标是从零开始的
        System.out.println(numbers);
        
        
        
        //rotate 把List中的数据，向右滚动指定单位的长度 
        Collections.rotate(numbers, 10);
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
        System.out.println(numbers);
        
        
        
        //synchronizedList 把非线程安全的List转换为线程安全的List。 因为截至目前为止，还没有学习线程安全的内容，暂时不展开。 线程安全的内容将在多线程章节展开。 
        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
	}

}
