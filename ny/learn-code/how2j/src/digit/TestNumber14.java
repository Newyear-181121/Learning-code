package digit;

public class TestNumber14 {
	
	public static void main(String[] args) {
		 
        String name ="����";
        int kill = 8;
        String title="����";
         
        //ֱ��ʹ��+�����ַ������ӣ�����о���ȽϷ���������ά���Բ�,�׶��Բ�
        String sentence = name+ " �ڽ��������� " + kill + " �λ�ɱ�󣬻���� " + title +" �ĳƺ�";
         
        System.out.println(sentence);
         
        //ʹ�ø�ʽ�����
        //%s��ʾ�ַ�����%d��ʾ����,%n��ʾ���� 
        String sentenceFormat ="%s �ڽ��������� %d �λ�ɱ�󣬻���� %s �ĳƺ�%n";
        System.out.printf(sentenceFormat,name,kill,title);
         
        
        
        /*	�����ʹ�ø�ʽ�����������Ҫ�����ַ������ӣ���������Ƚ϶࣬ƴ�Ӿͻ��Ե÷���
			ʹ�ø�ʽ��������Ϳ��Լ������

		%s ��ʾ�ַ���
		%d ��ʾ����
		%n ��ʾ���� 
         		*/
    }

}
