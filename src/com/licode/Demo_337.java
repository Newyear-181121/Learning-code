package com.licode;

import org.junit.jupiter.api.Test;
import util.Out;

import javax.swing.*;

/**
 * @auther: NewYear
 * @Date: 2020-08-05 10:40
 * @version: 0.0.1
 * @description: Demo_337
 */
public class Demo_337 {

    Object[] arr ={3,2,3,null,3,null,1} ;
    Tree tree = new Tree(arr);

    @Test
    public void test(){
        rob(tree.root);
    }

    public int rob(TreeNode root) {
        return getr(root);
    }

    //取根的值
    public int getr(TreeNode node){
        if (node == null){
            return 0;
        }
        int l = nor(node.left);
        int r = nor(node.right);
        if(node.left == null && node.right == null){
            return node.val;
        }
        int cur = node.val;
        return Math.max(cur,l + r);
    }

    // 不取根的值
    public int nor(TreeNode node){
        if (node == null){
            return 0;
        }
        int l = Math.max(getr(node.left),nor(node.left));
        int r = Math.max(getr(node.right),nor(node.right));

        return l + r ;
    }

}

/**
 * 准备测试的 树结构
 */
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//
//
//}

class Tree{
    TreeNode root;
    public Tree(Object[] arr){
        preOrder(0,arr,root);
    }
//----------------------------------------------------------------------------------------






    //-------------------------------------------------------------------------------------
    /**
     * 按前序遍历把 数组转换成  树结构
     * @param index
     * @param arr
     * @param node
     */
    public void preOrder(int index,Object[] arr,TreeNode node){
        if ( arr == null || arr.length == 0){
            Out.out("数组为空，遍历啥啊。空的。");
        }
        visit(index,arr,node);
        if ( (index * 2 + 1) < arr.length ) {
            node.left = new TreeNode(2*index + 1);
            preOrder( 2 * index + 1 ,arr,node.left);
        }

        if ( (index * 2 + 2) < arr.length ) {
            node.right = new TreeNode(2*index + 1);
            preOrder( 2 * index + 2 ,arr,node.right);
        }
    }

    public void visit(int index,Object[] arr,TreeNode node){
        node = new TreeNode((Integer) arr[index]);
    }
}
