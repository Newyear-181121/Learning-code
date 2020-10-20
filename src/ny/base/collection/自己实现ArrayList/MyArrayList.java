package ny.base.collection.自己实现ArrayList;

/**
 * @auther: NewYear
 * @Date: 2020-10-19 20:51
 * @version: 0.0.1
 * @description: MyArrayList  自定义实现arrayList
 *
 *  普通的add方法。
 */
public class MyArrayList {

        private Object[] elementDate;
        private int size;

        private static final int DEFALT_CAPACITY = 10;

        public MyArrayList(){
            elementDate = new Object[DEFALT_CAPACITY];
        }

        public MyArrayList(int capacity){
            elementDate = new Object[capacity];
        }

        public void add(Object element){
            elementDate[size++] = element;
        }

        public String toStrint(){
            StringBuilder sb = new StringBuilder();

            sb.append("[");
            for (int i = 0 ; i<size ; i++){
                sb.append(elementDate[i]+",");
            }
            sb.setCharAt(sb.length()-1,']');

            return sb.toString();
        }
}
