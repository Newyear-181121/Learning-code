package ny.base.反射;

import ny.base.常用类.myUtil.Out;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * 反射： 把java类中的各种结构（方法、属性、构造器、类名）映射成一个个的java对象
 *  1、 获取Class 对象
 *  三种方式： Class.forName(“完整路径")
 *  2、可以动态创建对象
 *  c.getConstructor().newInstance();
 *
 * @auther: NewYear
 * @Date: 2020-12-08 13:38
 * @version: 0.0.1
 * @description: TestReflect
 */
public class TestReflect {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        // 三种方式 获取 class 对象

        //1.
        Demo demo = new Demo();
        Class c = demo.getClass();
        // 2.
        c = Demo.class;
        // 3.   c = Class.forName("包名.类名");
            c = Class.forName("lambda.Demo");


        // 创建对象
        //Hero hero2 = (Hero) c.newInstance();    // 此方法已经被弃用了。
        Demo demo1 = (Demo) c.getConstructor().newInstance();
        Out.out(demo1.hashCode());
    }
}

class Demo{

}
