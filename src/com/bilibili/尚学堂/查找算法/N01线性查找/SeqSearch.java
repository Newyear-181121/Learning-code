package 查找算法.N01线性查找;

/**
 * N01SeqSearch :
 *  顺序查找
 * @auther NewYear
 * @Date 2020-07-16 15:54
 */
public class SeqSearch {
    public static int seqSearch(int[] arr, int value){
        for (int i = 0 ; i< arr.length; i++){
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
