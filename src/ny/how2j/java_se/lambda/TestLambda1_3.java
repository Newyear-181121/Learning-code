package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Lambda��ʽ
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
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(heros);
		System.out.println("ʹ��Lanbda�ķ�����ɸѡ�� ");
		filter(heros,h->h.hp>100 && h.damage<50);
	}
	
	private static void filter(List<Hero> heros,HeroChecker checker){
		for (Hero hero : heros) {
			if(checker.test(hero))
				System.out.print(hero);
		}
	}

}
