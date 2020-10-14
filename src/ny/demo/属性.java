package ny.demo;

import java.util.Properties;

/**
 * @auther: NewYear
 * @Date: 2020-10-14 21:35
 * @version: 0.0.1
 * @description: 属性
 */
public class 属性 {
    public static void main(String[] args) {
        Properties properties = System.getProperties(); // 获取一个对象的属性对象。
        properties.list(System.out);


    }

}
