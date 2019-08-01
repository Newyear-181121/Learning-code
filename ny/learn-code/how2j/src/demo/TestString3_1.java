package demo;

public class TestString3_1 {
	
	public static void main(String[] args) {
		 
        String str1 = "the light";
         
        String str2 = new String(str1);
         
        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);
         
        //str1和str2的内容一定是一样的！ 
        //但是，并不是同一个字符串对象 
        
        
        
        String str4 = "the light";
        System.out.println( str1  ==  str4);
        
        //一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
        //所以在第7行会创建了一个新的字符串"the light"
        //但是在第19行，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建
        
        String str3 = str1.toUpperCase();
        
        System.out.println(str1.equals(str2));//完全一样返回true
        
        System.out.println(str1.equals(str3));//大小写不一样，返回false
        System.out.println(str1.equalsIgnoreCase(str3));//忽略大小写的比较，返回true
        
        
        //使用equals进行字符串内容的比较，必须大小写一致 
        //equalsIgnoreCase，忽略大小写判断内容是否一致 
        
        
        String start = "the";
        String end = "light";		//大小写不同也会报错
         
        System.out.println(str1.startsWith(start));//以...开始
        System.out.println(str1.endsWith(end));//以...结束
        
        
    }

}
