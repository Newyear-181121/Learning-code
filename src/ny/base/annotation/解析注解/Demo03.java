package ny.base.annotation.解析注解;

import ny.base.常用类.myUtil.Out;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @auther: NewYear
 * @Date: 2020-12-24 21:06
 * @version: 0.0.1
 * @description: Demo  使用反射解析注解，获取注解的信息。
 */
public class Demo03 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("ny.base.annotation.解析注解.Student");

            // 获得所有有效注解
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation a : annotations) {
                Out.out(a);
            }
            //获得类的指定的注解
            StxTable st = (StxTable) clazz.getAnnotation(StxTable.class);
            Out.out(st.value());

            // 获得类的属性的注解    获得一个属性的注解，
            Field f = clazz.getDeclaredField("studentName");
            StxField sxtField = f.getAnnotation(StxField.class);
            Out.out(sxtField.columnName() + "--" + sxtField.type() + "--" + sxtField.length());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
