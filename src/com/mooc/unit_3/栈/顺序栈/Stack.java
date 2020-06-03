package com.mooc.unit_3.栈.顺序栈;

/**
 *  顺序栈 ，，数组栈
 */
public class Stack {
    private int maxSize;
    private int[] list;
    private int top;

    /**
     * 初始化
     * @param maxSize
     */
    public Stack(int maxSize){
        int[] list = new int[maxSize];
        this.list = list;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize -1;
    }

    public void push(int x){
        if (!isFull()) {
            top++;
            list[top] = x;
        }else {
            throw new RuntimeException("栈满，无法入栈");
        }
    }
    public int pop(){
        int res ;
        if (!isEmpty()){
            res = list[top];
            top--;
        } else {
            throw new RuntimeException("栈空，无法出栈");
        }
        return res;
    }

    public int getTop(){
        if (!isEmpty()){
            return list[top];
        } else {
            throw new RuntimeException("栈空，无法出栈");
        }
    }

    public void setEmpty(){
        top = -1;
    }
}
