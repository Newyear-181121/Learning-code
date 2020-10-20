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

        public void add(E element){
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

        for (int i = 0 ; i< 20 ; i++){
            myal.add("test"+i);
        }

        Out.out(myal.size);

        Out.out(myal);
    }
}
