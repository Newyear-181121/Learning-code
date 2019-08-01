package collection_2;


/**
 * HashSet和HashMap的关系 
 * @author New year
 *
 *
 *通过观察HashSet的源代码（如何查看源代码）
 *可以发现HashSet自身并没有独立的实现，而是在里面封装了一个Map.
 *HashSet是作为Map的key而存在的
 *而value是一个命名为PRESENT的static的Object对象，因为是一个类属性，所以只会有一个。
 *
 *	//private static final Object PRESENT = new Object();
 */
public class TestCollection4_4 {

	
}


/*
 
 在
HashSet<E>
	文件中
	
*/