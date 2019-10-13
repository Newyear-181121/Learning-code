package collection_2;

import java.util.LinkedList;

import character.Hero;

/**
 * ˫������ - Deque 
 * @author New year
 *
 *
 *����ʵ����List�ӿ��⣬LinkedList��ʵ����˫������ṹDeque�����Ժܷ������ͷβ����ɾ������
 *
 *ʲô������ṹ: ������ṹ��Ƚϣ�����ṹ���ͺ����ǵ�ӰԺ��ÿ��λ�ö��б�ʾ��ÿ��λ��֮��ļ������һ���ġ� ��������൱�ڷ��飬ÿ�����ӣ�ֻ����ǰһ���ͺ�һ�������ù��ĳ���֮���������������� 
 */
public class TestCollection1_2 {

	public static void main(String[] args) {

		//LinkedList��һ��˫������ṹ��list
		LinkedList<Hero> ll = new LinkedList<Hero>();
		
		//���Կ��Ժܷ������ͷ����β����������
        //���������µ�Ӣ��
		
		ll.addLast(new Hero("hero1"));	//һ��������
		ll.addLast(new Hero("hero2"));	//һ��������
		ll.addLast(new Hero("hero3"));	//һ��������			//һ��������������
		System.out.println(ll);
		
		//����ǰ������µ�Ӣ��
		ll.addFirst(new Hero("heroX"));
		System.out.println(ll);
		
		//�鿴��ǰ���Ӣ��
		System.out.println(ll.getFirst());
		
		//�鿴������Ӣ��
		System.out.println(ll.getLast());
		
		//�鿴���ᵼ��Ӣ�۱�ɾ��
		System.out.println(ll);
		//ȡ����ǰ���Ӣ��
		System.out.println(ll.removeFirst());
		
		//ȡ��������Ӣ��
		System.out.println(ll.removeLast());
		
		//ȡ���ᵼ��Ӣ�۱�ɾ��
		System.out.println(ll);
	}

}
