package sort.N07基数排序;

import util.Out;

import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void test(){
        int arr[] = {8,9,1,7,2,3,5,4,6,0};
        RadixSort.radixSort(arr);
        Out.out(Arrays.toString(arr));
    }
}
