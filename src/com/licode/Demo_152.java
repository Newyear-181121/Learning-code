package com.licode;

public class Demo_152 {
    int result = 0 ;
    boolean flag = false;
    public int maxProduct(int[] nums) {
        return son(nums);
    }


    public int son(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }
        int[] count = new int[nums.length];

        for(int i = 0; i < nums.length -1 ; i++)
            if ( nums[i+1] == nums[i] +1 ){

                int temp = nums[i] * nums[i+1];
                son(nums,i+1);
                if (flag){
                    if (result < temp){
                        result = temp;
                    }

                }
                if (!flag){
                    result = temp;
                    flag = true;
                }


            }
        return result;
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
