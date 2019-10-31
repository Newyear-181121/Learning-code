package s_1_3_显示数据到jsp.action;

import s_1_3_显示数据到jsp.bean.Product;

public class ProductAction {
    private Product product;

    public String show() {
        product = new Product();
        product.setName("iphone7");
        return "show";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
