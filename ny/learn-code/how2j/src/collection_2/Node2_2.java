package collection_2;


/**
 * ����������-�������� 
 * @author New year
 *
 *
 */
public class Node2_2 {

	// ���ӽڵ�
	public Node2_2 leftNode;
	// ���ӽڵ�
	public Node2_2 rightNode;
	
	// ֵ
	public Object value;
	
	// ���� ����
	public void add(Object v) {
		// �����ǰ�ڵ�û��ֵ���Ͱ����ݷ��ڵ�ǰ�ڵ���
		if (null == value) 
			value = v;
		
		// �����ǰ�ڵ���ֵ���ͽ����жϣ�������ֵ�뵱ǰֵ�Ĵ�С��ϵ
		else {
			// ������ֵ���ȵ�ǰֵС������ͬ
			if ((Integer) v -((Integer)value) <=0) {
				
				//�����ڵ�Ϊ�վͷ�����ڵ�
				if (null == leftNode)
					leftNode = new Node2_2();
				leftNode.add(v);				//�ݹ���á�
			}
			// ������ֵ���ȵ�ǰֵ��
			else {
				if(null == rightNode)
					rightNode = new Node2_2();
				rightNode.add(v);				//�ݹ����
			}
		}
	}
	
	public static void main(String[] args) {
		
		int randoms[] = new int[] {67,7, 30, 73, 10, 0, 78, 81, 10, 74 };
		
		Node2_2 roots = new Node2_2();
		for (int number : randoms) {
			roots.add(number);
		}
	}
}

/*
����ͨ��������������10���������������
67,7,30,73,10,0,78,81,10,74
����ĵ�һ�������ǰ����ݲ��뵽�ö�������
��������߼��ǣ�С����ͬ�ķ���ߣ���ķ��ұ�
1. 67 ���ڸ��ڵ�
2. 7 �� 67С������67����ڵ�
3. 30 ��67 С���ҵ�67����ڵ�7��30��7�󣬾ͷ���7���ҽڵ�
4. 73 ��67�� ����67���ҽڵ�
5. 10 �� 67С���ҵ�67����ڵ�7��10��7���ҵ�7���ҽڵ�30��10��30С������30����ڵ㡣
...
...
9. 10��67С���ҵ�67����ڵ�7��10��7���ҵ�7���ҽڵ�30��10��30С���ҵ�30����ڵ�10��10��10һ���󣬷������
*/