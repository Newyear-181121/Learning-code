package collection;

import java.util.ArrayList;

/**
 *   �ж��Ƿ����
 *   	ͨ������contains �ж�һ�������Ƿ���������
 *   	�жϱ�׼�� �Ƿ���ͬһ�����󣬶�����name�Ƿ���ͬ
 * @author New year
 *
 */
public class TestCollection2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList heros = new ArrayList();
		
		//��ʼ��5������
		for ( int i = 0; i < 5 ; i++) {
			heros.add(new Hero1_1("hero" + i));		//add �����еĶ����������          �����һ��Hero1_1����
			
		}
		Hero1_1 specialHero = new Hero1_1("special hero");
		heros.add(specialHero);
		
		System.out.println(heros);
		//�ж�һ�������Ƿ���������
		//�жϱ�׼�� �Ƿ���ͬһ�����󣬶�����name�Ƿ���ͬ
		System.out.print("��Ȼһ���µĶ�������Ҳ�� hero 1������contains�ķ�����:");
		System.out.println(heros.contains(new Hero1_1("hero 1")));		//������ҵ�contains�е��������µĶ�����new��
		//����Ҽ�һ�����hero 1 ����䷵��ֵӦ����true��
		//System.out.println(heros.contains(hero1));		��ʼ��ʱû�и�ArrayList�е�hero1��Ӷ������ã������������hero1 �� JVM����ȷ������˭
        System.out.print("����specialHero���жϣ�contains�ķ�����:");
        System.out.println(heros.contains(specialHero));		//����һ��ʼ�͸�specialHero����˶������ã�������ӽ�ArrayList��specialHero�����֣�����ͨ������ȷ�����Ƿ�������ArrayList��
		
		
		
	}

}
