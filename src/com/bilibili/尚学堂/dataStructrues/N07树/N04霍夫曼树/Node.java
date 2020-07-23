package dataStructrues.N07树.N04霍夫曼树;

import org.jetbrains.annotations.NotNull;

/**
 * @auther: NewYear
 * @Date: 2020-07-23 14:06
 * @version: 0.0.1
 * @description: Node
 */
public class Node implements Comparable<Node> {

    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(@NotNull Node o) {
        return this.value - o.value;
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
