package dataStructrues.N07树.N05二叉排序树;

/**
 * @auther: NewYear
 * @Date: 2020-07-28 19:49
 * @version: 0.0.1
 * @description: Tree
 */
public class Tree {
    private Node root;

    public void add(Node node ){
        if (root == null){
            root = node;
        } else {
            root.add(node);
        }
    }

    public void infixOrder(){
        if (root != null ){
            root.infixOrder();
        } else {
            System.out.println("空树");
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
