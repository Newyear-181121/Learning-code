package collection;

import java.util.ArrayList;

/**
 * ��ȡָ��λ�õĶ���
 * @author New year
 *		ͨ��get��ȡָ��λ�õĶ������������±�Խ�磬һ���ᱨ��
 */
public class TestCollection2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList heros = new ArrayList();
		 
        // ��ʼ��5������
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero1_1("hero " + i));
        }
        Hero1_1 specialHero = new Hero1_1("special hero");
        heros.add(specialHero);
         
        //��ȡָ��λ�õĶ���
        System.out.println(heros.get(5));
        //��������˷�Χ����Ȼ�ᱨ��
        System.out.println(heros.get(6));
	}

}
