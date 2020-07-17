package dataStructrues.N03链表.循环链表;

/**
 * 约瑟夫问题，代码分析 解法。
 */
public class CircleSingleLinkedList {
    // 创建第一节点，
    private Boy first = null;

    public Boy getFirst(){
        return first;
    }

    /**
     * 增加节点数，要增加多少个节点。构建成一个环形链表
     * @param nums 节点个数
     */
    public void addBoy(int nums){
        //输入数据校验
        if (nums < 1) {
            System.out.println("输入的值不正确 ");
            return;
        }

        Boy curBoy = null;
        for(int i = 1; i <=nums ; i++){
            //根据输入的编号创建环形链表 的节点
            Boy boy = new Boy(i);   //boy ： 循环变量节点。
            if (i == 1){ //赋初值
                first = boy;
                first.setNext(first);//闭环，，自己的下一个还是自己。
                curBoy = first;//临时变量也指向第一个节点。
            } else {
                //第二个小孩以及之后的的节点
                curBoy.setNext(boy);//让变量的下一个节点指向新加的节点
                boy.setNext(first);//让新加的节点 连接到第一个节点。
                curBoy = boy;

            }
        }
    }

    /**
     * 显示链表中所有的节点。
     */
    public void  showBoy(){
        if (first == null){
            System.out.println("no have data");
            return;
        }
        Boy curBoy = first;
        while(true){
            System.out.printf("编号是%d \n",curBoy.getNo());
            if (curBoy.getNext() == first ){
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    /**
     * 获取链表中有效节点的个数
     * @return
     */
    public int getLength(){
        if (first.getNext() == first ){
            System.out.println("头节点的下个节点还是头节点，说明链表为空");
            return 0;
        }
        int length = 0;
        Boy temp = first.getNext();
        while (temp != first){  //临时节点的下一个节点还是头节点的时候，就遍历完了。
            length++;
            temp = temp.getNext(); //后移一个节点
        }
        return  length;
    }

    /**
     *  从链表中取出对应节点的
     * @param no
     * @return
     *
     * 这就有一个问题，链表中的节点的编号要是连续的才行。
     */
    public Boy getBoyByIndex(int no){
        // 判断 索引 是否有效
        if (no < 1  ){
            System.out.println("要取出的节点的编号，小于以");
            return null;
        }
        // 定义一个临时变量。
        Boy temp = first;
        Boy resoult = null;
        while (temp.getNext() != first){
            //如果下个节点的编号，是要找的这个。
            if (temp.getNext().getNo() == no){
                // 找到了这个节点，要从链表中取出来，还是要从这个节点的前一个节点开始
                resoult = temp.getNext();
                temp.setNext(temp.getNext().getNext()) ;
                break;
            }
        }
        return resoult;
    }

    /**
     *  根据输入，计算出节点出链表的顺序
     * @param startNo  表示从第几个节点开始
     * @param countNum 表示数几下
     * @param nums 表示最开始有多少个节点
     */
    public void countBoy(int startNo, int countNum, int nums){
        if(first == null || startNo < 1 || startNo > nums){
            System.out.println("参数输入有误，");
            return;
        }
        Boy helper = first;
        while (true){
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();//后移一个节点。
        }
        //取数据之前，先让first 和 helper 移动 k -1 次
        for (int j = 0 ; j < startNo - 1 ; j++ ){
            first = first.getNext();
            helper = helper.getNext();
        }
        while(true){
            if (helper == first){
                //只剩一个节点时，退出
                break;
            }
            for (int j = 0 ;j < countNum -1 ; j++ ){
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.printf("节点%d出链表\n",first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后剩下的节点时%d\n",first.getNo());
    }
}
