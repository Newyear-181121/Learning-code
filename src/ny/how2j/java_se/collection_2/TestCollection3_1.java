package collection_2;

import java.util.HashMap;

/**
 * HashMap�ļ�ֵ�� 
 * @author New year
 *
 *HashMap�������ݵķ�ʽ�ǡ��� ��ֵ�� 
 */
public class TestCollection3_1 {
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap<>();
		dictionary.put("adc","����Ӣ��");
		dictionary.put("apc", "ħ��Ӣ��");
		dictionary.put("t", "̹��");
		
		System.out.println(dictionary.get("t"));
	}

}
