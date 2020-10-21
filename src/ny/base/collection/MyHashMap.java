package ny.base.collection;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-10-21 16:34
 * @version: 0.0.1
 * @description: MyHashMap 实现 hashMap
 *
 * 类里面的方法，就是对自己的属性进行操作的一些方法。
 *
 *  增加 get 方法
 */
public class MyHashMap {

    MyHashMapNode[] tables;
    int size;

    /* 构造 */

    public MyHashMap(){
        tables = new MyHashMapNode[16];     //长度一般定义成2的幂数。
    }

    /**
     * 自定义的 哈希 计算方法。 比较简陋。
     * @param v
     * @param length
     * @return  自定义哈希值
     */
    public int myHash(int v ,int length){
        //Out.out("直接位运算，效率高：",v&(length-1));
        //Out.out("取模运算，效率低:",v%(length-1));
        return v&(length-1);
    }

    public void put(Object key,Object value){
        MyHashMapNode newNode = new MyHashMapNode();
        newNode.hash = myHash(key.hashCode(),tables.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        MyHashMapNode temp = tables[newNode.hash];
        MyHashMapNode lastNode = null ;             // 保存遍历的最后一个元素。
        boolean keyRepeat = false;                  // 标志 是否提前找到了 相同key。

        if (temp == null){                          //如果数组是空的就 直接把值放到数组中去。
            tables[newNode.hash] = newNode;
            size++;                                 // 每次加完记得要把 大小加一。
        }else{
            // 如果 数组 中这个位置不是空的，就要判断 之后怎么保存键值
            while ( temp != null){
                // 开始判断数组 节点的链表的 key 值 入传入的值是否相等。
                if (temp.key.equals(key)){
                    // 如果 key 相等了，替换 值，并结束循环
                    temp.value = value;

                    keyRepeat = true;               // 提前找到了，要把标志位改掉。

                    break;
                } else {
                    // 如果遍历过程中没有找到 一致的key
                    lastNode = temp;    // 用来保存，遍历的最后一个元素。
                                        // 遍历 到哪个元素就保存到哪里，如果遍历完了，那么保存的元素就是最后一个。
                    temp = temp.next;
                }

            } // 提前找到了，就提前结束，没有找到就保存尾部 节点。

            if (!keyRepeat) {
                lastNode.next = newNode;
                size++;
            }
        }


    }

    /**
     *
     * @return
     *  使用双层循环 遍历 哈希表，
     *  外层循环遍历数组，
     *  内存循环遍历链表。
     */
    public String toString(){
        if (size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (MyHashMapNode node : tables){      //
            while(node != null){
                sb.append(node.toString()+",");
                node = node.next;
            }
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public MyHashMapNode getNode(Object key){
        MyHashMapNode node = null ;
//        for (MyHashMapNode node : tables){      //
//            while(node != null){
//                if ( node.key.equals(key) ){
//                    temp = node;
//                }
//                node = node.next;
//            }
//        }
//        return temp;
//     写的这种 虽然能 获取到 对应的 key  ，但是 没有体现出哈希表 高速的有点， 这样暴力遍历所有 的 key 是一个很傻的方法。

        int hash = myHash(key.hashCode(),tables.length);
        if (tables[hash] != null){                                          // 至少要用 哈希值 缺点 数组中 的链表头节点，才没有那么傻。
            MyHashMapNode temp = tables[hash];
            while ( temp != null ){
                if ( temp.key.equals(key) ){
                    node = temp;
                }
                temp = temp.next;
            }
        }
        return node;
    }

    public Object get(Object key){
        return getNode(key).value;
    }

    public static void main(String[] args) {
        MyHashMap mm = new MyHashMap();
        mm.put(123,"qwe");
        mm.put(122,"rwer");
        Out.out("size:",mm.size);
        Out.out(mm);


        mm.put(122,"test");
        Out.out("size:",mm.size);
        Out.out(mm);

        Out.out("使用get方法获取key的值是：",mm.get(122));

        for (int i = 0 ; i < 10 ; i++){
            mm.put(i,"test"+i);
        }
        Out.out("size:",mm.size);
        Out.out(mm);
        Out.out(mm.get(8));
    }
}
