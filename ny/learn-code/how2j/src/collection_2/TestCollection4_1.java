package collection_2;

import java.util.HashSet;

/**
 * Ԫ�ز����ظ� 
 * @author New year
 *Set�е�Ԫ�أ������ظ� 
 */
public class TestCollection4_1 {

	public static void main(String[] args) {

		HashSet<String> names = new HashSet<String>();
		
		names.add("gareen");
		
		System.out.println(names);
		
		//�ڶ��β���ͬ�������ݣ��ǲ岻��ȥ�ģ�������ֻ�ᱣ��һ��
		names.add("gareen");
		System.out.println(names);
		
	}

}
