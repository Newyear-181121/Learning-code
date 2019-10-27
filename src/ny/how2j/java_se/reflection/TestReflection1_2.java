package reflection;


/**
 * 获取类对象
 * @author New year
 *
 *获取类对象有3种方式
 *1. Class.forName
 *2. Hero.class
 *3. new Hero().getClass()
 *
 *在一个JVM中，一种类，只会有一个类对象存在。所以以上三种方式取出来的类对象，都是一样的。
 *
 *注： 准确的讲是一个ClassLoader下，一种类，只会有一个类对象存在。通常一个JVM下，只会有一个ClassLoader。因为还没有引入ClassLoader概念， 所以暂时不展开了。
 */
public class TestReflection1_2 {

	public static void main(String[] args) {
        String className = "reflection.Hero";//全类名
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
            System.out.println(pClass2==pClass3);
            
            System.out.println(pClass1.getName());//只能用get方法获取他的名字。//从包名开始打印
            System.out.println(pClass1.getSimpleName());//简单名字
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
  //     System.out.println(pClass1.name);
}
	
}
