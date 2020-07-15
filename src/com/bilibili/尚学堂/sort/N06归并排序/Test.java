package sort.N06归并排序;

import util.Out;

import java.util.Arrays;

public class Test {

    @org.junit.Test
    public void test(){
        int arr[] = {8,9,5,3,7,6,4,2,4,1};
        int temp[] = new int[arr.length];
        MergetSort.mergeSort(arr,0,arr.length-1,temp);
        Out.out(Arrays.toString(arr));
    }
}
