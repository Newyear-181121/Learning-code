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

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0?true:false;
    }

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

    public MyLinkedListNode getNode(int index){
        checkRange(index);
        MyLinkedListNode node ;
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
        return node;
    }

    public Object get(int index){
        MyLinkedListNode node = getNode(index);
        return node!=null?node.getElement():null;        // 这里返回的是节点的值，如果节点是 null 就取不到 null 的值。
    }

    public void remove(int index){
        MyLinkedListNode node = getNode(index);

        MyLinkedListNode up = node.getPrevious();   // node 节点的上一个。
        MyLinkedListNode down = node.getNext();     // node 节点的下一个。

        if (index == 0){        // 如果是表头
            first = down;
            first.setPrevious(null);
            size--;
            return;
        }
        if (index == size-1){   //如果是表尾
            last = up;
            last.setNext(null);
            size--;
            return;
        }
        // 不是头，也不是尾。
        up.setNext(down);
        down.setPrevious(up);
        size--;

    }

    /**
     * 在指定的索引位置插入 元素。
     * @param index
     * @param obj
     */
    public void add(int index,Object obj){
        MyLinkedListNode newNode = new MyLinkedListNode(obj);
        MyLinkedListNode temp = getNode(index);

        if (temp == null){
            return;
        }
        MyLinkedListNode up = temp.getPrevious();


        newNode.setNext(temp);
        temp.setPrevious(newNode);

        if (up == null){
            first = newNode;

            size++;
            return;
        }

        up.setNext(newNode);
        newNode.setPrevious(up);


        size++;

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

        Out.out(linkedList.size());
        Out.out(linkedList);

        Out.out(linkedList.get(4));

        linkedList.remove(0);
        Out.out(linkedList.size());
        Out.out(linkedList);

        linkedList.remove(5);
        Out.out(linkedList.size());
        Out.out(linkedList);


        linkedList.remove(linkedList.size()-1);
        Out.out(linkedList.size());
        Out.out(linkedList);

        Out.out("若删除的时候，头节点的前一个节点不置空，则还能访问到,置空后增访问到null",linkedList.getNode(0).getPrevious());
        Out.out("若删除的时候，尾节点的后一个节点不置空，则还能访问到：",linkedList.getNode(linkedList.size()-1).getNext());


        linkedList.add(0,"test");
        Out.out("在指定位置加入新元素后：",linkedList);
    }
}
