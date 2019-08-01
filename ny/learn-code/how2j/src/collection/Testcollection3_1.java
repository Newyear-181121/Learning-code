package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList和List
 * @author New year
 *		
 *		ArrayList实现了接口List
 *		常见的写法会把引用声明为接口List类型
 *		注意：是java.util.List,而不是java.awt.List
 */
public class Testcollection3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ArrayList实现了接口List
        
        //常见的写法会把引用声明为接口List类型
        //注意：是java.util.List,而不是java.awt.List
        //接口引用指向子类对象（多态）
         
        List heros = new ArrayList();
        heros.add( new Hero1_1("盖伦"));
        System.out.println(heros.size());
	}

}
