package dataStructrues.N07树.N02顺序存储二叉树;

/**
 * @auther: NewYear
 * @Date: 2020-07-21 14:13
 * @version: 0.0.1
 * @description: Test
 */
public class Test {
    int[] arr = {1,2,3,4,5,6,7};
    ArrTree arrTree = new ArrTree(arr);

    @org.junit.Test
    public void preOrder(){
        arrTree.preOrder();
    }
}
