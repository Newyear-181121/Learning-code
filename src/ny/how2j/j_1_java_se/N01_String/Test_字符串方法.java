package N01_String;

import org.junit.jupiter.api.Test;

/**
 * @auther: NewYear
 * @Date: 2020-08-05 14:13
 * @version: 0.0.1
 * @description: Test_字符串方法
 */
public class Test_字符串方法 {

    String s = "IX";

    @Test
    public void Test(){
        System.out.println(romanToInt(s));
    }


    /**
     * 罗马数字转 阿拉伯
     */
    public int romanToInt(String s) {
        char[] cs = s.toCharArray();
        int nums = 0 ;
        int i = s.length()-1;
        while(i>=0){
            nums +=getint(cs[i]);
            if(i-1 >= 0 && getint(cs[i-1]) < getint(cs[i])){
                nums = nums - getint(cs[i-1]) ;
                i--;
            }
            i--;
        }
        return nums;
    }

    public int getint(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;

        }
    }
}
