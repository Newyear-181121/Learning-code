package dataStructrues.linkList;

public class Test01 {
    public static void main(String[] args) {
        HeroNode  node1 = new HeroNode(1,"松江","及时雨");
        HeroNode node2 = new HeroNode(2,"123","321");
        HeroNode node3 = new HeroNode(3,"456","654");
        HeroNode node4 = new HeroNode(4,"789","987");

        SingleLinkedList list = new SingleLinkedList();


//        list.add(node1);
//        list.add(node2);
//        list.add(node3);
//        list.add(node4);

        list.addByOrder(node4);
        list.addByOrder(node3);
        list.addByOrder(node2);
        list.addByOrder(node1);
        list.addByOrder(node2);
        list.addByOrder(node2);

        System.out.println("输出倒数第2个节点");
        System.out.println(list.findLastIndexNode(list.getHead(),2));

        list.list();
        //测试修改节点代码
        HeroNode newHeroNode = new HeroNode(2,"卢俊义","玉麒麟");
        list.update(newHeroNode);

        //测试获取有效节点个数
        System.out.println(list.getLength(list.getHead()));
        list.list();



        list.del(1);
        list.del(4);
        //list.del(2);
        list.del(3);
        list.list();

        System.out.println(list.getLength(list.getHead()));
    }
}
