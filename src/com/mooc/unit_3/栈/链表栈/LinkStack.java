package com.mooc.unit_3.栈.链表栈;

public class LinkStack {

    public LinkNode top;
    private Object object;


    public LinkStack() {
        top = new LinkNode(0);
    }

    public boolean isEmpty() {
        return top.next == null;
    }

    /**
     * 入栈
     * @param
     */
    public void push(Object object) {
        LinkNode node = new LinkNode(object);
        addId(node);//设置新节点的id
        node.next = top;
        top = node;
    }

    public LinkNode pop() {
        if (!isEmpty()){
            LinkNode result = top;
            top = top.next;
            return result;
        } else {
            return null;
        }
    }

    public LinkNode top(){
        return top;
    }


    /************************************************/
    // 入栈时 id 新节点的id 是上个节点的id 加一
    private void addId(LinkNode node){
        //int id_new = top.id + 1;
        node.id = top.id + 1;
    }
}
