package demo;

public class TestString2_4 {
	
	public static void main(String[] args) {
		   
        String sentence = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�";
         
        //����,���зָ�õ�3�����ַ���
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
           
    }
	
	//split 
	//���ݷָ������зָ� 

}
