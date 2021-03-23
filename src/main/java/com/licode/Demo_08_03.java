package com.licode;

import org.junit.Test;
import util.Out;

/**
 * @auther: NewYear
 * @Date: 2020-07-31 9:04
 * @version: 0.0.1
 * @description: Demo_08_03
 */
public class Demo_08_03 {
    public int findMagicIndex(int[] nums) {
        for (int i = 0 ; i<= nums.length -1 ; i++ ){
            if(nums[i] == i){
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test(){
        int[] nums = {-294354269, -168926144, -62738268, 3};
        Out.out(findMagicIndex(nums));
    }

}
