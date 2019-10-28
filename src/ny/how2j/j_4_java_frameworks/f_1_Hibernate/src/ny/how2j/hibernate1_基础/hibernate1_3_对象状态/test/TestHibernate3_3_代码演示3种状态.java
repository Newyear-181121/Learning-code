package ny.how2j.hibernate1_基础.hibernate1_3_对象状态.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ny.how2j.hibernate1_基础.hibernate1_1_hello_hibernate.pojo.Product;

public class TestHibernate3_3_代码演示3种状态 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        SessionFactory sf = new Configuration().configure("/ny/how2j/hibernate1_基础/hibernate1_1_hello_hibernate/hibernate.cfg.xml").buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();
        Product p = new Product();
        p.setName("p1");
        System.out.println("此时p是瞬时状态");
        s.save(p);
        System.out.println("此时p是持久状态");
        s.getTransaction().commit();
        s.close();
        System.out.println("此时p是脱管状态");
        sf.close();
    }
}
