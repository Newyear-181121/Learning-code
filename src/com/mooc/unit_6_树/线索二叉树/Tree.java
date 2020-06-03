package com.mooc.unit_6_树.线索二叉树;

public class Tree {
    public Node root;
    public Tree lChild;
    public Tree rChild;

    Tree pre;

    /**
     * 线索化二叉树
     * @param p
     */
    public void intherad(Tree p){
        if ( p != null ){
            intherad(p.lChild);
            visit(p);
            intherad(p.rChild);
        }
    }

    private void visit(Tree p) {
        if (p.lChild == null ){
            p.lChild = pre;
            p.root.ltag = true;
        }
        if (pre != null && pre.rChild == null ){
            pre.rChild = p;
            pre.root.rtag = true;
        }
        pre = p;
    }


    /***********************************************/
    public Node inFirst(Tree t){
        Tree p = t;
        if (p == null){
            return null;
        }
        while(!p.root.ltag ){
            p = p.lChild;
        }
        return t.root;
    }
}
