package digit;

/*
 * ���ַ�װ���� 
 *Byte,Short,Integer,Long,Float,Double 
 *��Щ�඼�ǳ�����Number������ 
 */

public class TestNumber02 {
	
	public static void main(String[] args) {
        int i = 5;
         
        Integer it = new Integer(i);
        //Integer��Number�����࣬���Դ�ӡtrue
        System.out.println(it instanceof Number);
    }

}
