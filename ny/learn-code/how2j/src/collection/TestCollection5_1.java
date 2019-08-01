package collection;

import java.util.ArrayList;
import java.util.List;

import character.Hero;

/**
 * 用for循环遍历 
 * @author New year
 *
 *通过前面的学习，知道了可以用size()和get()分别得到大小，和获取指定位置的元素，结合for循环就可以遍历出ArrayList的内容
 */
public class TestCollection5_1 {
	
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<Hero>();
		
		// 放5个Hero进入容器
		for (int i = 0; i< 5; i++) {
			heros.add(new Hero ("hero name " + i));
		}
		
		 // 第一种遍历 for循环
		System.out.println("-------------for循环-*--------");
		for (int i = 0; i<heros.size();i++){
			Hero h = heros.get(i);		//得到容器中位置为i的元素
			System.out.println(h);		//将数组元素输出
		}
	}

}
