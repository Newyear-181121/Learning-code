package ny.base.annotation.自定义注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auther: NewYear
 * @Date: 2020-12-11 10:34
 * @version: 0.0.1
 * @description: Demo001
 */
@Target(value={ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Demo001 {
    String version() default "0.0.1";
}
/**
 * 解释注解的注解叫元注解
 *
 * @Target 用于描述这个注解的作用范围
 *          直接查看注解可知，它可以接收一个 ElementType 的枚举类型的数组。
 *
 */
