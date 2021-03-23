package ny.base.反射.性能问题;

import ny.base.annotation.解析注解.Student;
import ny.base.常用类.myUtil.Now;
import ny.base.常用类.myUtil.Out;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auther: NewYear
 * @Date: 2020-12-25 15:51
 * @version: 0.0.1
 * @description: TestReflection04  反射性能问题。
 */
public class TestReflection04 {
    @Test
    public void test01() {
        Student student = new Student();

        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < 1000000000L ; i++){
            student.getStudentName();
        }
        long endTime = System.currentTimeMillis();

        Out.out("普通方法调用时间测试，执行10亿次耗时："+ (endTime - startTime) + "ms");
    }

    @Test
    public void test02() throws Exception {
        Student student = new Student();
        Class clazz = student.getClass();
        Method m = clazz.getDeclaredMethod("getStudentName",null);
        // m.setAccessible(true);

        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < 1000000000L ; i++){
            m.invoke(student,null);
        }
        long endTime = System.currentTimeMillis();

        Out.out("反射动态方法调用时间测试，执行10亿次耗时："+ (endTime - startTime) + "ms");
    }

    @Test
    public void test03() throws Exception {
        Student student = new Student();
        Class clazz = student.getClass();
        Method m = clazz.getDeclaredMethod("getStudentName",null);
        m.setAccessible(true);
        long startTime = System.currentTimeMillis();

        for (int i = 0 ; i < 1000000000L ; i++){
            m.invoke(student,null);
        }
        long endTime = System.currentTimeMillis();

        Out.out("反射动态方法调用时间测试，跳过安全检查，执行10亿次耗时："+ (endTime - startTime) + "ms");
    }
}
