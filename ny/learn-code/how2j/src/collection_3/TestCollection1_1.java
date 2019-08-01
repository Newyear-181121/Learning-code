package collection_3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *  -是否有顺序 
 *
 * ArrayList: 有顺序
 * HashSet: 无顺序
 * 
 *  -能否重复 
 * 
 * List中的数据可以重复
 * Set中的数据不能够重复
 * 
 * @author New year
 *
 *HashSet的具体顺序，既不是按照插入顺序，也不是按照hashcode的顺序。
 *换句话说，同样是插入0-9到HashSet中， 在JVM的不同版本中，看到的顺序都是不一样的。 所以在开发的时候，不能依赖于某种臆测的顺序，这个顺序本身是不稳定的 
 *
 * 重复判断标准是:
 * 首先看hashcode是否相同
 * 如果hashcode不同，则认为是不同数据
 * 如果hashcode相同，再比较equals，如果equals相同，则是相同数据，否则是不同数据
 * 更多关系hashcode，
 *
 */
public class TestCollection1_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		//List中的数据按照插入顺序存放
		System.out.println("----------List----------");
		System.out.println("向List 中插入 9 5 1");
		numberList.add(9);
		numberList.add(5);
		numberList.add(1);
		
		numberList.add(3);
        numberList.add(7);
        numberList.add(6);
        numberList.add(0);
		
		System.out.println("List 按照顺序存放数据:");
        System.out.println(numberList);
        
        System.out.println("+++再+++向List 中插入 9 9");
        numberList.add(9);
        numberList.add(9);
        System.out.println("List 中出现两个9:");
        System.out.println(numberList);
        
        
        System.out.println("----------Set----------------------------");
		
        HashSet<Integer> numberSet = new HashSet<Integer>();
        
        System.out.println("向Set 中插入9 5 1");
        //Set中的数据不是按照插入顺序存放
        numberSet.add(9);
        numberSet.add(5);
        numberSet.add(1);
        
        numberSet.add(3);
        numberSet.add(7);
        numberSet.add(6);
        numberSet.add(0);
        
        
        System.out.println("Set 不是按照顺序存放数据:");
        System.out.println(numberSet);
		
		
        System.out.println("+++再+++向Set 中插入9 9");
      //Set中的数据不能重复
        numberSet.add(9);
        numberSet.add(9);
        System.out.println("Set 中只会保留一个9:");
        System.out.println(numberSet);
		
		
	}

}
