package ny.how2j.hibernate1_基础.hibernate1_8_查询_Criteria.test;

import java.util.List;

import ny.how2j.hibernate1_基础.hibernate1_1_hello_hibernate.pojo.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class TestHibernate8_4_使用Criteria_根据name进行模糊查询 {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        String name = "iphone";

        Criteria c= s.createCriteria(Product.class);
        c.add(Restrictions.like("name", "%"+name+"%"));
        List<Product> ps = c.list();
        for (Product p : ps) {
            System.out.println(p.getName());
        }
        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
