package util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 自定义输出
 * 封装 输出。
 */
public class Out {
    public static void out(String str){
        System.out.println(str);
    }

    public static void outArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 返回执行此方法时的时间。
     */
    public static String time(){
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1str = simpleDateFormat.format(date1);
        return date1str;
    }

    /**
     *  生成 指定长度的数组，数据无序，随机
     * @param len 数组长度
     * @return 数组
     */
    public static int[] generate(int len){
        return generate_2(len,100);
    }

    /**
     *
     * @param len 数组长度
     * @param val 数组元素，数据最大值
     * @return
     */
    public static int[] generate_2(int len,int val){
        int[] arr = new int[len];
        for (int i = 0 ; i < len ; i++){
            arr[i] = (int) (Math.random() * val);
        }
        return arr;
    }
}
