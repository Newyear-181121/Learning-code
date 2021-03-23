package ny.base.反射;

import ny.base.annotation.解析注解.Student;
import ny.base.常用类.myUtil.Out;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auther: NewYear
 * @Date: 2020-12-24 22:58
 * @version: 0.0.1
 * @description: TestReflection03
 */
public class TestReflection03 {

    public static void main(String[] args) {

        String path = "ny.base.annotation.解析注解.Student";

        try {
            Class clazz = Class.forName(path);

            // 通过方式API调用构造方法，构造对象。
            Student student = (Student) clazz.newInstance();
            Out.out(student);

            Constructor c = clazz.getDeclaredConstructor(int.class,String.class,int.class);
            Student student1 = (Student) c.newInstance(1,"test",54);
            Out.out(student1.getStudentName());



            // 通过反射API调用普通方法
            Method method = clazz.getDeclaredMethod("setStudentName", String.class);
            method.invoke(student,"not test");
            Out.out("通过反射调用方法",student.getStudentName());


            // 通过反射API操作属性
            Field f = clazz.getDeclaredField("studentName");
            f.setAccessible(true);                              //允许直接方法，不用做安全检查了。
            f.set(student,"反射操作的属性");                       //通过反射直接写属性
            Out.out("输出属性：",student.getStudentName());  // 通过反射直接读属性。


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            Out.out("私有属性方法，无法直接访问。");
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}
