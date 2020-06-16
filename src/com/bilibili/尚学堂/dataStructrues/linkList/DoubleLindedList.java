package dataStructrues.linkList;

public class DoubleLindedList {
    private DoubleNode head = new DoubleNode(0,"","");

    public DoubleNode getHead(){
        return head;
    }

    /**
     * 遍历双向链表
     */
    public void list(){
        //如果头节点为空，则链表为空。
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        DoubleNode temp = head.next;
        while (temp != null ){
            visiter(temp);
            temp = temp.next;
        }
        System.out.println("遍历结束");
    }

    /**
     *  链表尾部增加节点。
     * @param doubleNode
     */
    public void add(DoubleNode doubleNode){

        // 因为head节点不能动，因此我们需要一个辅助变量 temp
        DoubleNode temp = head;

        while (true){
            if(temp.next == null){//如果到了最后，就退出
                break;
            }
            temp = temp.next;
        }
        temp.next = doubleNode;//把新的节点加到最后的节点之后。
        doubleNode.pre = temp;
    }


    public void update(DoubleNode newDoubleNode){
        if(head.next == null ){
            System.out.println("链表为空");
            return;
        }
        DoubleNode temp = head.next;
        boolean flag = false;
        while (true){
            if (temp == null){
                //如果为空，说明链表已经遍历完了。
                break;
            }
            if (temp.no == newDoubleNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = newDoubleNode.name;
            temp.nickname = newDoubleNode.nickname;
        } else {
            System.out.printf("没有找到编号 %d的节点，不能修改\n",newDoubleNode.no);
        }
    }

    /**
     * 删除节点
     * @param no 节点号
     */
    public void del(int no){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        DoubleNode temp = head.next;
        boolean flag = false;
        while (true){
            if (temp == null){
                //如果为空，说明链表已经遍历完了。
                break;
            }
            if (temp.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            //temp.next = temp.next.next;
            temp.pre.next = temp.next;//把这个节点的前一个节点的下个 引用指向下个节点。
            if (temp.next != null){
                temp.next.pre = temp.pre;
            }

        } else {
            System.out.printf("没有找到编号 %d的节点，不能删除\n",no);
        }
    }

    /**
     *  方法：获取单链表的有效节点的个数（头节点不统计）
     * @param head 链表的头节点
     * @return  返回有效节点的个数
     */
    public int getLength(DoubleNode head){
        if(head.next == null){
            return 0;
        }
        int length = 0  ;
        //头节点的为空。
        DoubleNode cur = head.next;
        while (cur != null){
            length++;
            cur = cur.next;
        }
        return length;
    }
    public int getLength(){
        return getLength(getHead());
    }

    /**按顺序插入。  根据排名插入
     * 如果有这个排名，则插入失败
     */
    public void addByOrder(DoubleNode heroNode){
        DoubleNode temp = head;
        //flag 标志添加的编号是否存在。
        boolean flag = false;
        while(true){
            if (temp.next == null){ // 判断是不是走到了链表的最后
                break;
            }
            if( temp.no > heroNode.no){ //位置找到了，
                break;
            }else if (temp.no == heroNode.no){ //说明已经有一个一样的节点了。
                flag = true;
                break;
            }
            temp = temp.next; //后移，  遍历链表
        }
        if(flag){
            System.out.printf("已经有相同的节点了，节点编号是%d\n",heroNode.no);
        } else {
            temp.pre.next = heroNode;
            if (temp.next != null) {
                temp.next.pre = heroNode;
            }
        }
    }

    /**
     * 反转双链表
     *  新建一个空链表，
     *  每次都插入新链表的第一个位置。
     * @param head 链表的头节点。
     */
    public void reversetDoubleList(DoubleNode head){
        //如果没有节点或只有一个节点，就不需要处理
        if (head.next == null || head.next == null){
            return ;
        }

        //这个是辅助指针用来遍历的
        DoubleNode cur = head.next;
        //这个用来保存下一个节点的引用。
        DoubleNode next = null;
        DoubleNode pre = null;
        DoubleNode reverseHead = new DoubleNode(0,"","");

        // 指针指向空的时候，遍历结束了。
        while(cur != null ){
            next = cur.next;        //保存下个节点的位置
            // 这两部就是从头节点插入。
            cur.next = reverseHead.next;  //把指针节点的下个节点指向，新链表 头节点的下个节点

            reverseHead.next = cur; // 把新链表的头节点指向，这个指针的节点。

            cur.pre = reverseHead;      //让这个节点的 上个节点指向头
            reverseHead.next.pre = cur;  //原本上个节点是头的节点，指向这个节点。
            cur = next; //把当前指针后移一位。
        }
        head.next = reverseHead.next; //把头节点的指向换一下。
    }
    public void reversetDoubleList(){
        reversetDoubleList(getHead());
    }

    /**
     * 访问此节点。
     * @param temp 该节点的变量名。
     */
    private void visiter(DoubleNode temp) {
        System.out.println(temp);
    }


}
