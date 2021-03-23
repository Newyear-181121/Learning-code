package com.licode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: NewYear
 * @Date: 2020-10-29 10:58
 * @version: 0.0.1
 * @description: Demo_129
 */
public class Demo_129 {



    @Test
    public void test(){
        Solution_129 my = new Solution_129();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        System.out.println(my.sumNumbers(node1));
    }
}

/**
 *
 * Definition for a binary tree node.
 *
 */
//class TreeNode_129 {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode_129(int x) { val = x; }
//}

class Solution_129 {
    boolean falg = true;// true 左，false 右
    int sb = 0;
    List<Integer> list = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        pre(root,true);

         if(list.size() == 0){
             return 0 ;
         }

        int re = 0 ;
        for(int i = 0 ; i < list.size() ; i++){
            re = re + list.get(i);
        }
        return re;
    }
    public void pre(TreeNode root,boolean falg){
        if(root == null){
            return ;
        }
        visit(root,falg);
        pre(root.left,true);
        pre(root.right,root.left==null?true:false);
    }

    /**
     * falg 用来判断，这个节点是 父节点的 左节点，还是右节点。
     *
     */
    public void visit(TreeNode node,boolean falg){

        if(falg == false){
            // 如果这个节点是 父节点的 右节点，先 删掉一个之前的 数（如果没有左节点还要做个判断。）
            sb = sb/10;
        }

        if(node.left == null && node.right == null){        // 是叶子节点
            sb = sb*10 + node.val;
            list.add(sb);
            return;
        }



        sb = sb*10 + node.val;
    }

}