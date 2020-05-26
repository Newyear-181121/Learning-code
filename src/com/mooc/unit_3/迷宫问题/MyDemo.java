package com.mooc.unit_3.迷宫问题;

/**
 *  迷宫 实现
 *      要求，用链表栈实现，有一个方向属性。
 *      起点 0,0，   终点 7,8
 *
 *      思路，1.  判断这个节点的下个方向可不可以走，可以走就入栈，然后到下个点，并把走过的点置6
 *              如果不可以走，换一个反向再判断，
 *              所有方向都不可以走，（四个方向都不是0）就把这个节点置5，然后返回上一个节点。
 */
public class MyDemo {
    int[][] maze = {{1,1,0,0},{1,1,1,0},{1,0,0,0},{1,1,1,1}};
    int[][] maze2 ={{0,0,1,0,0,0,1,0},
            {0,0,1,0,0,0,1,0},
            {0,0,0,0,1,1,0,1},
            {0,1,1,1,0,0,1,0},
            {0,0,0,1,0,0,0,0},
            {0,1,0,0,0,1,0,1},
            {0,1,1,1,1,0,0,1},
            {1,1,0,0,0,1,0,1},
            {1,1,0,0,0,0,0,0}};

    public void isAble(){
        while ()
    }
}
