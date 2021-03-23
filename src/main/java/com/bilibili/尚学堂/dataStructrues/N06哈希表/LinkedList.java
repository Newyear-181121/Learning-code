package dataStructrues.N06哈希表;

/**
 * LinkedList : 哈希表中节点所在的链表
 *
 * @auther NewYear
 * @Date 2020-07-17 19:45
 */
public class LinkedList implements In_List{

    /**
     * 链表头节点
     */
    private Node head;


    /**
     *
     * @param node
     */
    @Override
    public void add(Node node) {
        //先判断 初始条件（及边界条件。）
        if (head == null){
            head = node;
            return;
        }

        // 边界条件确定后， 确定 中间可循环部分。

        Node curNode = head;
        // 然临时节点 指向到 最后。
        while(true) {
            if (curNode.next == null) {
                break;
            }
            curNode = curNode.next;
        }
        curNode.next = node;
    }

    @Override
    public void list(int no) {
        if (head == null ){
            System.out.printf("第 %d 链表为空 \n" , no +1);
            return;
        }
        System.out.print("第" + (no + 1) + "链表的信息为：");
        Node curNode = head;
        while (true){
            visit(curNode);
            if (curNode.next == null){
                break;
            }
            curNode = curNode.next;
        }
        System.out.println( );
    }

    /**
     * 访问 节点
     */
    public void visit(Node node){
        System.out.printf(" ==> id = %d name = %s \t", node.id,node.value );
    }


    /**
     * 根据id 查找 节点
     * @param id
     * @return
     */
    public Node findNodeById(int id){
        if (head == null){
            System.out.println("链表为空");
            return null;
        }
        Node temp = head;
        while (true){
            if (temp.id == id ) {
                break;
            }
            if (temp.next == null ){
                temp = null;
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 删掉这个节点
     * @param id
     */
    public void deletById(int id){
        if (head == null){
            System.out.println("链表为空");
            return ;
        }


        Node befort = head;
        Node current = befort.next;
        while (true){
            // 判断 id 是不是链表的头 节点
            if ( head.id == id ){
                if (head.next == null){ // 这个链表只有头节点
                    head = null;
                } else { // 有多个节点
                    head = head.next;
                }
                break;
            }
            if (current.id == id ){
                befort.next = current.next;
                break;
            }
            if (current == null){
                System.out.println("该id不存在");
                break;
            }
            befort = befort.next;
            current = befort.next;
        }
        System.out.println("成功删除");
    }
}
