package digit;

/*
 * 所有的基本类型，都有对应的类类型 
 *比如int对应的类是Integer 
 *这种类就叫做封装类 
 */
public class TestNumber01 {
	
	public static void main(String[] args) {
        int i = 5;
         
        //把一个基本类型的变量,转换为Integer对象 
        Integer it = new Integer(i);
        
        //把一个Integer对象，转换为一个基本类型的int
        int i2 = it.intValue();
         
    }

}
