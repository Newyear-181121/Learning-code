package ny.base.annotation.解析注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @auther: NewYear
 * @Date: 2020-12-24 20:38
 * @version: 0.0.1
 * @description: StxField
 */
@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StxField {
    String columnName();
    String type();
    int length();
}
