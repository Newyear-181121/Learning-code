package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import character.Hero;

/**
 * ����������
 * @author New year
 *ʹ�õ�����Iterator���������е�Ԫ�� 
 *
 *hasNext�ж��Ƿ�����һ��������о�ȡ������Ȼ��ָ��������
 *ֱ���ƶ������һ��λ�ã�hasNext����false����ʾ����û�������ˣ�������ϡ�
 */
public class TestCollection5_2 {
	
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<Hero>();
		
		//��5��Hero��������
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero name " +i));
        }
        
      //�ڶ��ֱ�����ʹ�õ�����
        System.out.println("--------ʹ��while��iterator-------");
        Iterator<Hero> it = heros.iterator();
        
        //���ʼ��λ���ж�"��һ��"λ���Ƿ�������
        //����о�ͨ��nextȡ���������Ұ�ָ�������ƶ�
        //ֱ��"��һ��"λ��û������
        
        while(it.hasNext()) {
        	Hero h = it.next();
        	System.out.println(h);
        }
        
        //��������forд��
        System.out.println("--------ʹ��for��iterator-------");
        for (Iterator<Hero> iterator = heros.iterator(); iterator.hasNext();){
        	Hero hero = (Hero) iterator.next();
        	System.out.println(hero);
        }
        
        
	}

}
