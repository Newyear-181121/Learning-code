package sort.N05快速排序;

public class QuickSort {

    public static void quickSort(int[] arr,int left,int right){
        int l = left; //左下标
        int r = right;//右下标
        if (left > right){
            return;
        }

        // 中轴值
        int pivot = arr[(left + right) /2 ];
        int temp = 0;

        while( l < r){
            while(arr[l] < pivot ){
                l +=1 ;
            }

            while(arr[r] > pivot){
                r -= 1;
            }
            if ( l >= r ){
                break;
            }

            // 上面三个循环分别判断了， 左边下标对应的数，大于中间值的下标
            //                      右边小于中间值的下标。
            // l < r  三个条件都满足，才开始交换。

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (arr[l] == pivot ) {
                r -= 1;
            }

            if (arr[r] == pivot ){
                l += 1;
            }
        }

        if ( l == r ){
            l += 1;
            r -= 1;
        }

        if (left < r ){
            quickSort(arr,left,r);
        }
        if (right > 1 ){
            quickSort(arr,l,right);
        }



    }
}
