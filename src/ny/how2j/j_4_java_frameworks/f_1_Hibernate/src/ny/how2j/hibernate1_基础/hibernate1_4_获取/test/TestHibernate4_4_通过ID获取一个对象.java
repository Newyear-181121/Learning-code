package ny.how2j.hibernate1_基础.hibernate1_4_获取.test;

import ny.how2j.hibernate1_基础.hibernate1_1_hello_hibernate.pojo.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHibernate4_4_通过ID获取一个对象 {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        Product p =(Product) s.get(Product.class, 6);

        System.out.println("id=6的产品名称是: "+p.getName());

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
