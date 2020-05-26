package com.mooc.unit_3.迷宫问题;

import com.mooc.unit_3.栈.顺序栈.Stack;

/**
 * 链表栈
 *  这是一个反向的栈链表结构，
 *
 *  没次新增节点都是在链表的前面加，让新节点的next指向 链表的头。
 */
public class LinkStack {
    public StackNode top;

    public LinkStack(){
        top = new StackNode(0);
    }

    public boolean isEmpty(){
        return top.next == null;
    }

    /**
     * 遍历输出链表
     */
    public void list(){
        StackNode temp = top;
        while (true){
            if (!isEmpty()){
                System.out.println(temp.id);
                temp = temp.next;
            } else {
                break;
            }
        }

    }

    public StackNode top(){
        return top;
    }

    /**
     * 入栈
     * @param node 新节点
     */
    public void push(StackNode node){
            int id = top.id;
            node.next = top;
            top = node;
            top.id = (id++);
    }

    /**
     * 出栈
     * @return
     */
    public StackNode pop(){
        if (!isEmpty()){
            StackNode result = top;
            top = top.next;
            return result;
        }else {
            return null;
        }
    }
    
}
