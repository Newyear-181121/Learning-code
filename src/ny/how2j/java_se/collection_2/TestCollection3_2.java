package collection_2;

import java.util.HashMap;

import character.Hero;

/**
 * �������ظ���ֵ�����ظ� 
 * @author New year
 *
 *����HashMap���ԣ�key��Ψһ�ģ��������ظ��ġ� 
 *���ԣ�����ͬ��key �Ѳ�ͬ��value���뵽 Map�лᵼ�¾�Ԫ�ر����ǣ�ֻ�����������Ԫ�ء� 
 *������ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ�� 
 */
public class TestCollection3_2 {

	public static void main(String[] args) {

		HashMap<String,Hero> heroMap = new HashMap<String,Hero>();	//����ķ��͹涨�������д�����ݵ�����
		
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
		
		//keyΪgareen�Ѿ���value�ˣ�����gareen��Ϊkey�������ݣ��ᵼ��ԭӢ�ۣ�������
        //���������µ�Ԫ�ص�Map��
		heroMap.put("gareen",new Hero("gareen2"));
		System.out.println(heroMap);
		
		 //���map
		heroMap.clear();
		Hero gareen = new Hero("gareen");
		
		//ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
		heroMap.put("hero1",gareen);
		heroMap.put("hero2", gareen);
		
										//ʹ��put�����²����ֵ����ŵ���һ����
		heroMap.put("hero3",gareen);
		heroMap.put("1",new Hero("temmo"));
		
		heroMap.put("2", gareen);
		heroMap.put("3", gareen);
		heroMap.put("4", gareen);
										//ʲô��˳��Ŷ��ʲô������򣿣���
		
		System.out.println(heroMap);
	}

}
