package collection_2;


public class Test2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
		
		Node2_3 roots = new Node2_3();
		for(int number : randoms) {
			roots.add(number);
		//	System.out.println("û�а�������ȥ��"+randoms);  //��һ�±�����ǰ�ڵ�Ĵ�������ͺ��ˡ�
		}
		
		System.out.println(roots.values());		//��������������Object��
	}

}