package ny.base.反射;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-12-24 21:51
 * @version: 0.0.1
 * @description: TestReflection
 */
public class TestReflection {



    public static void main(String[] args) {
        String path = "ny.base.annotation.解析注解.Student";    //直接复制引用。
        try {
            /**
             * 对象是表示或封装一些具体的数据。 一个类被加载后，jvm会创建一个对应该类的Class对象， 这个类的所有结构信息都会保存在这个Class对象中。
             * 这个Class对象封装了（表示了）这个类的全部结构信息。
             */
            Class clazz = Class.forName(path);
            Out.out(clazz.hashCode());

            Class clazz2 = Class.forName(path);
            Out.out("一个类只有一个Class对象-->",clazz2.hashCode());

            Class strClazz = String.class;
            Class strClazz2 = path.getClass();
            Out.out("strClazz == strClazz2", strClazz == strClazz2,"  <<--->>  字符串String的Class对象是同一个 ");
            Out.out("上面是，通过不同的String对象，获取到的类的Class对象。 虽然对象不同，但是类型相同。 所以类是同一个。");
            Out.out("Class 对象是  获取对象(数据)的类(模板)的Class对象。");

            Out.out("看下数组的对比");
            int[] arr01 = new int[10];
            int[] arr02 = new int[50];
            int[][] arr03 = new int[10][10];

            Out.out(arr01.getClass());
            Out.out(arr02.getClass());
            Out.out(arr03.getClass());
            Out.out(arr01.getClass().hashCode());
            Out.out(arr02.getClass().hashCode());
            Out.out(arr03.getClass().hashCode());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
