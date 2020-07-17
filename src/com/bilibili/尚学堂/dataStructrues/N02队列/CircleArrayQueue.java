package dataStructrues.N02队列;

/**
 * 实现环形队列
 */
public class CircleArrayQueue {

    private int maxSize; //表示数组的最大容量
    private int front;    //队列头
    private int rear ;      //队列尾
    private int[] arr;      //该数据用于存放数据，模拟队列

    public CircleArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    /**
     * 判断队列是否满了
     */
    public boolean isFull(){
        return (rear + 1) % maxSize  == front;
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
        arr[rear] = n;
        rear = (rear + 1) % maxSize;    //为什么取模就可以直接到前面去？？？原来如此，
    }

    /**
     * 数据出队列
     */
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空，不能取数据") ;
        }
       int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
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
        //  i 从队列头开始
        for (int i = front; i< front + size() ;i++){
            System.out.printf("arr[%d]=%d\n",i % maxSize ,arr[i % maxSize]);
        }

    }

    /**
     * 获取单前队列的有效数据个数
     */
    public int size(){
        return (rear + maxSize -front ) % maxSize;
    }

    /**
     * 显示度列的头数据，
     */
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[front];
    }

    /**
     * 显示队列尾数据，
     */
    public int tailQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[rear + 1];
    }

}
