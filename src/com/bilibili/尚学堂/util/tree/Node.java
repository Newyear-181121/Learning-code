package util.tree;

/**
 * @auther: NewYear
 * @Date: 2020-07-28 20:07
 * @version: 0.0.1
 * @description: Node  想把树，按照 树的结构打印到控制台
 */
public class Node {
    int id;
    Node left;
    Node right;


    public void outNode(){
        if ( this != null ){
            System.out.println(this);
        } else {
            System.out.println("\t");
        }
    }
}
