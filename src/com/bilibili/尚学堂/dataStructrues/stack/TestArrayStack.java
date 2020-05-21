package dataStructrues.stack;

import java.util.Scanner;

public class TestArrayStack {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack(4);
        String key = "";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        while (loop){
            System.out.println("show:表示显示栈");
            System.out.println("exit:退出程序");
            System.out.println("push:添加数据到栈（入栈）");
            System.out.println("pop:表示从栈取出数据（出栈）");
            System.out.println("请输入你的选择");
            key = scanner.next();
            switch(key){
                case "show":
                    stack.list();
                    break;
                case "push":
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try{
                        int res = stack.pop();
                        System.out.println("出栈的数据是"+ res);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit" :
                    scanner.close();
                    loop = false;
                    System.out.println("流已关闭，程序准备推出");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
        System.out.println("程序已关闭");
    }
}
