package collection;

import java.util.ArrayList;
import java.util.List;

import character.Hero;

/**
 * 用增强型for循环 
 * @author New year
 *
 *使用增强型for循环可以非常方便的遍历ArrayList中的元素，这是很多开发人员的首选。
 *
 *不过增强型for循环也有不足：
 *无法用来进行ArrayList的初始化
 *无法得知当前是第几个元素了，当需要只打印单数元素的时候，就做不到了。 必须再自定下标变量。 
 *
 */
public class TestCollection5_3 {

	public static void main(String[] args) {

		List<Hero> heros = new ArrayList<Hero>();
		
		// 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }
        
     // 第三种，增强型for循环
        System.out.println("--------增强型for循环-------");
		for (Hero h : heros) {
			System.out.println(h);
		}
	}

}
