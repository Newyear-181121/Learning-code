package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @auther: NewYear
 * @Date: 2020-10-09 13:25
 * @version: 0.0.1
 * @description: Test_01_Collection  容器的学习，至少要包容器的所有方法都实验一遍。
 */
public class TestCollection {

    Collection<String> co;

    public static void main(String[] args) {

         TestCollection tco = new TestCollection();


         tco.init();

         //tco.test1();
        tco.test03();

    }

    private void init(){
        co = new ArrayList<>();
    }

    /**
     * Collection 的方法测试
     */
    private void test1(){
        co.add("第一个元素");
        Out.out(co.size());


        Out.out("容器中是否包含元素test：",co.contains("test"));
        co.add("test");

        boolean istest = co.contains("test");   //判断 容器里面是否有这个元素
        Out.out("容器中是否包含元素test：",istest);

        Object[] objects = co.toArray();
        for (Object obj:objects){
            Out.out(obj);
        }


        co.add("hello");
        Out.out(co.toString());
        co.remove("hello");
        Out.out(co.toString());

        Collection<String> co1 = new ArrayList<String>();
        co1.add("one");
        co1.add("two");

        Out.out(co.containsAll(co1));

        co.addAll(co1);                     // 把co1 全部元素加到 co 中来。
        Out.out("co中是否包含 co1 的所有元素:",co.containsAll(co1));

        Out.out("移除co1的元素前：",co.toString());
        co.removeAll(co1);
        Out.out("移除co1的元素后：",co);


        //co.removeIf();


        co.addAll(co1);
        Out.out("保留所有co1中的元素前：",co.toString());
        co.retainAll(co1);
        Out.out("保留所有co1中的元素后：",co.toString());


        co.clear();
        Out.out("clear()后:",co.toString());


        /*
            removeIf
            stream
            parallelStream

            还有这三个方法没有测试。
         */
    }

    /**
     *  List 接口的方法测试
     */
    public void test03(){
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");

        Out.out("List:",l);

        l.add(3,"test");
        l.add(3,"master");
        Out.out("add:",l);

        l.remove(4);
        Out.out("remove:",l);

        l.set(3,"main");
        Out.out("set:",l);

        Out.out("get:",l.get(3));

        Out.out("indexOf:",l.indexOf("main"));

        l.add("C");
        Out.out("lastIndexOf(C):",l.lastIndexOf("C"));
        Out.out("Indexof(C):",l.indexOf("C"));

        Out.out("INdesof(test):",l.indexOf("test"));

    }

}
