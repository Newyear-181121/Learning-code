package demo;

public class TestString01 {
	
	public static void main(String[] args) {
        String garen ="����"; //����ֵ,�������������ֵ�ͻᴴ��һ���ַ�������
         
        String teemo = new String("��Ī"); //�����������ַ�������
         
        char[] cs = new char[]{'��','˹','��'};
         
        String hero = new String(cs);//  ͨ���ַ����鴴��һ���ַ�������
         
        String hero3 = garen + teemo;//  ͨ��+�ӺŽ����ַ���ƴ��
        
        
        System.out.println(hero);
        
        System.out.println(hero3);
        
/*�ַ������ַ�����ϣ���Java�У��ַ�����һ���࣬�������Ǽ������ַ������Ƕ��� 
���������ַ����ֶΣ� 
1. ÿ����һ������ֵ���ֵ�ʱ��������ͻᴴ��һ���ַ��� 
2. ����String�Ĺ��췽������һ���ַ������� 
3. ͨ��+�ӺŽ����ַ���ƴ��Ҳ�ᴴ���µ��ַ������� 

*/
    }

}
