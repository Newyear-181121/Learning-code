package demo;

public class TestString3_1 {
	
	public static void main(String[] args) {
		 
        String str1 = "the light";
         
        String str2 = new String(str1);
         
        //==�����ж��Ƿ���ͬһ���ַ�������
        System.out.println( str1  ==  str2);
         
        //str1��str2������һ����һ���ģ� 
        //���ǣ�������ͬһ���ַ������� 
        
        
        
        String str4 = "the light";
        System.out.println( str1  ==  str4);
        
        //һ��˵����������ÿ����һ���ַ���������ֵ���ͻᴴ��һ���µĶ���
        //�����ڵ�7�лᴴ����һ���µ��ַ���"the light"
        //�����ڵ�19�У������������Ѿ������ֳɵ�"the light"����ô��ֱ������ʹ�ã���û�н����ظ�����
        
        String str3 = str1.toUpperCase();
        
        System.out.println(str1.equals(str2));//��ȫһ������true
        
        System.out.println(str1.equals(str3));//��Сд��һ��������false
        System.out.println(str1.equalsIgnoreCase(str3));//���Դ�Сд�ıȽϣ�����true
        
        
        //ʹ��equals�����ַ������ݵıȽϣ������Сдһ�� 
        //equalsIgnoreCase�����Դ�Сд�ж������Ƿ�һ�� 
        
        
        String start = "the";
        String end = "light";		//��Сд��ͬҲ�ᱨ��
         
        System.out.println(str1.startsWith(start));//��...��ʼ
        System.out.println(str1.endsWith(end));//��...����
        
        
    }

}
