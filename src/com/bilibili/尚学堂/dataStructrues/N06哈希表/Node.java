package dataStructrues.N06哈希表;

/**
 * Node : 哈希表中最小的节点
 *
 * @auther NewYear
 * @Date 2020-07-17 19:42
 */
public class Node {
    public int id ;
    public String value;
    public Node next; //默认为空 ，指向下一个节点

    public Node(int id, String value) {
        super();
        this.id = id;
        this.value = value;
    }

}
