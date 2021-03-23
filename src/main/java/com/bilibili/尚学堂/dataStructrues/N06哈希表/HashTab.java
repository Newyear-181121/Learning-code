package dataStructrues.N06哈希表;

/**
 * HashTab :
 *
 * @auther NewYear
 * @Date 2020-07-17 20:04
 */
public class HashTab {
    private LinkedList[] nodeLinkedListArray;
    private int size;


    /**
     * 构造器
     * @param size
     */
    public HashTab(int size) {
        this.size = size;
        nodeLinkedListArray = new LinkedList[size];
        /**
         * 注意要分别初始化每个链表
         */
        for (int i = 0 ; i < size; i++){
            nodeLinkedListArray[i] = new LinkedList();
        }

    }

    public void add(Node node){
        //1.先要确定 添加到哪个链表
        int NodeLinkedListNO = hashFun(node.id);
        //2.添加到这个链表的末尾
        nodeLinkedListArray[NodeLinkedListNO].add(node);
    }

    public int hashFun(int id){
        return id % size;
    }

    /**
     * 遍历哈希表
     */
    public void list(){
        for (int i = 0 ; i < size ; i++ ){
            // 只需要 循坏调用 遍历链表的方法即可。
            nodeLinkedListArray[i].list(i);
        }
    }

    public void findNodeById(int id){
        int NodeLinkedListNO = hashFun(id);
        Node current = nodeLinkedListArray[NodeLinkedListNO].findNodeById(id);
        if ( current != null ) {
            System.out.println("节点为： " + current);
        } else {
            System.out.println("没有该id的节点");
        }
    }

    public void delectById(int id){
        int NodeLinkedListNO = hashFun(id);
        nodeLinkedListArray[NodeLinkedListNO].deletById(id);
    }
}
