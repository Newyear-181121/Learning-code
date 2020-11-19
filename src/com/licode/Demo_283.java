package com.licode;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

/**
 * @auther: NewYear
 * @Date: 2020-11-19 21:41
 * @version: 0.0.1
 * @description: Demo_283
 */
public class Demo_283 {
        public void moveZeroes(int[] nums) {
            int n = nums.length, left = 0, right = 0;
            while (right < n) {
                if (nums[right] != 0) {
                    swap(nums, left, right);
                    left++;
                }
                right++;
            }
        }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
