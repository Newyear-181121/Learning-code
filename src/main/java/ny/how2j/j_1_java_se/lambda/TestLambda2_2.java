package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 引用对象方法
 * 		与引用静态方法很类似，只是传递方法的时候，需要一个对象的存在
 * 		TestLambda testLambda = new TestLambda();
 * 		filter(heros, testLambda::testHero);
 * @author New year
 *
 */
public class TestLambda2_2 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0 ; i < 5 ; i++) {
			heros.add(new Hero("hero " + i, r.nextInt(1000),r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		
		System.out.println("使用引用对象方法    的过滤结果：");
		//使用类的对象方法
		TestLambda2_2 testLambda = new TestLambda2_2();
		filter(heros, testLambda::testHero);
	}
	
	public boolean testHero(Hero h) {
		return h.hp>100 && h.damage<50	;
	}
/*	
	public static boolean testHero(Hero h) {		//参数一致的时候就算是修饰词一样也不行。
		return h.hp>100 && h.damage<50	;
	}
*/
	public static void filter(List<Hero> heros, HeroChecker checker) {
		for (Hero hero : heros) {
			if (checker.test(hero))
				System.out.println(hero);
		}
	}
}
