package dataStructrues.N07树.N01二叉树;

import org.junit.Before;
import util.Out;

/**
 * Demo :
 *
 * @auther NewYear
 * @Date 2020-07-20 18:58
 */
public class Test {

    BinaryTree binaryTree = new BinaryTree();

    Node root = new Node(1, "宋江");
    Node node1 = new Node(2, "吴用");
    Node node2 = new Node(3, "卢俊义");
    Node node3 = new Node(4, "林冲");

    Node node4 = new Node(5,"关胜");

    @Before
    public void before() {
        root.setLeft(node1);
        root.setRight(node2);
        node2.setRight(node3);
        node2.setLeft(node4);

        binaryTree.setRoot(root);
    }

    /**
     * 遍历
     */
    @org.junit.Test
    public void Order(){
        System.out.println("前序遍历");
        binaryTree.preOrder();

        System.out.println("中序遍历");
        binaryTree.infixOrder();

        System.out.println("后序遍历");
        binaryTree.postOrder();
    }

    /**
     * 搜索
     */
    @org.junit.Test
    public void search(){
        Out.out("前序遍历查找~~~~~~");
        Node resNode = binaryTree.preOrderSearch(4);
        if ( resNode != null ) {
            System.out.printf("找到了, 信息为 id = %d ,name = %s \n",resNode.getId(),resNode.getName());
        } else {
            Out.out("没找到，没有");
        }

        Out.out("中序遍历查找~~~~~~");
        resNode = binaryTree.infixOrderSearch(4);
        if ( resNode != null ) {
            System.out.printf("找到了, 信息为 id = %d ,name = %s \n",resNode.getId(),resNode.getName());
        } else {
            Out.out("没找到，没有");
        }

        Out.out("后序遍历查找~~~~~~");
        resNode = binaryTree.postOrderSearch(4);
        if ( resNode != null ) {
            System.out.printf("找到了, 信息为 id = %d ,name = %s \n",resNode.getId(),resNode.getName());
        } else {
            Out.out("没找到，没有");
        }
    }

    @org.junit.Test
    public void del(){
        Out.out("删除前，前序遍历");
        binaryTree.preOrder();
        binaryTree.delNode(5);
        Out.out("删除后，前序遍历");
        binaryTree.preOrder();
    }
}


