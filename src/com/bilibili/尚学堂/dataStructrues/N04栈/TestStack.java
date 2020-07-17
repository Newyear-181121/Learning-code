package dataStructrues.N04栈;

import java.util.Stack;

/**
 * 测试系统 栈
 */
public class TestStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.add("java");
        stack.add("C");
        stack.add("python");

        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
