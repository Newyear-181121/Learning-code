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
     * 创建 霍夫曼树
     *  数组中的所有节点最后都是 霍夫曼树的叶子节点。
     * @param arr  所有的叶子节点
     * @return 霍夫曼树 的根节点。
     */
    public Node createTree(int[] arr){
        List<Node> nodes = new ArrayList<Node>();
        for (int value : arr) {
            nodes.add(new Node(value));     // 把所有的节点 加到 ArrayList中来。
        }

        while(nodes.size() > 1 ) {
            Collections.sort(nodes);    // 排序

            Node left = nodes.get(0);   // 排序后 这是最小的 节点

            Node right = nodes.get(1);      //排序后，这是第二小的节点

            Node parent = new Node(left.id + right.id);   // 生成一个新的节点
            parent.left = left;     // 把原来的节点 挂到这个新节点的子节点上来。
            parent.right = right;
            nodes.remove(left);
            nodes.remove(right);

            nodes.add(parent);
        }
        return nodes.get(0);  //返回 最后一个节点，及根节点。
    }

    /**
     * 前序遍历
     * @param root 树的根节点
     */
    public void preOrder(Node root){
        if (root != null ){
            root.preOrder();
        } else {
            System.out.println("空树，，，，，");
        }
    }

}
