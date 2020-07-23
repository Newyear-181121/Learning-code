package dataStructrues.N07树.N04霍夫曼树;

import util.Out;

/**
 * @auther: NewYear
 * @Date: 2020-07-23 19:36
 * @version: 0.0.1
 * @description: Test
 */
public class Test {

    @org.junit.Test
    public void test(){
        int[] arr = Out.generate(4);
        Out.outArr(arr);
        Tree tree = new Tree();
        Node node = tree.createTree(arr);  // 像这种传入参数 ，然后返回一个 其他类型的结果的 方法，建议写成静态方法。
        tree.preOrder(node);
    }
}
