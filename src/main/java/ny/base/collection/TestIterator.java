package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.*;


/**
 * @auther: NewYear
 * @Date: 2020-10-26 21:11
 * @version: 0.0.1
 * @description: TestIterator
 *
 *  迭代器 学习使用 测试
 *
 *  Iterator 就是提供一个统一的方法 ，方便遍历容器。
 */
public class TestIterator {

    public TestIterator() {

    }

    /**
     * 测试 迭代器 遍历 list
     */
    public void test(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (Iterator<String> iter = list.iterator(); iter.hasNext() ;){
            String temp = iter.next();
            Out.out(temp);
        }
    }

    /**
     * 遍历set
     */
    public void test2(){
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        for (Iterator<String> iter = set.iterator(); iter.hasNext() ;){
            String temp = iter.next();
            Out.out(temp);
        }
    }

    /**
     * 遍历 map
     */
    public void test3(){
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"a");
        map.put(200,"b");
        map.put(300,"c");

        Set<Map.Entry<Integer,String>> ss = map.entrySet();

        for (Iterator<Map.Entry<Integer,String>> iter = ss.iterator(); iter.hasNext();){
            Map.Entry<Integer,String> temp = iter.next();
            Out.out(temp.getKey()+"---"+temp.getValue());
        }
    }

    public void test32(){
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"a");
        map.put(200,"b");
        map.put(300,"c");

        Set<Integer> keySet = map.keySet();
        for (Iterator<Integer> iter=keySet.iterator();iter.hasNext();){
            Integer key = iter.next();
            Out.out(key+"---"+map.get(key));
        }
    }

    public static void main(String[] args) {
        TestIterator my = new TestIterator();

        my.test();
        my.test2();
        my.test3();
        my.test32();
    }
}
