package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.TreeSet;

/**
 * @auther: NewYear
 * @Date: 2020-10-26 20:51
 * @version: 0.0.1
 * @description: TestTreeSet
 *
 *  TreeSet 类 常用方法测试
 *  熟悉Comparable 接口
 */
public class TestTreeSet {

    TreeSet set ;

    public TestTreeSet(){
        set = new TreeSet();
    }

    public void test(){
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        Out.out(set);
        TreeSet set2 = new TreeSet();
        set2.addAll(set);
        Out.out(set2);
        set.clear();

        set.add(100);
        set.add(800);
        set.add(300);
        set.add(500);
        set.add(200);
        set.add(700);
        set.add(900);
        Out.out(set);
        set.clear();

    }

    public void test2(){
        set.add(new VAuto(123,"nnnnn",1000));
        set.add(new VAuto(321,"mmm",2000));
        set.add(new VAuto(121,"owie",1500));
        set.add(new VAuto(121,"owie",150));
        Out.out(set);
    }

    public static void main(String[] args) {
        TestTreeSet my = new TestTreeSet();
        my.test();
        my.test2();
    }




}






/**
 * 实现可以排序的接口。
 *
 * 这个接口 和 set 中的接口是同一个接口。
 */
class VAuto implements Comparable<VAuto> {

    int id ;
    String name;
    double salary;

    public VAuto(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 将此对象 与指定 对象进行比较
     *  如果小于 指定对象，返回 负一
     *  如果等于 返回 0
     *  付过大于 返回 1
     * @param o
     * @return
     */
    @Override
    public int compareTo(VAuto o) {
        if (this.salary < o.salary){
            return -1;
        } else if (this.salary > o.salary) {
            return 1;
        } else {                                // 两个对象的 salary 属性的值相等了。
            if (this.id > o.id){
                return 1;
            } else if (this.id < o.id){
                return -1;
            }else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "VAuto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
