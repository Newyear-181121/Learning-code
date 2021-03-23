package digit;

/*
 * 数字封装类有 
 *Byte,Short,Integer,Long,Float,Double 
 *这些类都是抽象类Number的子类 
 */

public class TestNumber02 {
	
	public static void main(String[] args) {
        int i = 5;
         
        Integer it = new Integer(i);
        //Integer是Number的子类，所以打印true
        System.out.println(it instanceof Number);
    }

}
