package dataStructrues.N07树.N01二叉树;

import util.Out;

/**
 * BinaryTree :  二叉树 ，最多有两个节点的树。
 *
 * @auther NewYear
 * @Date 2020-07-20 18:34
 */
public class BinaryTree {
    // 二叉树的根节点
    private Node root;

    /**
     * 设置根节点
     * @param root
     */
    public void setRoot(Node root){
        this.root = root;
    }

    //------------------------------------------------------ 遍历 ------------------------------------------------------- 遍历
    /**
     * 前序遍历
     * 重写一下，前序遍历
     */
    public void preOrder(){
        if ( root != null ){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，无法前序遍历");
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder(){
        if ( root != null ) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法中序遍历");
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        if ( root != null ) {
            this.root.postOrder();
        } else {
            System.out.println("二叉树为空，无法后序遍历");
        }
    }

    //------------------------------------------------------ 查找 ------------------------------------------------------- 查找
    /**
     *  前序遍历查找
     * @see Node#preOrderSearch(int) 
     */
    public Node preOrderSearch(int id){
        if ( root != null ){
            return root.preOrderSearch(id);
        }else{
            return null;
        }
    }

    /**
     * @see Node#infixOrderSearch(int) 
     * @param id
     * @return
     */
    public Node infixOrderSearch(int id){
        if ( root != null ){
            return root.infixOrderSearch(id);
        }else{
            return null;
        }
    }

    public Node postOrderSearch(int id){
        if ( root != null ){
            return root.postOrderSearch(id);
        }else{
            return null;
        }
    }

    //---------------------------------------------------- 删除 --------------------------------------------------------- 前中后 序 删除
    public void delNode(int id){
        if (root != null ){
            if ( root.getId() == id ){
                root = null;
            } else {
                root.delNode(id); // 这里这个 方法调用的是 Node 的方法，而不是自己的方法。
            }
        } else {
            Out.out("空树，无法删除");
        }
    }



    //------------------------------------------------------------------------------------------------------------------
    /**
     * 只适用完全二叉树。
     * @param node
     */
    public void outNode(Node node){
        if (node == null){
            return;
        }
        Node[] nodes = new Node[10];
        int floor = 1;
        if (node == root ){
            nodes[0] = root;

            System.out.println(root);

            if ( node.getLeft() != null ){
                nodes[1] = node.getLeft();
                System.out.print(nodes[1]);
            }
            if ( node.getRight() != null ){
                nodes[2] = node.getRight();
                System.out.println(nodes[2]);
            }
            floor++;
        }

        while(true){
            int left = (int) Math.pow(2,floor-1) - 1; //这层最左边的 索引。
            int length = (int) Math.pow(2,floor-1);   // 这层的长度
            int right = left + length;  //这层最右边的索引
            for (int i = left ;i < right ; i++){
                if (nodes[i] != null && nodes[i].getLeft() != null ){
                    nodes[2*i +1 ] = nodes[i].getLeft();
                    System.out.print(nodes[i].getLeft());
                } else {
                    break;  //因为退出条件，所以只适用完全二叉树。
                }
                if ( nodes[i] != null && nodes[i].getRight() != null ){
                    nodes[2*i + 2 ] = nodes[i].getRight();
                    System.out.print(nodes[i].getRight());
                } else {
                    break;
                }
            }
            System.out.println();
            floor++;
        }
    }
}
