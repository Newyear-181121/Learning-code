package dataStructrues.N07树.N04霍夫曼树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @auther: NewYear
 * @Date: 2020-07-23 14:10
 * @version: 0.0.1
 * @description: Tree  霍夫曼树
 */
public class Tree {

    /**
     * 创建 霍夫曼数
     * @param arr
     * @return
     */
    public Node createTree(int[] arr){
        List<Node> nodes = new ArrayList<Node>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }

        while(nodes.size() > 1 ) {
            Collections.sort(nodes);

            Node left = nodes.get(0);

            Node right = nodes.get(1);

            Node parent = new Node(left.value + right.value);
            parent.left = left;
            parent.right = right;

            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    public void preOrder(Node root){
        if (root != null ){
            root.preOrder();
        } else {
            System.out.println("空树，，，，，");
        }
    }

}
