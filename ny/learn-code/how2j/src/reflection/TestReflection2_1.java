package reflection;

import java.lang.reflect.Constructor;

/**
 * 通过反射机制创建一个对象
 * @author New year
 *
 *这里都是用Hero类来做例子
 */
public class TestReflection2_1 {

	public static void main(String[] args) {

		 //传统的使用new的方式创建对象
        Hero h1 =new Hero();
        h1.name = "teemo";
        System.out.println(h1);//reflection.Hero@139a55 ---->@后面是地址吗？
        System.out.println("---------+++--------");
          
        try {
            //使用反射的方式创建对象
            String className = "reflection.Hero";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            Constructor c= pClass.getConstructor();
            //通过构造器实例化
            Hero h2= (Hero) c.newInstance();
            
            System.out.println("-----------------");
            System.out.println("这里为什么没有打印？");
            System.out.println("这里弄成charactor类里面的Hero类了");
            
            h2.name="gareen";
            System.out.println(h2);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
