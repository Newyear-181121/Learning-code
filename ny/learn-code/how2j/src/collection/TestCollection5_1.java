package collection;

import java.util.ArrayList;
import java.util.List;

import character.Hero;

/**
 * ��forѭ������ 
 * @author New year
 *
 *ͨ��ǰ���ѧϰ��֪���˿�����size()��get()�ֱ�õ���С���ͻ�ȡָ��λ�õ�Ԫ�أ����forѭ���Ϳ��Ա�����ArrayList������
 */
public class TestCollection5_1 {
	
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<Hero>();
		
		// ��5��Hero��������
		for (int i = 0; i< 5; i++) {
			heros.add(new Hero ("hero name " + i));
		}
		
		 // ��һ�ֱ��� forѭ��
		System.out.println("-------------forѭ��-*--------");
		for (int i = 0; i<heros.size();i++){
			Hero h = heros.get(i);		//�õ�������λ��Ϊi��Ԫ��
			System.out.println(h);		//������Ԫ�����
		}
	}

}
