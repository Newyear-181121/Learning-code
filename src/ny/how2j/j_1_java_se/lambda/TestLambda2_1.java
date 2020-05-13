package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ���þ�̬����
 * @author New year
 *
 */
public class TestLambda2_1 {

	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0 ; i < 5 ; i++) {
			heros.add(new Hero("hero " + i, r.nextInt(1000),r.nextInt(100)));
			
		}
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(heros);
		
		HeroChecker c = new HeroChecker() {
			public boolean test(Hero h) {
				return h.hp>100 && h.damage<50;
			}
		};		//���������������
		
		System.out.println("ʹ�����������");
		filter(heros,c);
		System.out.println("ʹ��Lambda����ʽ");
		filter(heros, h -> h.hp > 100 && h.damage < 50 );
		System.out.println("��Lambda����ʽ��ʹ�þ�̬����");
		filter(heros, h -> TestLambda2_1.testHero(h));
		//ֱ�����þ�̬����
		System.out.println("ֱ�����þ�̬����");
		filter(heros, TestLambda2_1::testHero);
		
	}
	
	public static boolean testHero(Hero h) {
		return h.hp>100 && h.damage<50;
	}
	
	public static void filter(List<Hero> heros, HeroChecker checker	 ) {
		for ( Hero hero : heros) {
			if (checker.test(hero))
				System.out.print(hero);
		}
	}
}