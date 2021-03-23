package 查找算法.N03插值查找;

/**
 * InserValueSearch :
 *
 * @auther NewYear
 * @Date 2020-07-17 10:00
 */
public class InserValueSearch {

    public static int inserS(int[] arr,int left,int right,int findVal ){
        // 先确定递归结束条件
        if (left > right || findVal < arr[0] || findVal > arr[arr.length -1 ]){
            return -1;
        }

        //动态获取中间值，每次递归自动初始化 中间值
        int mid = left + (right - left)*(findVal - arr[left]) /(arr[right] -arr[left]);
        int midVal = arr[mid];
        if (findVal > midVal) {
            return inserS(arr,mid +1 ,right,findVal);
        } else if (findVal < midVal){
            return inserS(arr,left,mid - 1, findVal);
        } else {
            return mid;
        }
    }
}
