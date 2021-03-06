package sort.N01冒泡;

/**
 * 冒泡排序
 *
 *  把第i个数跟后面相邻的数比， 符合判断条件 就交换位置。
 *      看起来就像是，越大的数，一个一个往后移动。
 *  优化，： 增加一个标志，当排序提前完成的时候，提前结束后续不必要的排序。
 */
public class BubbleSort {
    /**
     * 对数组排序
     * @param array 要进行排序的目标数组
     */
    public static void sort(int[] array){
        int temp = 0;
        boolean flag = false;  // 增加一个标志，

        for (int i = 0 ; i<array.length -1 ; i++){      // 每循环一次，排出一个最大数，
            for (int j = 0 ; j<array.length -1 -i; j++){
                if (array[j] > array[j+1]){
                    flag = true;    //有过排序动作，就为true
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

            if (!flag){
                break; //没有出现过排序动作，说明排序提前结束了，后面的排序就可以不用再执行了。
            }else{
                flag = false;// 如果进行过排序，就重置一下判断标志。
            }

        }
    }
}
