package collection;

//import charactor.Hero;
//�ڶ���ʹ�ø��ڵ�Hero1_1�࣬������ʲô��ͬ��Ч��           ����һ���ģ�ֻ����д��һ��toString����


/**
 * 	ʹ������ľ�����
 * @author New year
 *
 */
public class Testcollection1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ľ�����
		
		/**
		 * ͨһ�����У�������Ҫ������࣬����ֱ��ʹ��
		 */
		Hero1_1  heros[] = new Hero1_1[10];		//�������������û�е��ù��캯��
		//����������10������
		//���õ�������˷���
		//����10���������ַŲ���
		heros[0] = new Hero1_1("����");
				//�Ų���Ҫ����
		System.out.println("��һ��Ӧ����ִ����");
		heros[20] = new Hero1_1("��Ī");				//�ȵ����๹�캯��     Ȼ�����õĹ����г��ִ����׳��쳣����ֹ�˳�����������С�
		System.out.println("��һ��Ӧ����û��ִ�е�");
	}

}
 