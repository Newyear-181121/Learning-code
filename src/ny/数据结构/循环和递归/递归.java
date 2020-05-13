package 循环和递归;

import java.util.Scanner;

public class 递归 {
    public static void printN(int N){
         if ( N !=0 ) {
             printN(N-1);
            System.out.println(N -1 );
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
}
