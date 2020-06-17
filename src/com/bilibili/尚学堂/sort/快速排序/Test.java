package sort.快速排序;


import util.Out;

public class Test {

    @org.junit.Test
    public void test(){
        int[] arr = {-9,78,0,23,-567,70,23,-349};

        QuickSort.quickSort(arr,0,arr.length);
        Out.out(arr.toString());
    }
}
