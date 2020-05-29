package sort.选择排序;

/**
 *  选择排序
 *
 *      就是 每次都把 一个数（第i个数） 跟这个数后面的数组中的最值的数交换位置。
 *                          定义一个中间变量，让默认值时这个数，让它跟数组中的每个数分别比较，取最值。
 *
 *      看起来就像是，从后面的数中选出一个数，跟前边的数交换位置， 只需要交换 数组长度-1 的次数。
 *
 */
public class SelectSort {

    public static void selectSort(int[] arr){
        int minIndex = 0; //最小值的索引
        int min = arr[0]; //最小值

        //外层循环，比较 第 i个数和它之后的数组中的数，确定最小值，并将最小值的数和第i哥数交换。
        for (int i = 0 ; i < arr.length ; i++){
            for (int j =i ; j < arr.length; j++){
                if (min > arr [j] ){
                    min = arr[j];
                    minIndex = j;
                }
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
