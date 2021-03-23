package dataStructrues.N07树.N05二叉排序树;

import org.junit.Before;
import util.Out;

/**
 * @auther: NewYear
 * @Date: 2020-07-28 19:54
 * @version: 0.0.1
 * @description: Test
 */
public class Test {
    int[] arr;
    Tree tree;
    @Before
    public void before(){
        arr = Out.generate(20,30);
        tree = new Tree();
    }

    @org.junit.Test
    public void add(){
        for (int i = 0 ; i< arr.length ; i++){
            tree.add(new Node(arr[i]));
        }


        Tree.outNode(tree.getRoot());
        tree.infixOrder();
    }
}
