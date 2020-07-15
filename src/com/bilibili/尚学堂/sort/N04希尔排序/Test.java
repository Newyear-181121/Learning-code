package sort.N04希尔排序;

import util.Out;

import java.util.Arrays;


public class Test {
    @org.junit.Test
    public void testsort(){
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        Out.out("源数组是" + Arrays.toString(arr));
        ShellSort.shellSort(arr);
    }

    @org.junit.Test
    public void testSort(){

    }
}
