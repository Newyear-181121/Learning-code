package ny.base.collection;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-10-21 16:34
 * @version: 0.0.1
 * @description: MyHashMap 实现 hashMap
 */
public class MyHashMap {

    MyHashMapNode[] tables;
    int size;

    public MyHashMap(){
        tables = new MyHashMapNode[16];     //长度一般定义成2的幂数。
    }

    public int myHash(int v ,int length){
        Out.out("直接位运算，效率高：",v&(length-1));
        Out.out("取模运算，效率低:",v%(length-1));
        return v&(length-1);
    }

    public void put(Object key,Object value){
        MyHashMapNode newNode = new MyHashMapNode();
        newNode.hash = myHash(key.hashCode(),tables.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        MyHashMapNode temp = tables[newNode.hash];

        if (temp == null){      //如果数组是空的就 直接把值放到数组中去。
            tables[newNode.hash] = newNode;
        }else{
            // 如果 数组 中这个位置不是空的，就要判断 之后怎么保存键值
        }


    }


    public static void main(String[] args) {
        MyHashMap mm = new MyHashMap();
        mm.put(123,"qwe");
        mm.put(122,"rwer");
    }
}
