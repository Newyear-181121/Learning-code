package sort.N05快速排序;


import util.Out;

import java.util.Arrays;

public class Test {

    @org.junit.Test
    public void test(){
        int[] arr = {-9,78,0,23,-567,70,32,684};

        QuickSort.quickSort(arr,0,arr.length-1);
        Out.out(Arrays.toString(arr));
    }
}
