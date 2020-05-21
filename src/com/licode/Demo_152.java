package com.licode;

public class Demo_152 {
    int result = 0 ;
    public int maxProduct(int[] nums) {
        return max(son(nums));
    }

    public int max(int[] nums){
        int max = 0;
        for(int i = 0 ; i < nums.length-1 ;i++){
            if(nums[i] > nums[i+1]){
                max = nums[i];
            }
        }
        return max;
    }

    public int[] son(int[] nums){
        int[] count = new int[nums.length];

        for(int i = 0; i < nums.length -1 ; i++)
            if ( nums[i+1] == nums[i] +1 ){
                result = nums[i] * nums[i+1];
                son(nums,i+1);
                count[i] = result;
            }
        return count;
    }



    public void son(int[] nums,int index){
        if( index < 0 || index > nums.length -1 ){
            return ;
        }
        for (int i = index ; i < nums.length -1 ; i++){
            if ( nums[i+1] == nums[i] +1 ){
                result = result * nums[i+1];
                son(nums,i+1);
            } else {
                return ;
            }
        }
    }
}
