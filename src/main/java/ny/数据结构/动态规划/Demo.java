package 动态规划;

/**
 * 动态规划 实现。
 */
public class Demo {
    public int MaxSubseqSum(int A[],int N){
        int ThisSum = 0,MaxSum = 0;
        for (int i = 0 ;i < N ;i++ ){
            ThisSum += A[i];            // 临时变量向右加一个数。
            if(ThisSum > MaxSum) {      // 如果 临时变量 比之前最大的数大，
                MaxSum = ThisSum;       // 那么这就是新的最大数。
            } else if (ThisSum < 0){    // 如果加了一个数之后，反而编程负数了，就不要这个值了。
                ThisSum = 0;
            }
        }
        return MaxSum;
    }

    public int  MaxSubseqSum(int A[]){
        return MaxSubseqSum(A,A.length);
    }
}
