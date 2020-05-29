package sort.选择排序;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int len = 80000;
        int[] arr = new int[len];
        for (int i = 0 ; i < len ; i++){
            arr[i] = (int) (Math.random() * len);
        }


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1str = simpleDateFormat.format(date1);

        System.out.println("排序前");
        System.out.println(date1str);

        SelectSort.selectSort(arr);

        Date date2 = new Date();
        String date2str = simpleDateFormat.format(date2);
        System.out.println("排序后");
        System.out.println(date2str);
    }
}
