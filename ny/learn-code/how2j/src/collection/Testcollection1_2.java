package collection;

import java.util.ArrayList;


/**
 * ArrayList��Ŷ���
 * @author New year
 * 
 * 		Ϊ�˽������ľ����ԣ�����������ĸ�� �������������� 
 *		ArrayList 
 *		����������"capacity"�����Ŷ�������ӣ��Զ����� 
 *		ֻ��Ҫ����������������Ӣ�ۼ��ɣ����õ��Ļ��������ı߽����⡣
 *		����Ƚ� ���ƴ���
 *
 *
 */
public class Testcollection1_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		ArrayList heros = new ArrayList();		//����Ҳ�Ƕ�������������
		heros.add(  new Hero1_1("����"));		//ʹ��add�����������
		System.out.println(heros.size());
		
		//
		//
		heros.add( new Hero1_1("��Ī"));
		System.out.println(heros.size());
	}

}
