package collection_2;

import java.util.HashSet;

/**
 * û��˳�� 
 * @author New year
 *
 *Set�е�Ԫ�أ�û��˳�� 
 *�ϸ��˵����û�а���Ԫ�صĲ���˳������
 *
 *HashSet�ľ���˳�򣬼Ȳ��ǰ��ղ���˳��Ҳ���ǰ���hashcode��˳�򡣹���hashcode��ר�ŵ��½ڽ���: hashcode ԭ��
 *
 *���仰˵��ͬ���ǲ���0-9��HashSet�У� ��JVM�Ĳ�ͬ�汾�У�������˳���ǲ�һ���ġ� �����ڿ�����ʱ�򣬲���������ĳ���ܲ��˳�����˳�����ǲ��ȶ��� 
 */
public class TestCollection4_2 {

	public static void main(String[] args) {

		HashSet<Integer> numbers = numbers = new HashSet<Integer>();
		
		numbers.add(9);
		numbers.add(5);
		numbers.add(1);
		
		// Set�е�Ԫ�����У����ǰ��ղ���˳��
		System.out.println(numbers);
	}

}
