package com.mooc.unit_3.迷宫问题;

/**
 * 链表栈节点
 */
public class StackNode {
    public StackNode next;

    public int id;
    public int x;
    public int y;
    public int direction; // 方向， 1,2,3,4，-->

    public StackNode() {
    }

    public StackNode(int id) {
        this.id = id;
    }
}
