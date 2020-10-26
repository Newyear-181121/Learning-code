package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @auther: NewYear
 * @Date: 2020-10-26 20:20
 * @version: 0.0.1
 * @description: MyHashSet
 *
 *  自己实现 HashSet
 */
public class MyHashSet {

    private int size;

    private HashMap map;

    private static final Object PRESENT = new Object();

    public MyHashSet(){
        map = new HashMap();
    }

    public int size(){
        return size;
    }

    public void add(Object o){
        map.put(o,PRESENT);
        size++;
    }

    public String toString(){
        if (map.isEmpty()){
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (Object key : map.keySet() ){
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();

    }

    public static void main(String[] args) {

        MyHashSet my = new MyHashSet();

        my.test();
    }

    public void test(){
        this.add("aaa");
        this.add("bbb");
        this.add("ccc");
        this.add("ddd");
        this.add("eee");
        this.add("fff");
        this.add("ggg");
        this.add("hhh");

        Out.out(size());
        Out.out(this);



    }

}
