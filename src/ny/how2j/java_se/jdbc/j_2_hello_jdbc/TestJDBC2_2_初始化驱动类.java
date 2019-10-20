/**
 * j_1_    ---是安装MySQL数据库。
 */
package jdbc.j_2_hello_jdbc;


/**
 *   初始化驱动 类
 * @author New year
 *
 *
 *通过Class.forName("com.mysql.jdbc.Driver");
 *初始化驱动类com.mysql.jdbc.Driver
 *就在 mysql-connector-java-5.0.8-bin.jar中    ---- 1 - 把驱动jar包放在类这了类的包下。
 *如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
 *
 *Class.forName是把这个类加载到JVM中，加载的时候，就会执行其中的静态初始化块，完成驱动的初始化的相关工作。 
 */
public class TestJDBC2_2_初始化驱动类 {

	public static void main(String[] args) {

		//初始化驱动
        try {
            //驱动类com.mysql.jdbc.Driver
            //就在 mysql-connector-java-5.0.8-bin.jar中
            //如果忘记了导包，就会抛出ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
              
            System.out.println("数据库驱动加载成功 ！");
   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("没有驱动动类。");
        }
	}

}
/*
 			初始化驱动了也没有用，，，，主机上没有装MySQL 数据库，
 			只有在虚拟机上才装了数据库。
 			
 			引用的库   是用来给数据库用的。
 			
 			
 			
 */
