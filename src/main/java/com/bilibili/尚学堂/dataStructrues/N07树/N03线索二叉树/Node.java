package dataStructrues.N07树.N03线索二叉树;

/**
 * @auther: NewYear
 * @Date: 2020-07-21 20:15
 * @version: 0.0.1
 * @description: Node
 */
public class Node {
    private int id;
    private String name;
    private Node left;
    private Node right;

    // 类型标志 ， 标志位为零 ，说明 左右 指针变量是 指向的是 左右子树节点
    //           标志位位 1  说明  左右指针指向的是 线索（前驱或后继）
    private int leftType;
    private int rightType;

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    /**
     * 当前节点是否为空
     */
    public boolean isEmpty(){
        return this == null;
    }

    /**
     * 访问 当前节点
     */
    public void visit(){
        System.out.println(this);
    }

    //---------------------------------------------------- 遍历 --------------------------------------------------------- 前中后 序 遍历
    /**
     * 前序遍历
     */
    public void preOrder(){
        visit();

        if (  this.getLeftType() == 0 && this.left != null ) {     // 这里不能用 isempty 。。
            this.left.preOrder();
        }
        if ( this.getRightType() == 0 && this.right != null ){
            this.right.preOrder();
        }
    }

    /**
     * 中序遍历
     */
    public void infixOrder(){

        if ( this.getLeftType() == 0 && this.left != null) {
            this.left.infixOrder();
        }

        visit();

        if ( this.getRightType() == 0 && this.right != null ){
            this.right.infixOrder();
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder(){

        if ( this.getLeftType() == 0 && this.left != null) {
            this.left.postOrder();
        }
        if ( this.getRightType() == 0 && this.right != null ){
            this.right.postOrder();
        }

        visit();
    }

    //---------------------------------------------------- 查找 --------------------------------------------------------- 前中后 序 查找
    /**
     *  前序遍历查找
     * @param id 要查找的id
     * @return 有则返回 node ，无则返回 null。
     */
    public Node preOrderSearch(int id){
        if ( this.id == id ){  // 判断当前节点 是不是要找的
            return this;
        }
        Node resNode = null;
        if ( this.getLeftType() == 0 && this.left != null ) {
            resNode = this.left.preOrderSearch(id);
        }
        if ( resNode != null ){     // 这个方法在这里 ，很好，值得思考。    。。。。。。。。。
            return resNode;
        }
        if ( this.getRightType() == 0 && this.right != null ) {      //如果右边不为空，向右递归
            resNode = this.right.preOrderSearch(id);
        }
        return resNode;
    }


    /**
     * 中序遍历查找
     * @param id 要查找的id
     * @return 有则返回 node ，无则返回 null。
     */
    public Node infixOrderSearch(int id){

        Node resNode = null;
        if ( this.getLeftType() == 0 && this.left != null) {      //如果左边不为空，向左递归
            resNode = this.left.preOrderSearch(id);
        }
        if ( resNode != null ){
            return resNode;
        }

        // 判断当前节点 是不是要找的
        if ( this.id == id ){
            return this;
        }


        if ( this.getRightType() == 0 && this.right != null ) {      //如果右边不为空，向右递归
            resNode = this.right.preOrderSearch(id);
        }
        return resNode;
    }


    /**
     * 后序遍历查找
     * @param id 要查找的id
     * @return 有则返回 node ，无则返回 null。
     */
    public Node postOrderSearch(int id){
        Node resNode = null;
        if ( this.getLeftType() == 0 && this.left != null ) {      //如果左边不为空，向左递归
            resNode = this.left.preOrderSearch(id);
        }
        if ( resNode != null ){
            return resNode;
        }
        if ( this.getRightType() == 0 && this.right != null ) {      //如果右边不为空，向右递归
            resNode = this.right.preOrderSearch(id);
        }
        if ( resNode != null ){
            return resNode;
        }

        if ( this.id == id ){  // 判断当前节点 是不是要找的
            return this;
        }


        return resNode;
    }


    //---------------------------------------------------- 删除 --------------------------------------------------------- 前中后 序 删除
    public void delNode(int id){
        if ( this.left != null && this.left.id == id ){
            this.left = null ;      //删除左子节点
            return;
        }
        if ( this.right != null && this.right.id == id ){
            this.right = null ;     //删除右子节点
            return;
        }
        // 左递归
        if ( this.left != null ){
            this.left.delNode(id);
        }
        //右递归
        if ( this.right != null ){
            this.right.delNode(id);
        }

    }
}
