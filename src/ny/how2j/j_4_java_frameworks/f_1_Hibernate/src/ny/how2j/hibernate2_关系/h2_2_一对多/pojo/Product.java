package ny.how2j.hibernate2_关系.h2_2_一对多.pojo;

public class Product {
    int id;
    String name;
    float price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
/*
 *
 *   应用程序通过Hibernate把 一个 Product对象插入到数据库的product_表中
 *       hibernate.cfg.xml 配置文件提供链接数据库的基本信息
 *       账号 密码 驱动 数据库ip 端口
 *       Product.hbm.xml 提供对象与表的映射关系
 *       对应哪个表？ 什么属性，对应什么字段
 *
 */