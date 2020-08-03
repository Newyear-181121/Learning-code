package com.licode;

import org.junit.Test;
import util.Out;

/**
 * @auther: NewYear
 * @Date: 2020-08-03 10:26
 * @version: 0.0.1
 * @description: Demo_415 字符串相加
 * @url: https://leetcode-cn.com/problems/add-strings/solution/zi-fu-chuan-xiang-jia-by-leetcode-solution/
 */
public class Demo_415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1 ; int j = num2.length() - 1 ; int add = 0 ;
        StringBuffer nas = new StringBuffer();
        while( i >= 0 || j >= 0 || add != 0 ){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0 ;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0 ;
            int result = x + y + add;
            nas.append(result % 10);
            add = result / 10 ;
            i--;
            j--;
        }
        nas.reverse();
        return nas.toString();
    }

    @Test
    public void Test(){
        Out.out(addStrings("6548","32589754"));
    }

}
