package digit;

public class TestNumber15 {
	
	public static void main(String[] args) {
		 
        String name ="����";
        int kill = 8;
        String title="����";
         
        String sentenceFormat ="%s �ڽ��������� %d �λ�ɱ�󣬻���� %s �ĳƺ�%n";
        //ʹ��printf��ʽ�����
        System.out.printf(sentenceFormat,name,kill,title);
        //ʹ��format��ʽ�����
        System.out.format(sentenceFormat,name,kill,title);
         
    }

}
