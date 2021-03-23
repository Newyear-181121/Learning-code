package com.mooc.unit_3.栈;

public class 阶乘 {
    public static int res(int n){
        if (n == 1){
            return 1;
        }
        System.out.println(n ); res2(n-1);
        return n * res(n -1);

    }
    public static void res2(int n){
        if (n == 1){
            return ;
        }
        System.out.print("*" + n);
        res2(n -1);
    }

    public static void main(String[] args){
        int result = res(3);
        System.out.println(result);
    }
}
