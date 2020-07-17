package 查找算法;

import org.junit.After;
import util.Out;
import 查找算法.N02二分查找.BinarySearch;

import java.util.List;

/**
 * Test :
 *
 * @auther NewYear
 * @Date 2020-07-16 16:12
 */
public class Test {

    int arr[] = {1,21,35,97,97,851,3264,3319};

    @After
    public void after(){

    }

    @org.junit.Test
    public void n02(){
        int resIndex = BinarySearch.binarySearch(arr,0,arr.length -1 ,97);
        System.out.println(resIndex);
    }

    @org.junit.Test
    public void n02_2(){
        List<Integer> resIndexList = BinarySearch.binarySearch2(arr,0,arr.length - 1,97);
        System.out.println(resIndexList);
    }
}
