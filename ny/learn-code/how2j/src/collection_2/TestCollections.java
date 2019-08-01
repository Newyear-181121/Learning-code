package collection_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections��һ���࣬�����Ĺ�����,����ͬArrays������Ĺ����� 
 * @author New year
 *
 *һЩ�����ķ���ʹ��
 */
public class TestCollections {

	public static void main(String[] args) {

		//��ʼ������numbers
		List<Integer> numbers = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++) {
			numbers.add(i);
			numbers.add(5*i);
		}
		
		System.out.println("�����е�����:");
		System.out.println(numbers);
		
		
		//reverse ʹList�е����ݷ�����ת
		Collections.reverse(numbers);
		
		System.out.println("��ת�󼯺��е�����:");
        System.out.println(numbers);
        
        
        
        //shuffle ����List�����ݵ�˳�� 
        Collections.shuffle(numbers);
        
        System.out.println("�����󼯺��е�����:");
        System.out.println(numbers);
        
        
        //sort ��List�е����ݽ������� 
        Collections.sort(numbers);
        System.out.println("����󼯺��е�����:");
        System.out.println(numbers);
        
        
        //swap �����������ݵ�λ�� 
        Collections.swap(numbers, 5, 15);
        System.out.println("����5��15�±�����ݺ󣬼����е�����:");//�±��Ǵ��㿪ʼ��
        System.out.println(numbers);
        
        
        
        //rotate ��List�е����ݣ����ҹ���ָ����λ�ĳ��� 
        Collections.rotate(numbers, 10);
        System.out.println("�Ѽ������ҹ���2����λ��������ݺ󣬼����е�����:");
        System.out.println(numbers);
        
        
        
        //synchronizedList �ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List�� ��Ϊ����ĿǰΪֹ����û��ѧϰ�̰߳�ȫ�����ݣ���ʱ��չ���� �̰߳�ȫ�����ݽ��ڶ��߳��½�չ���� 
        System.out.println("�ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
	}

}
