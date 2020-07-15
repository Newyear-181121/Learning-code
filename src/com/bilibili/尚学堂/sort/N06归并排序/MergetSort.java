package sort.N06归并排序;

import util.Out;

import java.util.Arrays;

public class MergetSort {

    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if (left < right ){
            int mid = (left + right )/2;

            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }


    /**
     * 合并
     * @param arr
     * @param left
     * @param mid
     * @param right
     * @param temp
     */
    public static void merge(int[] arr,int left, int mid ,int right,int[] temp){
        Out.out(Arrays.toString(arr));
        int i = left;
        int j = mid +1;
        int t = 0;

        while ( i <= mid && j <= right ){
            if (arr[i] <= arr[j] ){
                temp[t] = arr[i];
                t += 1;  //临时数组索引 右移
                i += 1;
            } else {
                temp[t] = arr[j];
                t++;j++;
            }

        }


        while(i <= mid ){
            temp[t] = arr[i];
            t++; i++;
        }
        while (j <= right ){
            temp[t] = arr[j];
            t++; j++;
        }


        t = 0;
        int tempLeft = left;
        while(tempLeft <= right ) {
            arr[tempLeft] = temp[t];
            t++;
            tempLeft ++;
        }
    }
}
