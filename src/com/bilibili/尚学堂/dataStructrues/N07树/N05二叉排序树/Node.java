package dataStructrues.N07树.N05二叉排序树;

/**
 * @auther: NewYear
 * @Date: 2020-07-28 17:27
 * @version: 0.0.1
 * @description: Node
 */
public class Node {
    int id;
    String name;
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 添加
     * @param node
     */
    public void add(Node node){
        if (node == null){
            return;
        }
        if (node.value < this.value ){
            if (this.left == null){
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    public void infixOrder(){
        if (this.left != null ){
            this.left.infixOrder();
        }
        visit();
        if (this.right != null ){
            this.right.infixOrder();
        }
    }

    private void visit() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
