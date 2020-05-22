package dataStructrues.计算器;

public class Calculator {
    public static void main(String[] args){
        //表达式
        String expression = "3+2*6-2";
        ArrayStack numStack = new ArrayStack(10);
        ArrayStack operStack = new ArrayStack(10);
        //定义需要的相关变量
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' '; //将每次扫描得到的char 保存到ch

        //开始while循环 扫描表达式 expression
        while(true){
            // 依次得到表达式（expression）的每个字符
            ch = expression.substring(index,index+1).charAt(0);
            // 判断ch是什么，然后做相应的处理
            if (operStack.isOper(ch)){ // 如果是运算符
                //判断当前符号栈是否为空
                if (!operStack.isEmpty()){
                    //如果符号栈有操作符，就进行比较，如果当前的操作符的优先级小于或等于栈中的操作符，
                    // 就需要从数栈中 pop 出两个数，
                    //再从符号栈中pop出一个符号，进行运算，将得到结果，入数栈，然后将当前的操作符入 符号栈。
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1,num2,oper);
                        //运算结果入数栈
                        numStack.push(res);
                        //然后将当前的操作符入符号栈
                        operStack.push(ch);
                    } else {
                        //如果当前的操作符的优先级大于栈中的操作符，就直接入符号栈。
                        operStack.push(ch);
                    }
                } else {
                    //如果为空，直接入符号栈。。
                    operStack.push(ch);
                }
            } else { //如果是数字，则直接入数栈
                numStack.push(ch - 48 );
            }
            //让index + 1 ，并判断是否扫描到expression最后，
            index++;
            if (index >= expression.length()){
                break;
            }
        }

        while(true){
            //如果符号栈为空，则计算到最后的结果，数栈中只有一个数字，，就是最后的结果
            if (operStack.isEmpty()){
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1,num2,oper);
            numStack.push(res);
        }
        //最后将数栈的最后数，pop出，就是结果
        int res2 = numStack.pop();
        System.out.printf("表达式%s = %d",expression,numStack.pop());
    }
}
