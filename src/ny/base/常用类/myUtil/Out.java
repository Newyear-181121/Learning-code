package ny.base.常用类.myUtil;

/**
 * @auther: NewYear
 * @Date: 2020-10-13 14:31
 * @version: 0.0.1
 * @description: Out  自定义工具类，就是把输出到控制台缩短一点。
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

    public static void out(String str,Object object){
        System.out.print(str);
        System.out.println(object);
    }

    /**
     * 输出现在的时间
     */
    public static void outNow(){
        out(Now.now());
    }
}
