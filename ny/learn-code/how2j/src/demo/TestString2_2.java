package demo;

public class TestString2_2 {
	
	public static void main(String[] args) {
		   
        String sentence = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
 
        char[] cs = sentence.toCharArray(); //��ȡ��Ӧ���ַ�����
         
        System.out.println(sentence.length() == cs.length);
         
    }
	
	//toCharArray()
	//��ȡ��Ӧ���ַ����� 

}
