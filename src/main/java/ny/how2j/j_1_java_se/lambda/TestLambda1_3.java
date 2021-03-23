package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Lambda方式
 * @author New year
 *
 */
public class TestLambda1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 5 ; i++) {
			heros.add(new Hero("hero " + i,r.nextInt(1000),r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		System.out.println("使用Lanbda的方法，筛选出 ");
		filter(heros,h->h.hp>100 && h.damage<50);
	}
	
	private static void filter(List<Hero> heros,HeroChecker checker){
		for (Hero hero : heros) {
			if(checker.test(hero))
				System.out.print(hero);
		}
	}

}
