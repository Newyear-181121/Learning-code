package ny.how2j.hibernate1_基础.hibernate1_2_save.test;

import ny.how2j.hibernate1_基础.hibernate1_2_save.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate2_4_插入数据到数据库 {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration().configure("/ny/how2j/hibernate1_基础/hibernate1_2_save/hibernate.cfg.xml").buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        for (int i = 0; i < 10; i++) {
            Product p = new Product();
            p.setName("iphone"+i);
            p.setPrice(i);
            s.save(p);
        }

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
