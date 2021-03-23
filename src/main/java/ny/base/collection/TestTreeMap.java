package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.Map;
import java.util.TreeMap;

/**
 * @auther: NewYear
 * @Date: 2020-10-21 20:50
 * @version: 0.0.1
 * @description: TestTreeMap  测试TreeMap
 *
 * TreeMap 实现了 按照key 值自动排序。
 *      如果是自定义的类要实现排序，需要实现接口：Comparable
 */
public class TestTreeMap {

    Map<Integer,String> treeMap;

    Map<Auto,String> tM;

    public TestTreeMap(){
        treeMap = new TreeMap<>();
        tM = new TreeMap<>();
    }

    public void test01(){
        treeMap.put(239,"sadklfj");
        treeMap.put(863,"oweihke");
        treeMap.put(633,"saeihg");

        for (Integer key:treeMap.keySet()){
            Out.out(key+"=",treeMap.get(key));
        }
    }

    /**
     * 测试自己实现 排序接口的类。
     *  测试排序。
     */
    public void test02(){
        tM.put(new Auto(123,"nnnnn",1000),"alkejitoj");
        tM.put(new Auto(321,"mmm",2000),"welktioqeut");
        tM.put(new Auto(121,"owie",1500),"oeitujrek");
        tM.put(new Auto(121,"owie",150),"oeitujrek");

        Out.out(tM);
//        for (Auto key:tM.keySet()){
//            Out.out(key+"=",tM.get(key));
//        }
    }


    public static void main(String[] ss){
        TestTreeMap tm = new TestTreeMap();

        tm.test01();
        tm.test02();

    }
}










/**
 * 实现可以排序的接口。
 */
class Auto implements Comparable<Auto> {

    int id ;
    String name;
    double salary;

    public Auto(int id, String name, double salary) {
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
    public int compareTo(Auto o) {
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
        return "Auto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}