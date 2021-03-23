package dataStructrues.N07树.N02顺序存储二叉树;

import util.Out;

/**
 * @auther: NewYear
 * @Date: 2020-07-21 13:23
 * @version: 0.0.1
 * @description: arrTree : 顺序存储二叉树实现
 */
public class ArrTree {
    private int[] arr;

    public ArrTree(int[] arr){
        this.arr = arr;
    }

    public void visit(int index){
        System.out.println(arr[index]);
    }

    public void preOrder(){
        preOrder(0);
    }
    /**
     * 前序遍历 顺序存储二叉树
     * @param index
     */
    public void preOrder(int index){
        if ( arr == null || arr.length == 0){
            Out.out("数组为空，遍历啥啊。空的。");
        }
        visit(index);
        if ( (index * 2 + 1) < arr.length ) {
            preOrder( 2 * index + 1 );
        }

        if ( (index * 2 + 2) < arr.length ) {
            preOrder( 2 * index + 2 );
        }
    }

    public void infixOrder(int index){
        if ( arr == null || arr.length == 0){
            Out.out("数组为空，遍历啥啊。空的。");
        }

        if ( (index * 2 + 1) < arr.length ) {
            preOrder( 2 * index + 1 );
        }

        visit(index);

        if ( (index * 2 + 2) < arr.length ) {
            preOrder( 2 * index + 2 );
        }
    }


}
