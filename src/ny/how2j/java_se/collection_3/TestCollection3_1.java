package collection_3;

import java.util.HashMap;
import java.util.Hashtable;

public class TestCollection3_1 {

	public static void main(String[] args) {

		//HashMap��Hashtable��ʵ����Map�ӿڣ����Ǽ�ֵ�Ա������ݵķ�ʽ
		
		HashMap<String,String> hashMap = new HashMap<String,String>();
		
		//HashMap������null��key,��value
		hashMap.put(null,"123");
		hashMap.put("123", null);
		
		Hashtable<String,String> hashtable = new Hashtable<String,String>();
		
		//Hashtable������null��key��������null��value
		//hashtable.put(null, "124");
		//hashtable.put("123", null);
		//	���׳��쳣��������null ������Ҳ������null ��ֵ
	}

}
