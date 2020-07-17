package sort.N07基数排序;

/**
 * 基数排序 ，是一个经典的空间换时间的排序算法
 */
public class RadixSort {

    /**
     * 对个位数 的 基数排序
     * @param arr
     */
    public static void radixSort_1(int[] arr){
        // 定义一个二维数组表示10个通，每个桶就是一个一维数组
        int[][] bucket = new int[10][arr.length];
        //  记录每个桶中的数据个数 的值
        int[] bucketElementCounts = new int[10];

        // 按每个数的个位，把数据放到桶中去。
        for (int j = 0; j < arr.length; j++){
            // 个位数的值
            int digitofElement = arr[j] % 10;
            // 个位数是 。 的桶，个位数是。的桶中有 。。 个数。
            bucket[digitofElement][bucketElementCounts[digitofElement]] = arr[j];
            bucketElementCounts[digitofElement]++;
        }
        //把桶中的数据放回原来的数组中来。
        int index = 0;
        for(int k = 0 ; k<bucketElementCounts.length; k++){
            if(bucketElementCounts[k] != 0){
                for (int l = 0 ; l < bucketElementCounts[k]; l++){
                    arr[index++] = bucket[k][l];
                }
            }
        }


    }

    /**
     * 基数排序
     * @param arr 要排序的一维数组
     *
     */
    public static void sort(int[] arr){
        int max = arr[0];
        for (int i = 1 ; i < arr.length; i++){
            if (arr[i] > max ){
                max = arr[i]; //数组中最大的数
            }
        }
        //最大位数
        int maxLength = (max + "").length();




        for (int i = 0 , n = 1 ; i < maxLength ; i++ ,n*=10){

            // 这两个定义还起着初始化的作用。
            // 定义一个二维数组表示10个通，每个桶就是一个一位数组
            int[][] bucket = new int[10][arr.length];
            // 记录每个桶中的数据个数
            int[] bucketElementCounts = new int[10];


            // 按每个数的个位，把数据放到桶中去。
            for (int j = 0; j < arr.length; j++){
                int digitofElement = arr[j] / n % 10 ;
                bucket[digitofElement][bucketElementCounts[digitofElement]] = arr[j];
                bucketElementCounts[digitofElement]++;
            }
            //把桶中的数据放回原来的数组中来。
            int index = 0;
            for(int k = 0 ; k<bucketElementCounts.length; k++){
                if(bucketElementCounts[k] != 0){
                    for (int l = 0 ; l < bucketElementCounts[k]; l++){
                        arr[index++] = bucket[k][l];
                    }
                }
            }

            // 放回去之后 初始化
        }
    }
}
