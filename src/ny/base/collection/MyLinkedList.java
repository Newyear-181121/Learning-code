package ny.base.collection;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-10-20 19:23
 * @version: 0.0.1
 * @description: MyLinkedList
 */
public class MyLinkedList {

    private MyLinkedListNode first;
    private MyLinkedListNode last;

    private int size;

    public void add(Object obj){
        MyLinkedListNode node = new MyLinkedListNode(obj);
        if (first == null){
            first = node;
            last = node;
        } else {
            node.setPrevious(last);     // 新节点 的 上指针 指向 原链表 last 节点。
            last.setNext(node);         // 原链表 last 节点的下一个节点指向 新节点。   这两部就是把新的节点加到链表尾部。
            last = node ;      // 把新节点 设置成last
            last.setNext(null);         // 把新的 last 节点的尾指针置空。
        }
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        MyLinkedListNode node = first;
        while(node != null){
            sb.append(node.getElement()+",");
            node = (node.getNext()); // node 指针后移一个节点。
        }

        sb.setCharAt(sb.length()-1,']');

        return sb.toString();
    }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        Out.out(linkedList);
    }
}
