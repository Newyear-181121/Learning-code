package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ��ͨ����
 * @author New year
 *
 *		ʹ��һ����ͨ��������forѭ�������н��������жϣ�ɸѡ����������������
 *
 *		hp>100 && damage<50
 */
public class TestLambda1_1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//����������һ��Hero���͵�����  
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 10; i++){
			//��������������
			heros.add(new Hero("hero " + i, r.nextInt(10000),r.nextInt(100)));	
			//ÿ����һ���ʹ�ӡһ��
			//System.out.println(heros);
			//���ﻹ���ӵúá�
		}
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(heros);
		System.out.println("ɸѡ�� hp>100 && damange<50��Ӣ��");
		filter(heros);
	}
	
	private static void filter(List<Hero> heros) {
		for (Hero hero : heros) {
			if(hero.hp>100 && hero.damage<50)
				System.out.print(hero);
		}
	}

}
