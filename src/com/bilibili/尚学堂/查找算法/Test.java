package 查找算法;

import org.junit.After;
import org.junit.Before;
import sort.N06归并排序.MergetSort;
import util.Out;
import 查找算法.N02二分查找.BinarySearch;
import 查找算法.N03插值查找.InserValueSearch;

import java.util.List;

/**
 * Test :
 *
 * @auther NewYear
 * @Date 2020-07-16 16:12
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
        int resIndex = BinarySearch.binarySearch(arr,0,arr.length -1 ,0);
        System.out.println(resIndex);
    }

    @org.junit.Test
    public void n02_2(){
        List<Integer> resIndexList = BinarySearch.binarySearch2(arr,0,arr.length - 1,97);
        System.out.println(resIndexList);
    }

    @org.junit.Test
    public void n03(){
        int index = InserValueSearch.inserS(arr,0,arr.length - 1,97);
        System.out.println(index);
    }
}
