package dataStructrues.N05计算器.逆波兰表达式;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation {
    public static void main(String[] args) {
        String suffixExpression = "3 4 + 5 * 6 - ";

        List<String> list = getlistString(suffixExpression);
        System.out.println("list=" + list);
        int res = calculate(list);
        System.out.println("计算的结果是=" + res);

    }


    public static List<String> toInfixExpressionList(String s){
        // 定义一个List ，用于存放中缀表达式
        List<String> ls = new ArrayList<String>();
        int i = 0; //定义一个指针，用于遍历
        String str; // 用于存放，拼接的字符
        char c; // 临时变量，存放遍历到的字符
        do{
            // 如果c是一个非数字，就放到数组中。
            if ((c=s.charAt(i)) < 48 || (c=s.charAt(i)) > 57 ){
                ls.add("" + c);
                i++;
            } else { //如果是一个数，就要考虑多位数
                str = ""; // 先初始化存放变量
                // 如果是，就拼接，并后移。
                while(i < s.length() && (c=s.charAt(i)) >= 48 && (c=s.charAt(i)) <= 57){
                    str += c;
                    i++;
                }
                ls.add(str);//把多位数字放到列表中去。
            }

        } while (i < s.length());
        return ls;
    }

    /**
     *  把逆波兰表达式，中的数据和运算符放到 ArrayList 中
     * @param suffixExpression
     * @return
     */
    private static List<String> getlistString(String suffixExpression) {
        // 将 表达式分割
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<String>();
        for (String ele : split) {
            list.add(ele);
        }
        return list;
    }

    /**
     *  逆波兰表达式的运算
     * @param ls
     * @return
     */
    public static int calculate(List<String> ls) {
        //创建栈，只需要一个找即可
        Stack<String> stack = new Stack<String>();
        //遍历ls
        for (String item : ls) {
            //这里使用正则表达式来取出数
            if (item.matches("\\d+")) { //匹配的是多位数
                //入栈
                stack.push(item);
            } else {
                //pop出两个数，并运算，再入找
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num1 + num2;
                } else if (item.equals("-")) {
                    res = num1 - num2;
                } else if (item.equals("*")) {
                    res = num1 * num2;
                } else if (item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                stack.push("" + res);
            }
        }
        // 最后的运算结果出栈
        return Integer.parseInt(stack.pop());
    }
}
