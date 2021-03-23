package ny.base.collection;

/**
 * @auther: NewYear
 * @Date: 2020-10-15 15:09
 * @version: 0.0.1
 * @description: MyCollection  泛型的使用，自定义泛型。
 */
public class MyCollection<E> {      // E 形参，形式参数
    Object[] objs ;

    public MyCollection(int length) {
        this.objs = new Object[length];
    }

    public void set(E e, int index){
        objs[index] = e;
    }

    public E get(int index){
        return (E)objs[index];
    }

}


