package dataStructrues.stack;

import java.util.Stack;

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
