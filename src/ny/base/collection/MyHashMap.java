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
        MyHashMapNode lastNode = null ; // 保存遍历的最后一个元素。
        boolean keyRepeat = false;      // 标志 是否提前找到了 相同key。

        if (temp == null){      //如果数组是空的就 直接把值放到数组中去。
            tables[newNode.hash] = newNode;
        }else{
            // 如果 数组 中这个位置不是空的，就要判断 之后怎么保存键值
            while ( temp != null){
                // 开始判断数组 节点的链表的 key 值 入传入的值是否相等。
                if (temp.key.equals(key)){
                    // 如果 key 相等了，替换 值，并结束循环
                    temp.value = value;
                    break;
                } else {
                    // 如果遍历过程中没有找到 一致的key
                    lastNode = temp; // 用来保存，遍历的最后一个元素。
                                        // 遍历 到哪个元素就保存到哪里，如果遍历完了，那么保存的元素就是最后一个。
                    temp = temp.next;
                }

            } // 提前找到了，就提前结束，没有找到就保存尾部 节点。

            if (! keyRepeat) {
                lastNode.next = newNode;
            }
        }


    }


    public static void main(String[] args) {
        MyHashMap mm = new MyHashMap();
        mm.put(123,"qwe");
        mm.put(122,"rwer");

        mm.put(122,"test");
    }
}
