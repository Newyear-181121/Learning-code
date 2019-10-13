package demo;

public class TestString01 {
	
	public static void main(String[] args) {
        String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象
         
        String teemo = new String("提莫"); //创建了两个字符串对象
         
        char[] cs = new char[]{'崔','斯','特'};
         
        String hero = new String(cs);//  通过字符数组创建一个字符串对象
         
        String hero3 = garen + teemo;//  通过+加号进行字符串拼接
        
        
        System.out.println(hero);
        
        System.out.println(hero3);
        
/*字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象 
常见创建字符串手段： 
1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串 
2. 调用String的构造方法创建一个字符串对象 
3. 通过+加号进行字符串拼接也会创建新的字符串对象 

*/
    }

}
