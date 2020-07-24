package dataStructrues.N07树.N04霍夫曼树;

import org.jetbrains.annotations.NotNull;

/**
 * @auther: NewYear
 * @Date: 2020-07-23 14:06
 * @version: 0.0.1
 * @description: Node 霍夫曼数节点
 */
public class Node implements Comparable<Node> {

    int id;
    String value;
    Node left;
    Node right;

    public Node(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + id +
                '}';
    }

    /**
     * 从小到大排序
     * @param o
     * @return
     */
    @Override
    public int compareTo(@NotNull Node o) {
        return this.id - o.id;
    }

    public void preOrder(){
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null){
            this.right.preOrder();
        }
    }

}
