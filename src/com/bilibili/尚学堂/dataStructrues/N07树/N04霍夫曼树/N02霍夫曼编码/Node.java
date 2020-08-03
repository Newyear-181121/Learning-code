package dataStructrues.N07树.N04霍夫曼树.N02霍夫曼编码;

import org.jetbrains.annotations.NotNull;

/**
 * @auther: NewYear
 * @Date: 2020-07-24 15:57
 * @version: 0.0.1
 * @description: Node
 */
public class Node implements Comparable<Node> {

    int count;
    Byte data;
    int weight;
    Node left;
    Node right;
    public Node(Byte data,int weight){
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(@NotNull Node o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }

    public void preOrder(){
        visit();
        if (this.left != null){
            this.left.preOrder();
        }
        if (this.right != null){
            this.right.preOrder();
        }
    }

    public void visit(){
        count++;
        System.out.println(this);
    }
}
