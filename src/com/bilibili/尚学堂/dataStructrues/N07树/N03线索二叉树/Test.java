package dataStructrues.N07树.N03线索二叉树;

import org.junit.Before;

/**
 * @auther: NewYear
 * @Date: 2020-07-22 16:03
 * @version: 0.0.1
 * @description: Test
 */
public class Test {

    Node root = new Node(1,"java");
    Node node2 = new Node(3,"python");
    Node node3 = new Node(6,"js");
    Node node4 = new Node(8,"javascrit");
    Node node5 = new Node(10,"nodejs");
    Node node6 = new Node(14,"html");

    ThreadedBinaryTree thrTree = new ThreadedBinaryTree();

    @Before
    public void before(){
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        thrTree.setRoot(root);

        thrTree.threadedNodes();    // 线索化
    }

    @org.junit.Test
    public void threaded(){
        thrTree.infixOrder();
        thrTree.threadedList();
    }
}
