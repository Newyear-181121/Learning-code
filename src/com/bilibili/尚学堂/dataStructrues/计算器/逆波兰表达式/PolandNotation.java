package dataStructrues.计算器.逆波兰表达式;

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

    private static List<String> getlistString(String suffixExpression) {
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<String>();
        for (String ele : split) {
            list.add(ele);
        }
        return list;
    }

    public static int calculate(List<String> ls) {
        //创建给栈，只需要一个找即可
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
        return Integer.parseInt(stack.pop());
    }
}
