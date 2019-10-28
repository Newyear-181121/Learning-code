package ny.how2j.hibernate2_关系.h2_1_多对一.test;

import ny.how2j.hibernate2_关系.h2_1_多对一.pojo.Category;
import ny.how2j.hibernate2_关系.h2_1_多对一.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate2_9_测试many_to_one关系 {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure("ny/how2j/hibernate2_关系/h2_1_多对一/hibernate.cfg.xml").buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        Category c =new Category();
        c.setName("c1");
        s.save(c);

        Product p = (Product) s.get(Product.class, 8);
        p.setCategory(c);
        s.update(p);

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
