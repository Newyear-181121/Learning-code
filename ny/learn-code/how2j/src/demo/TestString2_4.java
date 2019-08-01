package demo;

public class TestString2_4 {
	
	public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
         
        //根据,进行分割，得到3个子字符串
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
           
    }
	
	//split 
	//根据分隔符进行分隔 

}
