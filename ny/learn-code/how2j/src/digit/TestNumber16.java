package digit;

import java.util.Locale;

public class TestNumber16 {
	
	public static void main(String[] args) {
		 
        System.out.printf("这是换行符%n");
        System.out.printf("这是换行符%n");
         
        
        
        /*	换行符就是另起一行 --- '\n' 换行（newline）
			回车符就是回到一行的开头 --- '\r' 回车（return）
			在eclipse里敲一个回车，实际上是回车换行符
			Java是跨平台的编程语言，同样的代码，可以在不同的平台使用，比如Windows,Linux,Mac
			然而在不同的操作系统，换行符是不一样的
			（1）在DOS和Windows中，每行结尾是 “\r\n”；
			（2）Linux系统里，每行结尾只有 “\n”；
			（3）Mac系统里，每行结尾是只有 "\r"。
			为了使得同一个java程序的换行符在所有的操作系统中都有一样的表现，使用%n，就可以做到平台无关的换行
			
			 */
        
        
        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
          
        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);
  
        //小数点位数
        System.out.format("%.2f%n",Math.PI);
          
        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
        
        
    }

}
