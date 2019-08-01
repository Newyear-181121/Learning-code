package digit;


/**
 * 类型转换
 * @author New year
 *
 */
public class TestNumber03 {
	
	public static void main(String[] args) {
        int i = 5;
 
        //基本类型转换成封装类型
        Integer it = new Integer(i);
         
        //封装类型转换成基本类型
        int i2 = it.intValue();
         
    }

}
