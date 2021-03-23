package ny.base.反射;

import ny.base.常用类.myUtil.Out;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @auther: NewYear
 * @Date: 2020-12-24 22:22
 * @version: 0.0.1
 * @description: TestReflection02
 */
public class TestReflection02 {
    public static void main(String[] args) {

        TestReflection02 self = new TestReflection02();

        String path = "ny.base.annotation.解析注解.Student";

        try {
            Class clazz = Class.forName(path);

            //******************************************************************* 获取类 的 名字
            Out.out("包名加类名：\t\t",clazz.getName());
            Out.out("类名：\t\t\t",clazz.getSimpleName());

            //****************************************************************** 获取属性信息
            //  #### 获取public和所有的属性信息  ####
            Field[] fields_p = clazz.getFields();// 只能获取public的field
            self.out(fields_p);
            Field[] fields = clazz.getDeclaredFields();// 获取所有的field
            self.out(fields);
            //  #### 获取指定的属性信息  ####
            Field field = clazz.getDeclaredField("studentName");
            Out.out("属性：",field);

            //******************************************************************** 获取方法信息
            Method[] methods = clazz.getDeclaredMethods();
            self.out(methods,"所有方法");
            Method method = clazz.getDeclaredMethod("getStudentName",null);// 通过传入参数排除 泛型干扰，精确定位方法。
            Out.out("指定的方法信息:",method);

            //************************************************************************ 获得构造器信息
            Constructor[] constructors = clazz.getDeclaredConstructors();
            self.out(constructors,"构造器");
            Constructor constructor = clazz.getConstructor(null);// 通过传入不通的参数确定构造器。
            Out.out(constructor);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public <T> void out(T[] ts){
        for (T t : ts){
            Out.out("通过泛型输出：",t);
        }
    }
    public <T> void out(T[] ts,String strName){
        for (T t : ts){
            Out.out(strName + " : ",t);
        }
    }

    public void out(Field[] fs){
        for (Field f : fs){
            Out.out("属性：",f);
        }
    }
}
