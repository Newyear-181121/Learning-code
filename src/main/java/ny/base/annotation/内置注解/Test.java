package ny.base.annotation.内置注解;

import ny.base.常用类.myUtil.Out;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: NewYear
 * @Date: 2020-12-11 10:26
 * @version: 0.0.1
 * @description: Test
 */
public class Test {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void test001(){
        Out.out("遗弃废弃，不推荐使用");
    }

    @SuppressWarnings("all")
    public void test002(){
        List list = new ArrayList();
        Out.out("压制警告");
    }
}
