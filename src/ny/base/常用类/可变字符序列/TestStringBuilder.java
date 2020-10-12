package ny.base.常用类.可变字符序列;

/**
 * @auther: NewYear
 * @Date: 2020-10-10 16:41
 * @version: 0.0.1
 * @description: TestStringBuilder
 */
public class TestStringBuilder {

    public static void main(String[] args) {
        String str;

        StringBuilder sb = new StringBuilder("abcdefgh");
        out(sb);

        sb.setCharAt(2,'C');
        out(sb);

        str = "abcde";
        out(str);
        str = "abcveslk";
        out(str);


        sb.append('t');
        out(sb);

    }

    public static void out (Object sb){
        System.out.println("hashCode值："+Integer.toHexString(sb.hashCode()));
        System.out.println("字符串内容是："+sb);
        System.out.println("-----------");
    }

}
