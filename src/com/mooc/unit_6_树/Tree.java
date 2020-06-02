package com.mooc.unit_6_树;

public class Tree {
    public Node root;//每棵树都有一个根节点。
    public Tree lchild; //左孩子树  左孩子也是左子树
    public Tree rchild; // 右子树

    public Tree(){
        lchild.root = root.left; //左子树的根节点 是 根节点的左孩子
        rchild.root = root.right; //右子树的根节点 是根节点的右孩子
    }


    /**
     * 先序遍历
     * @param rootTree
     */
    public void preOrder(Tree rootTree){
        if (rootTree != null){
            visit(rootTree.root);//查看 树的根节点。
            preOrder(rootTree.lchild); // 遍历该子树的的左子树
            preOrder(rootTree.rchild);

        }
    }

    /**
     * 中序遍历
     * @param rootTree
     */
    public void inOrder(Tree rootTree){
        if (rootTree != null){
            inOrder(rootTree.lchild);
            visit(rootTree.root);
            inOrder(rootTree.rchild);
        }
    }

    /**
     * 后续遍历
     *
     * @param rootTree
     */
    public void postOrder(Tree rootTree){
        if (rootTree != null ){
            postOrder(rootTree.lchild);
            postOrder(rootTree.rchild);
            visit(rootTree.root); //查看 这个子树的 根节点。
        }
    }

    /*****************************************************************/
    /* */
    int leafCount = 0; // 统计叶子节点的个数。（度为0的节点的个数）
    int twoCount = 0;  // 统计度为2的节点的个数。
    int oneCount = 0;  // 统计度为1的节点的个数。

    /**
     * 遍历中的实际操作
     * @param node
     */
    public void visit(Node node){
        readLeafCount(node);
        readtwoCount(node);
        readOneCount(node);
    }

    /**
     * 统计 叶子节点的个数
     * @param node
     */
    public void readLeafCount(Node node){
        if (node.left == null && node.right == null){
            leafCount++;
        }
    }

    public void readtwoCount(Node node){
        if (node.left != null && node.right != null){
            twoCount++;
        }
    }

    public void readOneCount(Node node){
        if ((node.left == null && node.right != null )
                || (node.left != null && node.right == null)){
            oneCount++;
        }
    }
}
