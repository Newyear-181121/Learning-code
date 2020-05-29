package sort.插入排序;

/**
 * 插入排序
 *
 *  从 第一个数开始，拿这个数跟前面的有序数组比较，，，只需要比到有一个数不比他大，前面的数就可以不用比了。
 *      相比较前面两个排序，少比了很多次。
 */
public class InserSort {

    static int count = 0; // 记录比较次数。

    public static void inserSort(int[] arr){
        for (int i = 1 ; i < arr.length ; i++) {
            int inserVal = arr[i];  // 保存第i个数，将要插入新的
            int inserIndex = i-1; // 第i 个数前面的那个数。

            /**
             *  两个条件：
             *  1. 边界 处理，防止下标越界。
             *    循环判断的时候不会超过数组边界
             *  2. 判断 第 i个数和 他前面新的数组中的数比较，
             *      如果 这个数小 ，
             *             就让数组中的这个数往右复制一份，（因为 右边的数要么是已经复制过的，要么就是i，而i已经保存在变量中了。
             *      如果 第 i 个数没有比这个数小 ，就 把它放到 相比较的数的右边。下标加一就好。
             */
            while(inserIndex >=0 && inserVal < arr[inserIndex]){
                arr[inserIndex + 1 ] = arr[inserIndex]; // 把相比较的数往右复制一份。
                inserIndex--;
                count++;
            }
            if (inserIndex + 1 != i ) {
                arr[inserIndex + 1] = inserVal;
            }
        }

    }
}
