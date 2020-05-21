package dataStructrues.stack.链表实现栈;

import util.Out;

/**
 * 用链表实现栈
 *
 *  用链表实现数组，可以先创建，链表，也可以后穿件链表。
 */
public class LinkedStack {
    private Node head = null;

    private int maxSize;//指定队列最大长度
    private Node top = null;

    /**
     *  构造方法，，，先创建链表
     * @param maxSize
     */
    public LinkedStack(int maxSize) {
        this.maxSize = maxSize;
        head = new Node(0);
        top = head;         Out.out("给 栈针指向链头。");
        for (int i = 1; i <= maxSize ; i++){
            Node cur = new Node(i);
            Node temp = head;
            if (i == 1){
                temp = head;            Out.out("第一次循环，临时变量指向链头");
                head.setNext(cur);      Out.out("把第一个节点加载头节点之后。");
            } else {
                temp.setNext(cur);      Out.out("把第"+ temp.getId() + "个节点加到第"+ temp.getId()+"个节点后");
            }
            temp = temp.getNext();      Out.out("临时变量节点后移一个。");
        }

    }

    public boolean isEmpty(){
        return  (head.getNext() == null);
    }
    public boolean isFull(){
        return (getlength() == maxSize);
    }

    /**
     * 遍历
     */
    public void list(){
        if (isEmpty()){
            System.out.println("栈空" );
            return;
        }
        for(int i = getlength() ; i >= 0; i-- ){
            System.out.printf("stack[%d]=%d\n",i,getPreNode(i));
        }
    }

    /**
     * 推入数据到 栈中
     */
    public void push(Node newNode){
        if(isFull()){
            Out.out("栈满了");
            return;
        }
        top=top.getNext();//栈针后移
        top=newNode;//value 入栈
    }

    public Node pop(){
        if (isEmpty()){
            Out.out("栈空了");
            return null;
        }
        top = getPreNode(getlength()-1);
        return top;
    }

    /**
     * 获得上一个节点。
     * @return
     */
    public Node getPreNode(int index){
        if (head.getNext() == null){
            return null;
        }
        if(index <= 0 || index > getlength()){
            return null;
        }
        Node temp = head.getNext();
        for (int i = 1; i <index ; i++){
            temp.setNext(temp.getNext());
        }
        return temp;
    }

    /**
     * 获取栈的有效
     * @return
     */
    public int getlength(){
        if (head.getNext() == null ){
            return 0;
        }
        int length = 0;
        Node temp = head.getNext();
        while (temp != null ){
            length++;
            temp.setNext(temp.getNext());//后移
        }
        return length;
    }

}
