package demo;

public class TestString2_3 {
	
	public static void main(String[] args) {
		   
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
         
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3); 
         
        System.out.println(subString1);
         
        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串 
        //左闭右开
        String subString2 = sentence.substring(1,7); 
         
        System.out.println(subString2);
         
    }
	
	//subString 
	//截取子字符串 

}
