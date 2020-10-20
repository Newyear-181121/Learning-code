package ny.base.collection.自己实现ArrayList;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-10-19 20:51
 * @version: 0.0.1
 * @description: MyArrayList  自定义实现arrayList
 *
 *  普通的add方法。
 *  增加泛型     普通类添加泛型支持很简单。
 *  增加数组扩容功能
 *      两个问题： 1. 什么时候扩容。 2. 怎么扩容。
 */
public class MyArrayList<E> {

    private Object[] elementDate;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyArrayList(){
        elementDate = new Object[DEFALT_CAPACITY];
    }

    public MyArrayList(int capacity){
        elementDate = new Object[capacity];
    }

    /**
     * 扩容
     */
    public void grow(){
        int oldCapacity = elementDate.length;                   //老的容量。
        int newCapacity = oldCapacity + (oldCapacity >> 1);     // 新的容量，参考源码的方式增长。
        Object[] newArray = new Object[newCapacity];            // 创建新的数组。
        System.arraycopy(elementDate,0,newArray,0,oldCapacity); // 源码中最后使用的也是这个方法。
        // 从 源数组 的起始位置， 复制到 目标数据 的起始位置， 复制源数据的数据长度。
        elementDate = newArray;                                 // 把新的数据的应用 传递给原来的数组。
    }

    /**
     * 判断是否要扩容。
     */
    public void isFull(){
        if (size == elementDate.length){
            // 容器里面的元素数量，等于数据长度的时候就要扩容了。
            grow();
        }
    }

    public void add(E element){
        // 判断容量，判断是否需要扩容。
        isFull();
        elementDate[size++] = element;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0 ; i<size ; i++){
            sb.append(elementDate[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayList<String> myal = new MyArrayList<>();

        Out.out(myal.size);

        for (int i = 0 ; i< 40 ; i++){
            myal.add("test"+i);
        }

        Out.out(myal.size);

        Out.out(myal);
    }
}
