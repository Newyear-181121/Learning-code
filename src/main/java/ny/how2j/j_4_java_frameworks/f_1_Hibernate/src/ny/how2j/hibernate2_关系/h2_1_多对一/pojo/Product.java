package ny.how2j.hibernate2_关系.h2_1_多对一.pojo;

public class Product {
    int id;
    String name;
    float price;
    /**
     * 为Product.java增加Category属性
     */
    Category category;
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
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
