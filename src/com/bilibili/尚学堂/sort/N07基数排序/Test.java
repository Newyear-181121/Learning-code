package sort.N07基数排序;

import util.Out;

import java.util.Arrays;

/**
 *  内存占用大小计算
 *   一个 int 占四个字节
 *    8 * 4 / 1024 / 1024 / 1024
 *              k     M      G
 */
public class Test {
    @org.junit.Test
    public void test(){
        int arr[] = {88,98,81,78,82,38,58,48,86,80};
        RadixSort.radixSort(arr);
        Out.out(Arrays.toString(arr));
    }
}
