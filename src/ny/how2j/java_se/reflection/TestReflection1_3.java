package reflection;

import java.lang.reflect.Constructor;

/**
 * 获取类对象的时候，会导致类属性被初始化
 * @author New year
 *
 *
 *为Hero增加一个静态属性,并且在静态初始化块里进行初始化，参考 类属性初始化。 
 *
 *static String copyright;
 *static {
 *   System.out.println("初始化 copyright");
 *   copyright = "版权由Riot Games公司所有";
 *}
 *
 *
 *无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次。（除了直接使用 Class c = Hero.class 这种方式，这种方式不会导致静态属性被初始化）
 */
public class TestReflection1_3 {
	
	public static void main(String[] args) {
		String className = "reflection.Hero";
		
		try {
			/**
			 * 这里三种获取类对象的途径一起使用时，静态初始化只会进行一次。
			 */
			Class pClass1 = Class.forName(className);		//只有静态块初始化了，，构造函数没有初始化
			Class pClass2 = Hero.class;				//没有静态初始化
			Class pClass3 = new Hero().getClass();			//静态块，非静态块，构造函数，全部初始化了
		} catch (/*ClassNotFound*/Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("——————————————————————————————————————");
		System.out.println("下面的类没有直接执行");
		System.out.println("下面的类虽然有主函数的入口，但是不会执行");
		
	}

}

//如果把import 放在这里上面的code会全部报错。

/**
 * 创建一个对象
 * @author New year
 *
 *通过反射机制创建一个对象
 */

class TestRefliction2_1 {
	public static void main(String[] args) {
        //传统的使用new的方式创建对象
        Hero h1 =new Hero();
        h1.name = "teemo";
        System.out.println(h1);
          
        try {
            //使用反射的方式创建对象
            String className = "charactor.Hero";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            Constructor c= pClass.getConstructor();
            //通过构造器实例化
            Hero h2= (Hero) c.newInstance();
            h2.name="gareen";
            System.out.println(h2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
