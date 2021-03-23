package dataStructrues.N05计算器;

/**
 * 用数组模拟栈结构
 */
public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    /**
     * 构造器 新建一个大小是多少的栈顶元素。
     */
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /**
     * 判断栈是否满了。
     * @return 如果满了，就返回 true。
     */
    public boolean isfull(){
        return top ==maxSize -1;
    }

    /**
     * 判断是否 栈空
     * @return 如果空，返回 true。
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 窥视  栈顶元素
     * 查看栈顶的数据，但是不出栈。
      * @return 栈顶中的数
     */
    public int peek(){
        return stack[top];
    }

    /**
     * 入栈
     * @param value 入栈元素
     */
    public void push(int value){
        if (isfull()){
            System.out.println("栈满了");
            return;
        }
        top++;
        stack[top] = value;
    }

    /**
     * 出栈
     * @return 栈顶元素
     */
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈空，没有数据。");
        }
        int value = stack[top]; //取顶端值
        top--;   // 指针下移一。
        return value;
    }

    /**
     * 遍历，
     * 从顶向底开始显示代码
     */
    public void list(){
        if (isEmpty()){
            System.out.println("栈空" );
            return;
        }
        for(int i = top ; i >= 0; i-- ){
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

    /**
     *      返回运算付的优先级
     * ，优先级可以自定义，，优先级用数字表示
     * 数字越大，则优先级越高，
     * @param oper 运算符
     * @return  运算符的优先级
     */
    public int priority(int oper){
        if (oper == '*' || oper == '/'){
            return 1;
        } else if ( oper == '+' ||  oper == '-' ){
            return 0;
        } else {
            return -1; //目前 表达式只支持 + ， - ， * ，/
        }
    }

    /**
     * 判断 是不是一个运算符
     * @param val 字符
     * @return 是  否
     */
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    /**
     * 计算
     * @param num1 数据1
     * @param num2 数据2
     * @param oper 运算符
     * @return 结果
     */
    public int cal(int num1, int num2, int oper){
        int res = 0; //res ： 结果result ，用于存放计算的结果
        switch (oper){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num2 * num1;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }
}
