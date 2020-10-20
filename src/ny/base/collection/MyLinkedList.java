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
        size++;                 //没添加一个 元素，size都要加一 的。
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

    public void checkRange(int index){
        if (index < 0 || index > size -1){
            throw new RuntimeException("不合法的索引："+index);
        }
    }

    public Object get(int index){
        MyLinkedListNode node ;
        checkRange(index);
        if (index <= (size >> 1)) {         // 从前往后找。
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
        } else {                            // 从后往前找。
            node = last;
            for (int i = size-1 ; i > index ; i--){
                node = node.getPrevious();
            }
        }

        return node.getElement();
    }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        linkedList.add("g");

        Out.out(linkedList);

        Out.out(linkedList.get(4));
    }
}
