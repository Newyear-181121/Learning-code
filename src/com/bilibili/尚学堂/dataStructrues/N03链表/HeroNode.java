package dataStructrues.N03链表;



/**
 * 定义HeroNode ,每个HeroNode 对象就是一个节点
 */
public class HeroNode {
    public int no;
    public String name;
    String nickname;
    HeroNode next; //执行下一个节点

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
