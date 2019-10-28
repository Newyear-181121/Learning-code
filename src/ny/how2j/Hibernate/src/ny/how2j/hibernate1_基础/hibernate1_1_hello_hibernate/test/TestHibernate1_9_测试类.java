package ny.how2j.hibernate1_基础.hibernate1_1_hello_hibernate.test;

import ny.how2j.hibernate1_基础.hibernate1_1_hello_hibernate.pojo.Product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;       //原来的加载文件的类。

import ny.how2j.hibernate1_基础.hibernate1_1_hello_hibernate.myutil.MyConfiguration;      //自己的加文件的类。


/**
 * 创建一个Product对象，并通过hibernate把这个对象，插入到数据库中
 *
 * hibernate的基本步骤是：
 * 1. 获取SessionFactory
 * 2. 通过SessionFactory 获取一个Session
 * 3. 在Session基础上开启一个事务
 * 4. 通过调用Session的save方法把对象保存到数据库
 * 5. 提交事务
 * 6. 关闭Session
 * 7. 关闭SessionFactory
 */
public class TestHibernate1_9_测试类 {
    public static void main(String[] args) {

        SessionFactory sf = new MyConfiguration().configure().buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        Product p = new Product();
        p.setName("iphone7");
        p.setPrice(7000);
        s.save(p);//保存

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
