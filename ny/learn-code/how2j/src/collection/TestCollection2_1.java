package collection;

import java.util.ArrayList;

/**
 * 增加   		add
 * @author New year
 *
 */
public class TestCollection2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList heros = new ArrayList();
		
		//把5个对象加入到ArrayList中
		for (int i = 0; i < 5; i++){
			heros.add(new Hero1_1("hero" + i));
		}
		System.out.println(heros);
		
		
		
		Hero1_1 specialHero = new Hero1_1("special hero");
		heros.add(3,specialHero);		//	在指定位置增加对象
		
		System.out.println(heros.toString());
	}

}

/**
 * contains	判断是否存在
 * get		获取指定位置的对象	
 *indexOf	获取对象所处的位置	
 *remove	删除	
 *set		替换	
 *size		获取大小	
 *toArray	转换为数组	
 *addAll	把另一个容器所有对象都加进来	
 *clear		清空	

 */
