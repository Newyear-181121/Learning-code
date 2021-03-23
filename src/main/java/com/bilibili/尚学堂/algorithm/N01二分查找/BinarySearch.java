package algorithm.N01二分查找;

import javax.xml.bind.annotation.XmlID;
import java.rmi.dgc.VMID;

/**
 * @auther: NewYear
 * @Date: 2020-07-30 14:54
 * @version: 0.0.1
 * @description: BinarySearch
 */
public class BinarySearch {
    /**
     * 非递归形式的 二分查找的
     * @param arr 要查找的数组
     * @param target 目标值
     * @return 有则是数组下标，没有则是 -1
     */
    public static int binarySearch(int[] arr,int target){
        int left = 0 ;
        int right = arr.length -1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == target ){
                return mid;
            } else if (arr[mid] > target){
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
