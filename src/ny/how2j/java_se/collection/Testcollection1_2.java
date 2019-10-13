package collection;

import java.util.ArrayList;


/**
 * ArrayList存放对象
 * @author New year
 * 
 * 		为了解决数组的局限性，引入容器类的概念。 最常见的容器类就是 
 *		ArrayList 
 *		容器的容量"capacity"会随着对象的增加，自动增长 
 *		只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
 *		代码比较 复制代码
 *
 *
 */
public class Testcollection1_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		ArrayList heros = new ArrayList();		//这里也是定义了容器对象
		heros.add(  new Hero1_1("盖伦"));		//使用add方法添加数据
		System.out.println(heros.size());
		
		//
		//
		heros.add( new Hero1_1("提莫"));
		System.out.println(heros.size());
	}

}
