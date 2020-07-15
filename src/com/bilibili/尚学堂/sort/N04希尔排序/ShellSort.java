package sort.N04希尔排序;

import util.Out;

import java.util.Arrays;

/**
 * 缩小增量排序
 */
public class ShellSort {

    static int temp = 0;
    static int count = 0;
    static int count1 = 0;
    /**
     * 希尔排序 交换法
     * @param arr
     */
    public static void shellSort(int[] arr){

        
        for (int gap = arr.length / 2 ; gap > 0 ; gap /=2 ){
            for (int i = gap; i < arr.length ; i++){
                for (int j = i -gap ; j >= 0 ; j-=gap){
                    if (arr[j] > arr[j + gap]){
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                        count();
                    }
                }
            }
            Out.out("希尔排序第" + (++count) + "轮"+ Arrays.toString(arr));
        }
    }


    /**
     * 移位 法
     * @param arr
     */
    public static void shellSort2(int[] arr){
        for (int gap = arr.length / 2 ; gap > 0 ; gap /=2 ){
            for (int i = gap; i < arr.length ; i++){
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j -gap]){
                    while (j -gap >= 0 && temp < arr[j - gap]){
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }

    }

    /**
     * 计算交换次数
     */
    private static void count() {
        count1++;
    }
}
