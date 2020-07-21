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

    /**
     * 根节点是否为空
     * @return
     */
    public boolean rootIsEmpty(){
        return root.isEmpty();
    }



    //------------------------------------------------------ 遍历 ------------------------------------------------------- 遍历
    /**
     * 前序遍历
     */
    public void preOrder(){
        if ( ! rootIsEmpty() ){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，无法前序遍历");
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder(){
        if ( ! rootIsEmpty() ) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法中序遍历");
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        if ( ! rootIsEmpty() ) {
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
        if ( ! rootIsEmpty() ){
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
        if ( ! rootIsEmpty() ){
            return root.infixOrderSearch(id);
        }else{
            return null;
        }
    }

    public Node postOrderSearch(int id){
        if ( ! rootIsEmpty() ){
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
}
