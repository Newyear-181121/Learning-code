package ny.how2j.hibernate2_关系.h2_2_一对多.test;

import java.util.Set;

import ny.how2j.hibernate2_关系.h2_2_一对多.pojo.Category;
import ny.how2j.hibernate2_关系.h2_2_一对多.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate3_2_6_测试one_to_many关系 {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure("ny/how2j/hibernate2_关系/h2_2_一对多/hibernate.cfg.xml").buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        Category c = (Category) s.get(Category.class, 1);
        Set<Product> ps = c.getProducts();
        for (Product p : ps) {
            System.out.println(p.getName());
        }

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
