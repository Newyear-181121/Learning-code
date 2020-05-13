package 循环和递归;

import java.util.Scanner;

public class 循环 {
    public static void printN (int N){
        int i;
        for ( i = 1 ; i<=N ; i++ ){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int N;
        do {
            Scanner scanner = new Scanner(System.in);
            N =  scanner.nextInt();
            printN(N);
        } while (N != 0);
    }
    /**
     * 到一万就挂掉了。
     */
}
