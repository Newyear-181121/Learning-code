package ny.base.常用类.可变字符序列;

import org.omg.CosNaming.BindingIterator;

/**
 * @auther: NewYear
 * @Date: 2020-10-10 16:41
 * @version: 0.0.1
 * @description: TestStringBuilder
 */
public class TestStringBuilder {

    StringBuffer sb ;       // 只声明对象，如果不复制，就使用这个对象就会报空指针异常。
    int count;

    public static void main(String[] args) {
        TestStringBuilder test = new TestStringBuilder();

        test.init();
        test.test1();
        test.test2();
        test.test3();
        test.test4();

    }

    /**
     * 打印 Object 对象 的 hashCode 值 和 内容。
     * @param sb
     */
    public void out (Object sb){
        out(sb,"");
    }
    public void out(String String){
        System.out.println(String);
    }
    public void out(long lo,String flag){
        if (flag.equals("time")){
            System.out.println("消耗了"+lo+"毫秒的时间");
        }else if (flag.equals("free")){
            System.out.println("剩余"+lo+"B 的内存");
        }
        System.out.println("#################");
    }
    /**
     * 这两个方法，就是方法的多态。
     * @param sb
     * @param string
     */
    public void out(Object sb ,String string){
        System.out.println("hashCode值："+Integer.toHexString(sb.hashCode()));
        System.out.println("字符串内容是："+sb);
        System.out.println("-----------"+count++ +"----        " +string);
    }

    /**
     * 初始化可变字符序列 sb
     *  sb 赋值，
     *  如果不赋值直接使用，运行时会报空指针异常。
     */
    public void init(){
        sb = new StringBuffer();
        for (int i = 0 ; i <26 ; i++){
            char temp = (char)('a'+i);
            this.sb.append(temp);
        }
        out(sb);
    }

    /**
     * 简单测试一下。
     */
    public void test1(){
        String str;
        out(sb);

        sb.setCharAt(2,'C');
        out(sb,"修改后还是统一个对象，hashCode没有发生改变");

        str = "a";
        out(str);
        str = "a"+"c";
        out(str,"String 拼接一次后，对象改变了。");


        sb.append('t');
        out(sb,"StringBuild 拼接后，对象并没有发生改变");
    }

    /**
     * StringBuilder  的常用方法 测试
     */
    public void test2(){
        sb.reverse();
        out(sb,"倒序");
        sb.setCharAt(5, '↓');
        sb.insert(5,"↓↓↓");
        sb.insert(8,"第一次插入").insert(7,"第二次" ).insert(5,"这叫链式调用，核心是 return this");
        out(sb,"修改指定定字符串");
        sb.delete(5,6).delete(6,20);
        out(sb,"链式调用删除方法");
    }


    /**
     * 这不是一个好的方法， 因为他会产生额外的对象。
     * test3 是用来和test4 做对比的。
     */
    public void test3(){
        long long1 = System.currentTimeMillis();
        long free1 = Runtime.getRuntime().freeMemory();
        String str5 =" ";
        out(str5,"运行前的对象是这个");
        for (int i = 0 ; i < 5000 ; i++){
            str5 = str5 + i;
        }
        long free2 = Runtime.getRuntime().freeMemory();
        long long2 = System.currentTimeMillis();
        out((long2-long1),"time");
        out((free2-free1),"free");
    }

    /**
     *  可变字符串的优势，
     *  多次改变该字符串，不会额外创建多余的对象，不会消耗多余的时间，不会消耗多余的内存。
     */
    public void test4(){
        sb.delete(0,sb.length()-1);
        long long1 = System.currentTimeMillis();
        long time1 = Runtime.getRuntime().freeMemory();
        out("空的StringBuilder，对象是这个");
        for (int i = 0 ; i < 5000 ; i++){
            sb.append(i);
        }
        long time2 = Runtime.getRuntime().freeMemory();
        long long2 = System.currentTimeMillis();
        out((long2-long1),"time");
        out((time2-time1),"free");
    }
}
