package ny.how2j.hibernate1_基础.hibernate1_1_hello_hibernate.myutil;

/**
 * 在这里导入那个加载文件的类。
 */

import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

/**
 * 继承那个加载文件的类。
 */
public class MyConfiguration extends Configuration {

    /**
     * 自己重写加载文件的类。
     * @return
     * @throws HibernateException
     */
    @Override
    public Configuration configure() throws HibernateException {
        this.configure("/ny/how2j/hibernate1_基础/hibernate1_1_hello_hibernate/hibernate.cfg.xml");
        return this;
    }
    /**
     * 这下就可以自己改文件的位置了。----先试试看看可不可行。****可行。
     *      "/hibernate.cfg.xml"
     *          斜杆是直接从根路径下开始。
     *
     */
}
