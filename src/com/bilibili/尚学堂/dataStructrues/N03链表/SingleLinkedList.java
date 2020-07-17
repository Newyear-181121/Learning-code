package dataStructrues.N03链表;

import java.util.Stack;

/**
 * 管理节点
 */
public class SingleLinkedList {
    //先初始化一个头节点，头节点不要动，不存放具体的数据
    private HeroNode head = new HeroNode(0,"","");


    public HeroNode getHead() {
        return head;
    }

    /**
     * 添加节点到单向链表
     * 思路：当不考虑顺序时
     * 1. 找到当前链表的最后节点
     * 2. 将最后这个节点的next 指向 新的节点
     *
     * 这个添加是直接将节点加到最后面。
     */
    public void add(HeroNode hearNode){

        // 因为head节点不能动，因此我们需要一个辅助变量 temp
        HeroNode temp = head;

        while (true){
            if(temp.next == null){//如果到了最后，就退出
                break;
            }
            temp = temp.next;
        }
        temp.next = hearNode;//把新的节点加到最后的节点之后。
    }

    /**按顺序插入。  根据排名插入
     * 如果有这个排名，则插入失败
     */
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        boolean flag = false;//flag 标志添加的编号是否存在。
        while(true){
            if (temp.next == null){ // 判断是不是走到了链表的最后
                break;
            }
            if( temp.next.no > heroNode.no){ //位置找到了，
                break;
            }else if (temp.next.no == heroNode.no){ //说明已经有一个一样的节点了。
                flag = true;
                break;
            }
            temp = temp.next; //后移，  遍历链表
        }
        if(flag){
            System.out.printf("已经有相同的节点了，节点编号是%d\n",heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;

            /**
             * 这里本来是  temp.next ——> a  的   变成
             *
             *   temp。next ——> heroNode ,  heroNode.next  ——> a
             *
             *
             *   temp  —— —— >  a
             *     \           /
             *      \         /
             *        heroNode
             */
        }
    }

    /**
     * 修改节点信息，根据节点编号定位，
     *
     */
    public void update(HeroNode newHeroNode){
        if(head.next == null ){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true){
            if (temp == null){
                //如果为空，说明链表已经遍历完了。
                break;
            }
            if (temp.no == newHeroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.printf("没有找到编号 %d的节点，不能修改\n",newHeroNode.no);
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
        HeroNode temp = head;
        boolean flag = false;
        while (true){
            if (temp.next == null){
                //如果为空，说明链表已经遍历完了。
                break;
            }
            if (temp.next.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.next = temp.next.next;
        } else {
            System.out.printf("没有找到编号 %d的节点，不能删除\n",no);
        }
    }

    /**
     * 遍历单链表
     */
    public void list(){
        //如果头节点为空，则链表为空。
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
        System.out.println("遍历结束");
    }

    /**
     *  方法：获取单链表的有效节点的个数（头节点不统计）
     * @param head 链表的头节点
     * @return  返回有效节点的个数
     */
    public int getLength(HeroNode head){
        if(head.next == null){
            return 0;
        }
        int length = 0  ;
        //头节点的为空。
        HeroNode cur = head.next;
        while (cur != null){
            length++;
            cur = cur.next;
        }
        return length;
    }

    /**
     *  查找列表中的倒数第k哥节点。
     * @param head  链表的头节点
     * @param index
     * @return
     */
    public HeroNode findLastIndexNode(HeroNode head,int index){
        if(head.next == null){
            return null ;
        }
        int size = getLength(head);
        if (index <= 0 || index > size){
            return null;
        }
        HeroNode temp = head.next;
        for(int i = 0 ; i < size -index ; i++){
            temp = temp.next;
        }
        return temp;
    }
    public HeroNode findLastIndexNode(int index){
        return findIndexNode(getHead(),index);
    }

    /**
     * 查找链表的第k个节点
     * @param head 链表的头节点
     * @param index 查找的位置
     * @return
     */
    public HeroNode findIndexNode(HeroNode head,int index){
        if(head.next == null){
            return null;
        }
        //判断index是否有效
        int size = getLength(head);
        if(index <= 0 || index > size){
            return null;
        }
        HeroNode temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }
    public HeroNode findIndexNode(int index){
        return findIndexNode(getHead(),index);
    }

    /**
     * 反转单链表
     *  新建一个空链表，
     *  每次都插入新链表的第一个位置。
     * @param head 链表的头节点。
     */
    public void reversetList(HeroNode head){
        //如果没有节点或只有一个节点，就不需要处理
        if (head.next == null || head.next == null){
            return ;
        }

        //这个是辅助指针用来遍历的
        HeroNode cur = head.next;
        //这个用来保存下一个节点的引用。
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0,"","");

        // 指针指向空的时候，遍历结束了。
        while(cur != null ){
            next = cur.next;        //保存下个节点的位置
            // 这两部就是从头节点插入。
            cur.next = reverseHead.next;  //把指针节点的下个节点指向，新链表 头节点的下个节点

            reverseHead.next = cur; // 把新链表的头节点指向，这个指针的节点。
            cur = next; //把当前指针后移一位。
        }
        head.next = reverseHead.next;
    }

    public void reversetList(){
        reversetList(getHead());
    }


    /**
     * 借住栈结构逆序打印
     * @param head
     */
    public void reversePrint(HeroNode head){
        if (head.next == null){
            return  ;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;

        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (stack.size() > 0 ){
            System.out.println(stack.pop());
        }
    }
    public void reversePrint(){
        reversePrint(getHead());
    }

}
