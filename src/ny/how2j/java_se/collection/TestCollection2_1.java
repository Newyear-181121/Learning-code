package collection;

import java.util.ArrayList;

/**
 * ����   		add
 * @author New year
 *
 */
public class TestCollection2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList heros = new ArrayList();
		
		//��5��������뵽ArrayList��
		for (int i = 0; i < 5; i++){
			heros.add(new Hero1_1("hero" + i));
		}
		System.out.println(heros);
		
		
		
		Hero1_1 specialHero = new Hero1_1("special hero");
		heros.add(3,specialHero);		//	��ָ��λ�����Ӷ���
		
		System.out.println(heros.toString());
	}

}

/**
 * contains	�ж��Ƿ����
 * get		��ȡָ��λ�õĶ���	
 *indexOf	��ȡ����������λ��	
 *remove	ɾ��	
 *set		�滻	
 *size		��ȡ��С	
 *toArray	ת��Ϊ����	
 *addAll	����һ���������ж��󶼼ӽ���	
 *clear		���	

 */
