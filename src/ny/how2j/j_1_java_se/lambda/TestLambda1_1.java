package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 普通方法
 * @author New year
 *
 *		使用一个普通方法，在for循环遍历中进行条件判断，筛选出满足条件的数据
 *
 *		hp>100 && damage<50
 */
public class TestLambda1_1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//这里声明了一个Hero泛型的容器  
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 10; i++){
			//给容器增加内容
			heros.add(new Hero("hero " + i, r.nextInt(10000),r.nextInt(100)));	
			//每增加一个就打印一个
			//System.out.println(heros);
			//这里还不加得好。
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		System.out.println("筛选出 hp>100 && damange<50的英雄");
		filter(heros);
	}
	
	private static void filter(List<Hero> heros) {
		for (Hero hero : heros) {
			if(hero.hp>100 && hero.damage<50)
				System.out.print(hero);
		}
	}

}
