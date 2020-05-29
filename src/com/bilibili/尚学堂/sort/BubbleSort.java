package sort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 冒泡排序
 *
 *  优化，： 增加一个标志，当排序提前完成的时候，提前结束后续不必要的排序。
 */
public class BubbleSort {
    /**
     * 对数组排序
     * @param array
     */
    public void sort(int[] array){
        int temp = 0;
        boolean flag = false;  // 增加一个标志，
        for (int i = 0 ; i<array.length -1 ; i++){
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
