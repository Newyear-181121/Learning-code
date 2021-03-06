package dataStructrues.N04栈;

/**
 * 用数组模拟栈结构
 */
public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    //构造器
    public ArrayStack (int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /**
     * 是否栈满
     * @return 是 true  否 false
     */
    public boolean isfull(){
        return top == maxSize -1;
    }

    /**
     * 栈空
     */
    public boolean isEmpty(){
        return top == -1;
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
     * @return
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
     *
     * 这个遍历只有数组才能这个遍历
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

    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("栈空，没有数据。");
        }
        return stack[top];
    }
}
