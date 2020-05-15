package dataStructrues.linkList;

public class TestDoubleLinkedList {
    public static void main(String[] args) {
        System.out.println("双向链表的测试");
        DoubleNode  node1 = new DoubleNode(1,"松江","及时雨");
        DoubleNode node2 = new DoubleNode(2,"123","321");
        DoubleNode node3 = new DoubleNode(3,"456","654");
        DoubleNode node4 = new DoubleNode(4,"789","987");

        DoubleLindedList list = new DoubleLindedList();

        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);

        list.list();

        //修改
        DoubleNode newNode = new DoubleNode(4,"公孙胜","入云龙");
        list.update(newNode);
        System.out.println("修改后的链表");
        list.list();

        //删除
        list.del(3);
        System.out.println("删除后的链表");
        list.list();

        System.out.println("按顺序插入链表");
        list.addByOrder(node3);
        list.list();

        System.out.println("反转双向链表");
        list.reversetDoubleList();
        list.list();

    }


}
