package collection_3;

import java.util.HashMap;
import java.util.Hashtable;

public class TestCollection3_1 {

	public static void main(String[] args) {

		//HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
		
		HashMap<String,String> hashMap = new HashMap<String,String>();
		
		//HashMap可以用null作key,作value
		hashMap.put(null,"123");
		hashMap.put("123", null);
		
		Hashtable<String,String> hashtable = new Hashtable<String,String>();
		
		//Hashtable不能用null作key，不能用null作value
		//hashtable.put(null, "124");
		//hashtable.put("123", null);
		//	会抛出异常。不能用null 做键，也不能用null 做值
	}

}
