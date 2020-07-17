package dataStructrues.N05计算器;

public class Calculator {
    public static void main(String[] args){
        //表达式
        String expression = "70+2*6-2*5+100/10";
        ArrayStack numStack = new ArrayStack(10);
        ArrayStack operStack = new ArrayStack(10);
        //定义需要的相关变量
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' '; //将每次扫描得到的char 保存到ch
        String keepNum = ""; //用于拼接多位数。
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

                    // 如果当前运算符的优先级，小于栈中运算符的优先级，
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())){
                        //栈中运算符优先级高，，推出栈中的数据开始运算。
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

                /*
                 * 如果是数字 就直接入栈的话，就不能计算多位数 结果了。
                 */
                //numStack.push(ch - 48 );

                keepNum += ch;

                //判断是不是最后一个，是最后一个数组，就直接入栈，不是就在判断。
                if (index == expression.length() -1){
                    numStack.push(Integer.parseInt(keepNum));
                } else{
                    // 不是最后一个，继续判断后一个
                    if (operStack.isOper(expression.substring(index+1,index+2).charAt(0))){
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
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
        //最后将数栈的最后数，pop出，就是结果  expression,numStack.pop()
        int res2 = numStack.pop();
        System.out.printf("表达式%s = %d",expression,res2);
    }
}
