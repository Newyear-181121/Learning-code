package dataStructrues.N07树.N04霍夫曼树.N02霍夫曼编码;


import java.util.*;

/**
 * @auther: NewYear
 * @Date: 2020-07-24 16:26
 * @version: 0.0.1
 * @description: TreeCode
 */
public class TreeCode {

    /**
     * 统计字符数组中每个字符出现的次数
     * @param bytes 要统计的字节数据
     * @return List 记录每个字节出现的次数的 Node
     */
    private static List<Node> getNodes(byte[] bytes){

        ArrayList<Node> nodes = new ArrayList<Node>();

        Map<Byte,Integer> counts = new HashMap<>();

        for (byte b : bytes){
            Integer count = counts.get(b);
            if (count == null ){
                counts.put(b,1);
            } else {
                counts.put(b,count + 1);
            }
        }

        // 遍历map ，，转换成node对象。
        for (Map.Entry<Byte, Integer> entry : counts.entrySet()){
            nodes.add(new Node(entry.getKey(),entry.getValue()));
        }
        return nodes;
    }

    private static Node creatTree(List<Node> nodes){
        while(nodes.size()> 1){
            Collections.sort(nodes);
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);

            Node parent = new Node(null,leftNode.weight + rightNode.weight);
            parent.left = leftNode;
            parent.right = rightNode;

            nodes.add(parent);
        }
        return nodes.get(0);
    }

    private static void preOrder(Node root){
        if (root != null){
            root.preOrder();
        } else {
            System.out.println("..........");
        }
    }
}
