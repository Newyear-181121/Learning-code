package dataStructrues.N07树.N05二叉排序树;

import com.sun.prism.impl.shape.BasicRoundRectRep;
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
        arr = Out.generate(20,50);
        tree = new Tree();
    }

    @org.junit.Test
    public void add(){
        for (int i = 0 ; i< arr.length ; i++){
            tree.add(new Node(arr[i]));
        }
        tree.infixOrder();

        util.tree.Tree.outNode(tree.getRoot());
    }
}
