package sort;

import org.junit.After;
import org.junit.Before;
import sort.N01冒泡.BubbleSort;
import sort.N02选择排序.SelectSort;
import sort.N03插入排序.InserSort;
import sort.N04希尔排序.ShellSort;
import sort.N05快速排序.QuickSort;
import sort.N06归并排序.MergetSort;
import sort.N07基数排序.RadixSort;
import util.Out;

/**
 * Test :
 *
 * @auther NewYear
 * @Date 2020-07-17 11:04
 */
public class Test {

    int[] arr = null;
    @Before
    public void before(){
        arr = Out.generate(80000);
        //Out.outArr(arr);
        Out.out("排序前：" + Out.time());
    }
    @After
    public void after(){
        Out.out("排序后：" + Out.time());
        //Out.outArr(arr);
        arr = null;
    }



    /**
     * 测试 冒泡排序
     */
    @org.junit.Test
    public void n01(){
        BubbleSort.sort(arr);
    }

    /**
     * 测试 选择排序
     */
    @org.junit.Test
    public void n02(){
        SelectSort.sort(arr);
    }

    /**
     * 插入排序 测试
     */
    @org.junit.Test
    public void n03(){
        InserSort.sort(arr);
    }


    /**
     * 希尔排序
     */
    @org.junit.Test
    public void n04(){
        ShellSort.sort(arr);
    }
    @org.junit.Test
    public void n04_2(){
        ShellSort.sort2(arr);
    }

    /**
     * 快速排序
     */
    @org.junit.Test
    public void n05(){
        QuickSort.sort1(arr);
    }


    @org.junit.Test
    public void n06(){
        MergetSort.sort1(arr);
    }

    @org.junit.Test
    public void n07(){
        RadixSort.sort(arr);
    }
}
