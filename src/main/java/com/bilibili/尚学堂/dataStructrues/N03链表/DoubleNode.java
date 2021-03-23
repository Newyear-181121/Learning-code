package dataStructrues.N03链表;

public class DoubleNode {
    public int no;
    public String name;
    String nickname;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
