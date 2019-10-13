package digit;

public class TestNumber14 {
	
	public static void main(String[] args) {
		 
        String name ="盖伦";
        int kill = 8;
        String title="超神";
         
        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
         
        System.out.println(sentence);
         
        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行 
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);
         
        
        
        /*	如果不使用格式化输出，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
			使用格式化输出，就可以简洁明了

		%s 表示字符串
		%d 表示数字
		%n 表示换行 
         		*/
    }

}
