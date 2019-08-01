package collection_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection1_1 {

	public static void main(String[] args) {
		
		List<Hero> heros = new ArrayList<Hero>();
		
		for (int j = 0 ; j < 2000000 ; j++) {
			Hero h = new Hero("Hero" + j);
			heros.add(h);
		}
		System.out.println(heros.get(10));
		
		
		// ����10�β��ң��۲�����ƽ��ֵ
		for (int i = 0 ; i < 10; i++) {
			// ����heros��Ԫ�ص�˳��
			Collections.shuffle(heros);
			
			long start = System.currentTimeMillis();
			
			String target = "Hero 1000000" ;
			
			for (Hero hero : heros) {
				if(hero.name.equals(target)) {
					System.out.println("�ҵ��� hero!" );
					break;
				}
			}
			long end = System.currentTimeMillis();
			long elapsed = end - start ;
			System.out.println("һ�����ˣ�" + elapsed + " ����");
			System.out.printf("��%d�β�ѯ����%d����%n",i+1,elapsed);
		}
	}

}

class Hero{
	
	String name ;
	int hp ;
	public Hero(String string) {
		this.name = string ;
	}
}