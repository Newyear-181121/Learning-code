package exception;


/**
 * ����
 * 		����Error��ָ����ϵͳ������쳣��ͨ�����ڴ��ù���
 * 		��Ĭ�������£�һ��java����������ʱ��������ʹ��16m���ڴ�
 * 		������ͣ�ĸ�StringBuffer׷���ַ����ܿ�Ͱ��ڴ�ʹ�ù��ˡ��׳�OutOfMemoryError
 * 		������ʱ�쳣һ��������Ҳ�ǲ�Ҫ��ǿ�Ʋ�׽��
 * @author New year
 *
 */
public class TestException3_3 {
	
	public static void main(String[] args){
		
		//����һ�����������������ַ����໹��һ����Stringbuild//������������֣����ǲ�����
		
		//StringBuffer�ǿɱ䳤���ַ���
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < Integer.MAX_VALUE; i++){
			sb.append('a');
		}
	}

}


/*
 �������쳣�����ࣺ 
1. ����
2. ����ʱ�쳣		��ɲ��쳣��֮ͬ�����ڣ����㲻����try catch��Ҳ�����б������ 
3. �ɲ��쳣

*/



