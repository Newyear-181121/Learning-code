package ny.how2j.hibernate2_关系.h2_3_多对多.test;

import java.util.HashSet;
import java.util.Set;

import ny.how2j.hibernate2_关系.h2_3_多对多.pojo.Product;
import ny.how2j.hibernate2_关系.h2_3_多对多.pojo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate3_3_8 {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure("ny/how2j/hibernate2_关系/h2_3_多对多/hibernate.cfg.xml").buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();

        //增加3个用户
        Set<User> users = new HashSet();
        for (int i = 0; i < 3; i++) {
            User u =new User();
            u.setName("user"+i);
            users.add(u);
            s.save(u);
        }

        //产品1被用户1,2,3购买
        Product p1 = (Product) s.get(Product.class, 1);

        p1.setUsers(users);
        s.save(p1);
        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
