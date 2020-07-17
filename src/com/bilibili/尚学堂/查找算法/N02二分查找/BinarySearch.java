package 查找算法.N02二分查找;

import java.util.ArrayList;
import java.util.List;

/**
 * BinarySearch :
 *
 * @auther NewYear
 * @Date 2020-07-16 16:04
 */
public class BinarySearch {

    /**
     *
     * @param arr 数组
     * @param left 左索引
     * @param right 右索引
     * @param findVal 目标值
     * @return 目标值的下标
     */
    public static int binarySearch(int[] arr,int left,int right,int findVal) {

        // 递归结束条件
        if (left > right ){
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal == midVal){
            return mid;
        } else if (findVal > midVal){
            return binarySearch(arr,mid + 1,right,findVal);
        } else {
            return binarySearch(arr,left,mid -1,findVal);
        }
    }

    public static ArrayList<Integer> binarySearch2(int[] arr,int left,int right,int findVal){
        // 递归结束条件
        if (left > right ){
            return new ArrayList<Integer>();
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal){
            return binarySearch2(arr,mid + 1,right,findVal);
        } else if(findVal < midVal){
            return binarySearch2(arr,left,mid -1,findVal);
        } else{
            ArrayList<Integer> resIndexlist = new ArrayList<Integer>();

            //向左
            int temp = mid -1;
            while(true){
                if (temp < 0 || arr[temp] != findVal ){
                    break;
                }
                resIndexlist.add(temp);
                temp -=1;
            }
            resIndexlist.add(mid);


            //向右
            temp = mid + 1;
            while(true){
                if (temp > arr.length -1  || arr[temp] != findVal ){
                    break;
                }
                resIndexlist.add(temp);
                temp +=1;
            }

            return resIndexlist;
        }

    }
}
