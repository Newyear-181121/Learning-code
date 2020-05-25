package 树;

public class Tree {
    // 声明根节点
    Node root = new Node(0);
    Node temp = root;
    public int length = 0; //标识树的节点个数

    public boolean isEmpyt(){
        return length == 0;
    }

    /**
     * 增加节点到树中。
     */
    public void add(Node newNode){

        if (temp.left == null ){

        } else if (temp.right == null){

        } else{
            add(newNode);
        }
    }
}
