package dataStructrues.N06哈希表;

import java.util.Scanner;

/**
 * Test :
 *
 * @auther NewYear
 * @Date 2020-07-17 20:17
 */
public class Test {

    HashTab hashTab = new HashTab(10);


    @org.junit.Test
    public void add(){
        Node node = new Node(1,"test");
        hashTab.add(node);
        hashTab.list();
    }



}
