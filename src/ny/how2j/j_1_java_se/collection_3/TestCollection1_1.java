package collection_3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *  -�Ƿ���˳�� 
 *
 * ArrayList: ��˳��
 * HashSet: ��˳��
 * 
 *  -�ܷ��ظ� 
 * 
 * List�е����ݿ����ظ�
 * Set�е����ݲ��ܹ��ظ�
 * 
 * @author New year
 *
 *HashSet�ľ���˳�򣬼Ȳ��ǰ��ղ���˳��Ҳ���ǰ���hashcode��˳��
 *���仰˵��ͬ���ǲ���0-9��HashSet�У� ��JVM�Ĳ�ͬ�汾�У�������˳���ǲ�һ���ġ� �����ڿ�����ʱ�򣬲���������ĳ���ܲ��˳�����˳�����ǲ��ȶ��� 
 *
 * �ظ��жϱ�׼��:
 * ���ȿ�hashcode�Ƿ���ͬ
 * ���hashcode��ͬ������Ϊ�ǲ�ͬ����
 * ���hashcode��ͬ���ٱȽ�equals�����equals��ͬ��������ͬ���ݣ������ǲ�ͬ����
 * �����ϵhashcode��
 *
 */
public class TestCollection1_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		//List�е����ݰ��ղ���˳����
		System.out.println("----------List----------");
		System.out.println("��List �в��� 9 5 1");
		numberList.add(9);
		numberList.add(5);
		numberList.add(1);
		
		numberList.add(3);
        numberList.add(7);
        numberList.add(6);
        numberList.add(0);
		
		System.out.println("List ����˳��������:");
        System.out.println(numberList);
        
        System.out.println("+++��+++��List �в��� 9 9");
        numberList.add(9);
        numberList.add(9);
        System.out.println("List �г�������9:");
        System.out.println(numberList);
        
        
        System.out.println("----------Set----------------------------");
		
        HashSet<Integer> numberSet = new HashSet<Integer>();
        
        System.out.println("��Set �в���9 5 1");
        //Set�е����ݲ��ǰ��ղ���˳����
        numberSet.add(9);
        numberSet.add(5);
        numberSet.add(1);
        
        numberSet.add(3);
        numberSet.add(7);
        numberSet.add(6);
        numberSet.add(0);
        
        
        System.out.println("Set ���ǰ���˳��������:");
        System.out.println(numberSet);
		
		
        System.out.println("+++��+++��Set �в���9 9");
      //Set�е����ݲ����ظ�
        numberSet.add(9);
        numberSet.add(9);
        System.out.println("Set ��ֻ�ᱣ��һ��9:");
        System.out.println(numberSet);
		
		
	}

}
