package sort.N08堆排序;

/**
 * @auther: NewYear
 * @Date: 2020-07-23 10:25
 * @version: 0.0.1
 * @description: HeapSort 堆排序
 */
public class HeapSort {

    /**
     *  大顶堆排序
     */
    public static void sort1(int[] arr){
        int temp;
        for (int i = arr.length / 2 -1 ; i >= 0 ; i--){
            adjustHeap(arr,i,arr.length );
        }
        for (int j = arr.length-1; j>0; j--){
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr,0,j);
        }

    }

    /**
     * 在数组对象 arr 的长度范围lenght内 把索引为置i 的数 交换至 不再比 下一层的数大 的 位置
     * @param arr 操作的数据 要操作的对象。
     * @param i
     * @param lenght 数组的长度
     *
     * 就是把 根节点的子节点 比一下 ，大的再跟 根节点比。
     */
    public static void adjustHeap(int[] arr,int i ,int lenght){
        int temp = arr[i]; // 保存根节点的值

        for (int k = i * 2 + 1 ; k < lenght ; k = k * 2 + 1){
            if (k+1 < lenght && arr[k] < arr[k+1]){
                k++;        // 把k 的索引 定位到 （i 的两个子节点中，大的节点的位置） // k 是 子节点中 大的数 的节点的索引。
            }
            if (arr[k] > temp ) {   // 比较这个节点 和 根节点 （temp 和 arr[i] 只有在第一次循环中才相等。）
                arr[i] = arr[k];  // 把大的数保存到 根（或子根节点中）
                i = k ;
            } else {
                break;  //第一个根节点不再比 子节点大，就退出。
            }
        }
         arr[i] = temp ; // 把根节点保存到最深层。

    }


}
