package dataStructrues.N06哈希表;

/**
 * LinkedList : 哈希表中的节点
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
    public void list() {
        if (head == null ){
            System.out.println("链表为空");
            return;
        }

        Node curNode = head;
        while (true){
            visit(curNode);
            if (curNode.next == null){
                break;
            }
            curNode = curNode.next;
        }
    }

    /**
     * 访问 节点
     */
    public void visit(Node node){
        System.out.printf("id = %d name = %s \t \n", node.id,node.value );
    }
}
