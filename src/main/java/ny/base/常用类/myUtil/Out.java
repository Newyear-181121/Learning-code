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

    public static void out(Object s, Object b, Object s1) {
        System.out.print(s);
        System.out.print(b);
        System.out.println(s1);
    }

    /**
     * 遍历输出泛型类数组中的值。
     * @param ts 一维数组
     * @param <T> 泛型，可以试任何类型。
     */
    public static <T> void out(T[] ts){
        for (T t : ts){
            out(t);
        }
    }

    /**
     * 遍历输出泛型类数组中的值。 并且每次输出前添加字符
     * @param ts 泛型数组
     * @param strName 要输出的字符
     * @param <T> 类型。
     */
    public static <T> void out(T[] ts,String strName){
        for (T t : ts){
            out(strName + " : ",t);
        }
    }
}
