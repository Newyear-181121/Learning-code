package algorithm;

import algorithm.N01二分查找.BinarySearch;
import org.junit.Before;
import sort.N06归并排序.MergetSort;
import util.Out;

/**
 * @auther: NewYear
 * @Date: 2020-07-30 15:00
 * @version: 0.0.1
 * @description: Test
 */
public class Test {

    int arr[] ;

    @Before
    public void after(){
        arr = Out.generate(10000000,1000);
        MergetSort.sort1(arr);
    }


    @org.junit.Test
    public void n02(){
        int resturt = BinarySearch.binarySearch(arr,200);
        System.out.println(resturt);
    }
}
