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
     * 该节点 为根的子树高度。
     * 注意 加一  这是重点。
     * @return 该节点最大的高度
     */
    public int height(){
        if (this == null){
            return 0;
        }
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

    /**
     * 右子树高度
     * @return 右子树高度
     */
    public int rightHeight(){
        if (right == null){
            return 0;
        }
        return right.height();
    }
}
