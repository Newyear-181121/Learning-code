package demo;

public class TestString2_7 {
	
	public static void main(String[] args) {
	    
        String sentence = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
  
        System.out.println(sentence.indexOf('8')); //�ַ���һ�γ��ֵ�λ��
          
        System.out.println(sentence.indexOf("����")); //�ַ�����һ�γ��ֵ�λ��
          
        System.out.println(sentence.lastIndexOf("��")); //�ַ��������ֵ�λ��
          
        System.out.println(sentence.indexOf(',',5)); //��λ��5��ʼ�����ֵĵ�һ��,��λ��
          
        System.out.println(sentence.contains("��ɱ")); //�Ƿ�����ַ���"��ɱ"
          
    }
	
	//indexOf �ж��ַ��������ַ������ֵ�λ��
	//contains �Ƿ�������ַ��� 

}
