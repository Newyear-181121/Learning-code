package demo;

public class TestString2_8 {
	
	public static void main(String[] args) {
		   
        String sentence = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
 
        String temp = sentence.replaceAll("��ɱ", "����ɱ"); //�滻���е�
         
        temp = temp.replaceAll("����", "����");
         
        System.out.println(temp);
         
        temp = sentence.replaceFirst(",","");//ֻ�滻��һ��
         
        System.out.println(temp);
         
    }

}
