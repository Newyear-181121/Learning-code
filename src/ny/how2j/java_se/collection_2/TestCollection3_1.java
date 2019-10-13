package collection_2;

import java.util.HashMap;

/**
 * HashMap的键值对 
 * @author New year
 *
 *HashMap储存数据的方式是—— 键值对 
 */
public class TestCollection3_1 {
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap<>();
		dictionary.put("adc","物理英雄");
		dictionary.put("apc", "魔法英雄");
		dictionary.put("t", "坦克");
		
		System.out.println(dictionary.get("t"));
	}

}
