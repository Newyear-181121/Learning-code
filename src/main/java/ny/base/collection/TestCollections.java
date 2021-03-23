package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @auther: NewYear
 * @Date: 2020-10-28 20:20
 * @version: 0.0.1
 * @description: TestCollections  Collections  工具类常用方法 学习实验。
 */
public class TestCollections {

    List<String> list ;

    public TestCollections() {
        list = new ArrayList<>();
    }

    public void init(){
        for (int i = 0 ; i < 10 ; i++){
            list.add("test"+i);
        }
        Out.out(list);
    }

    public void test(){
        init();

        Collections.shuffle(list);
        Out.out("随机排列list中的元素：\n",list);

        Collections.reverse(list);
        Out.out("逆序排列list中的数据：\n",list);

        Collections.sort(list);
        Out.out("递增排序：\n",list);

        // 自定义排序 实现 Comparable 排序。

        Out.out("二分查找（折半查找) 获取查找的:\n",Collections.binarySearch(list,"test5"));

    }

    public static void main(String[] args) {
        TestCollections my = new TestCollections();

        my.test();
    }

}
