package ny.base.collection;

/**
 * @auther: NewYear
 * @Date: 2020-10-20 19:29
 * @version: 0.0.1
 * @description: MyLinkedListNode    MyLinkedList 的 节点类。
 */
public class MyLinkedListNode {

    private MyLinkedListNode previous;
    private MyLinkedListNode next;
    Object element;

    public MyLinkedListNode(MyLinkedListNode previous, MyLinkedListNode next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public MyLinkedListNode(Object element) {
        this.element = element;
        this.previous = null;
        this.next = null;
    }

    public MyLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyLinkedListNode previous) {
        this.previous = previous;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public String toString(){
        return element.toString();
    }
}
