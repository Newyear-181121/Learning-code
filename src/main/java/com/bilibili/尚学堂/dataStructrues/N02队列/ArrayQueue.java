package dataStructrues.N02队列;

/**
 * 用数组模拟队列
 *
 * 这个数组值能使用一次。
 */
public class ArrayQueue {
    private int maxSize; //表示数组的最大容量
    private int front;    //队列头
    private int rear ;      //队列尾
    private int[] arr;      //该数据用于存放数据，模拟队列

    /**
     * 创建队列的构造器
     */
    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;     //初始化，指向队列头部的前一个数
        rear = -1;      //指向队列尾部的这个数据。
    }

    /**
     * 判断队列是否满了
     */
    public boolean isFull(){
        return rear == (maxSize -1 );
    }

    /**
     * 判断队列是否为空。
     */
    public boolean isEmpty(){
        return rear == front;
    }

    /**
     * 添加数据到队列
     */
    public void addQueue(int n){
        //判断队列是否满了
        if(isFull()){
            System.out.println("队列满了");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    /**
     * 数据出队列
     */
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空，不能取数据") ;
        }
        front++;    //队列头后移一个数。
        return arr[front];

    }

    /**
     * 显示队列的所有数据
     */
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = 0; i< arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }

    }

    /**
     * 显示度列的头数据，
     */
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[front+1];
    }

    /**
     * 显示队列尾数据，
     */
    public int tailQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[rear];
    }

}
