package sort.插入排序;

import util.Out;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int len = 80000;
        int[] arr = new int[len];
        for (int i = 0 ; i < len ; i++){
            arr[i] = (int) (Math.random() * 10);
        }

        //System.out.println(Arrays.toString(arr));


        System.out.println("排序前");
        Out.time();

        InserSort.inserSort(arr);

        System.out.println("排序后");
        //System.out.println(Arrays.toString(arr));
        Out.time();


        System.out.println("总共比较了："+ InserSort.count);
    }
}
