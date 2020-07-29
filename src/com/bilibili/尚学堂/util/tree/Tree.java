package util.tree;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * @auther: NewYear
 * @Date: 2020-07-28 20:21
 * @version: 0.0.1
 * @description: Tree
 */
public class Tree {

    private Node root;

    private static boolean flag; //用来判断新数组是不是空

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public static void outNode(Node[] nodes){
        Node[] nodes1 = new Node[nodes.length * 2];

        // 遍历这个数组，全部打印，，每个节点的左右节点，又加到新的数组中去。
        for (int i = 0 ; i< nodes.length -1 ; i++){
            if (nodes[i] == null){
                System.out.println("\t");
            } else{
                System.out.println(nodes[i]);
            }
            nodes1[2*i - 1] = nodes[i].left;
            nodes1[2*i ] = nodes[i].right;

            //只要新数组有一个不是空，
            if (flag != false){
                // 如果 标志 数组是空， 就要判断一下 数组中的节点，是不是非空。
                if (nodes[i].left != null){
                    flag = false;
                }
                if (nodes[i].right != null){
                    flag = false;
                }
            }

        }

        // 判断新的数组是不是全空了。
        // 如果数组全是空的，flag = true 了，说明后面没有节点了，
        if (flag != true ){
            outNode(nodes1);
        }
    }

    public static void outNode(Node node){
        Node[] nodes = {node};
        outNode(nodes);
    }

}
