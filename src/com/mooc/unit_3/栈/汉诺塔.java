package com.mooc.unit_3.栈;

public class 汉诺塔 {
    /**
     *
     * @param n
     * @param x 源位置
     * @param y 辅助位置
     * @param z 目标位置
     */
    public void hanoi(int n,char x,char y,char z){
        if (n == 1){
            move(x,1,z);
        } else {
            hanoi(n-1,x,z,y);
            move(x,n,z);
            hanoi(n-1,y,x,z);
        }
    }
    public void move(char x,int y,char z ){
        System.out.println("第" + y+"个圆盘" +x+"-->"+z);
    }

    public static void main(String[] args) {
        汉诺塔 a = new 汉诺塔();
        a.hanoi(3,'a','b','c');
    }
}
