package collection_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *    ArrayList��LinkedList
 * 
 * @author New year
 *
 * ArrayList��LinkedList������ 
 * 
 * ArrayList ���룬ɾ��������
 * LinkedList�� ���룬ɾ�����ݿ�
 * 
 * ArrayList��˳��ṹ�����Զ�λ�ܿ죬ָ�����ġ� �����ӰԺλ��һ�������˵�ӰƱ��һ�¾��ҵ�λ���ˡ�
 * LinkedList ������ṹ�����������һ�����飬Ҫ�ҳ���99�����飬�����һ��һ��������ȥ�����Զ�λ�� 
 */
public class TestCollection2_2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		insertFirst(l, "ArrayList");
		modify(l,"ArrayList");				//�޸����ݸ���
		
		l = new LinkedList<>();
		insertFirst(l, "LinkedList"); 		//�������ݸ���
		modify(l,"LinkedList");
	}

	/**
	 * �������� 
	 * @param l
	 * @param type
	 */
	private static void insertFirst(List<Integer> l, String type) {
		int total = 1000 * 100;
		final int number = 5 ;
		long start = System.currentTimeMillis();
		for (int i = 0 ; i < total ; i++) {
			l.add(0,number);
		}
		long end = System.currentTimeMillis();
		System.out.printf("��%s ��ǰ�����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, end - start);
	}
	
	
	/**
	 * ��λ���� 
	 * @param l
	 * @param type
	 */
	private static void modify(List<Integer> l, String type) {
		int total = 100 * 1000 ; 
		int index = total/2 ;
		final int number = 5 ;
		//��ʼ��
		for ( int i = 0 ; i < total ; i++) {
			l.add(number);
			
		}
		
		long start = System.currentTimeMillis();
		
		for ( int i = 0 ; i < total ; i++) {
			int n = l.get(index);
			n++;
			l.set(index, n);
		}
		long end = System.currentTimeMillis();
		System.out.printf("%s�ܳ�����%d����λ����%d�����ݣ�ȡ��������1���ٷŻ�ȥ%n �ظ�%d�飬�ܹ���ʱ %d ���� %n", type,total, index,total, end - start);
		System.out.println();
	}
	
	
	
}
