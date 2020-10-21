package ny.base.collection;

/**
 * @auther: NewYear
 * @Date: 2020-10-21 16:35
 * @version: 0.0.1
 * @description: MyHashMapNode
 */
public class MyHashMapNode {

    int hash;
    Object key;
    Object value;
    MyHashMapNode next;


    @Override
    public String toString() {
        return  key.toString() +"="+value.toString();
    }
}
