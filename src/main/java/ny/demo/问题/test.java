package ny.demo.问题;

/**
 * @auther: NewYear
 * @Date: 2020-09-30 15:35
 * @version: 0.0.1
 * @description: test
 */
public class test {

    String num ;    // 全局变量会自动赋值
    public void test(){
        // 局部变量不会自动赋值。
        num.charAt(1);
        num.toCharArray();
    }
}
