package dataStructrues.N06哈希表;

import java.util.Scanner;

/**
 * Test_main :
 *
 * @auther NewYear
 * @Date 2020-07-20 14:07
 */
public class Test_main {

    public static void main(String[] args) {
        HashTab hashTab = new HashTab(10);

        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("add:   添加节点  ");
            System.out.println("list:  显示节点  ");
            System.out.println("find:  查找");
            System.out.println("d(delet) 删除");
            System.out.println("exit:  退出  ");

            key = scanner.next();
            switch (key){
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入值");
                    String name = scanner.next();

                    Node node = new Node(id,name);

                    hashTab.add(node);

                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("要查找的id");
                    id = scanner.nextInt();
                    hashTab.findNodeById(id);
                    break;
                case "d" :
                    System.out.println("要删除的id:");
                    id = scanner.nextInt();
                    hashTab.delectById(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
