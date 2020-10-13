package ny.base.常用类.myUtil;

/**
 * @auther: NewYear
 * @Date: 2020-10-13 14:31
 * @version: 0.0.1
 * @description: Out  自定义工具类，
 */
public class Out {

    public static void out(){
        System.out.println();
    }
    public static void out(Object object) {
        System.out.println(object);
    }
    public static void out(Object object,Object object2){
        System.out.print(object);
        System.out.println(object2);
    }
}
