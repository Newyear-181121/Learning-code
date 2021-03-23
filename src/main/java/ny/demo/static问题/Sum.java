package ny.demo.static问题;

public class Sum {
    public static int a ;
    public static String str = "静态变量研究"  ;

    static {
        a = 0;
    }


    public static int getA(){
        return a++;
    }
    public static String getStr(){
        return str + getA();
    }

}
class test{
    public static void main(String[] args) {
        System.out.println(Sum.getA());
        System.out.println(Sum.getStr());
        System.out.println(Sum.getStr());
    }
}

class a{
    public int a;
    public String str = "不是静态代码呢";
}
