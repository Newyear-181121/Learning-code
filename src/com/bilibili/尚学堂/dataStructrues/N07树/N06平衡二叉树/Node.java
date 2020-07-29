package dataStructrues.N07树.N06平衡二叉树;

/**
 * @auther: NewYear
 * @Date: 2020-07-29 14:49
 * @version: 0.0.1
 * @description: Node
 */
public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }


    /**
     * 返回 该节点的高度
     * @return
     */
    public int height(){
        return Math.max(left == null ? 0 : left.height(),right == null ? 0 : right.height()) + 1;
    }

    /**
     * 返回左子树的高度
     * @return
     */
    public int leftHeight(){
        if (this.left ==null ){
            return 0;
        }
        return this.left.height();
    }

    public int rightHeight(){
        if (right == null){
            return 0;
        }
        return right.height();
    }
}
