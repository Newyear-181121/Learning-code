package dataStructrues.N07树.N03线索二叉树;

import util.Out;

/**
 * @auther: NewYear
 * @Date: 2020-07-21 20:28
 * @version: 0.0.1
 * @description: ThreadedBinaryTree : 线索化二叉树
 */
public class ThreadedBinaryTree {
    // 二叉树的根节点
    private Node root;

    // 前驱节点指针
    private Node pre = null;

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
    // 线索化后，原来的遍历方式不能再用了。
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


    //---------------------------------------------------- 线索化 ------------------------------------------------------- 二叉树的线索化
    /**
     *  重载 一下方法 ，简化下参数。
     */
    public void threadedNodes(){
        threadedNodes(root);
    }
    /**
     * 对二叉树进行线索化 (中序 处理）
     * @param node
     */
    public void threadedNodes(Node node){
        if(node == null ){ //节点是空就不用管。
            return;
        }

        threadedNodes(node.getLeft());  //左递归


        threadedCurrent(node);  // 线索化处理


        threadedNodes(node.getRight()); //右递归


    }


    /**
     *  线索化处理当前节点
     *      处理这个节点的左边，和右边。
     * @param node
     */
    public void threadedCurrent(Node node){
        //处理节点的 前驱
        if (node.getLeft() == null ){
            node.setLeft(pre);
            node.setLeftType(1);    //标志这是一个  线索 ，
        }

        // 处理后继 （处理当前节点的右边 ，要从上一个节点开始 ）
        if ( pre != null && pre.getRight() == null ){
            pre.setRight(node);  // 让前驱节点的 右边 指向当前节点。
            pre.setRightType(1);
        }
        // 处理完这个节点后 ， 让前驱节点指针后移一位
        pre = node ;

    }

    /**
     * 线索化遍历    遍历线索化 后的 二叉树
     */
    public void threadedList(){
        Node node = root;
        while(node != null ){
            while(node.getLeftType() == 0){ // 左边是 节点指针
                node = node.getLeft();      //拿到了最左边的 节点。
            }

            System.out.println(node);

            while(node.getRightType() == 1 ){ //如果右边是 线索指针
                node = node.getRight();
                System.out.println(node);
            }
            node = node.getRight();
        }
    }
}
