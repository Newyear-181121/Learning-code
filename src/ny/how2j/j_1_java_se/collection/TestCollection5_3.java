package collection;

import java.util.ArrayList;
import java.util.List;

import character.Hero;

/**
 * ����ǿ��forѭ�� 
 * @author New year
 *
 *ʹ����ǿ��forѭ�����Էǳ�����ı���ArrayList�е�Ԫ�أ����Ǻܶ࿪����Ա����ѡ��
 *
 *������ǿ��forѭ��Ҳ�в��㣺
 *�޷���������ArrayList�ĳ�ʼ��
 *�޷���֪��ǰ�ǵڼ���Ԫ���ˣ�����Ҫֻ��ӡ����Ԫ�ص�ʱ�򣬾��������ˡ� �������Զ��±������ 
 *
 */
public class TestCollection5_3 {

	public static void main(String[] args) {

		List<Hero> heros = new ArrayList<Hero>();
		
		// ��5��Hero��������
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " + i));
        }
        
     // �����֣���ǿ��forѭ��
        System.out.println("--------��ǿ��forѭ��-------");
		for (Hero h : heros) {
			System.out.println(h);
		}
	}

}
