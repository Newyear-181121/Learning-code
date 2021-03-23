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



//----------------------------------------------------- 按树层次结构输出 --------------------------------------------------
    private static boolean flag; //用来判断新数组是不是空
    private static int floor = 1;

    public static void outNode(Node[] nodes){

        flag = true;
        Node[] nodes1 = new Node[nodes.length * 2];

        System.out.printf("数的第%d层,共有%d个节点 :",floor,nodes.length);

        // 遍历这个数组，全部打印，，每个节点的左右节点，又加到新的数组中去。
        for (int i = 0 ; i<= nodes.length -1 ; i++){
            if (nodes[i] == null){
                System.out.print("   空   ");
            } else{
                System.out.print(i+ ":");
                System.out.print(nodes[i] +  "    ");
            }
            if (nodes[i] == null){
                nodes1[2*i] = null;
                nodes1[2*i +1 ] = null;
            } else {
                nodes1[2 * i] = nodes[i].left;
                nodes1[2 * i + 1] = nodes[i].right;
            }

            //只要新数组有一个不是空，
            if (flag != false){
                // 如果 标志 数组是空， 就要判断一下 数组中的节点，是不是非空。
                if (nodes1[2*i] != null){
                    flag = false;
                }
                if (nodes1[2*i +1 ] != null){
                    flag = false;
                }
            }

        }

        // 判断新的数组是不是全空了。
        // 如果数组全是空的，flag = true 了，说明后面没有节点了，
        if (flag != true ){
            System.out.println();
            floor++;    //树的层数记录加1
            outNode(nodes1);
        }
    }

    public static void outNode(Node node){
        Node[] nodes = {node};
        outNode(nodes);
    }
}
