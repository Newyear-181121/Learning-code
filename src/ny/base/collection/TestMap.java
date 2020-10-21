package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: NewYear
 * @Date: 2020-10-21 15:44
 * @version: 0.0.1
 * @description: TestMap
 */
public class TestMap {

    Map<Integer,String> map;

    public TestMap(){
        map = new HashMap<>();

    }

    public void test01(){


        map.put(1,"one");
        map.put(2,"two");

        Out.out(map);
        Out.out("通过key 获取map的值：",map.get(2));


        Out.out("size:",map.size());
        Out.out("是否是空：",map.isEmpty());
        Out.out("方法containsKey,是否包含这个key：",map.containsKey(2));
        Out.out("方法containsValue,是否包含这个值：",map.containsValue("3"));
    }

    public void test02(){
        Map<Integer,String> m2 = new HashMap<>();
        m2.put(5,"test");
        m2.put(66,"sixsix");

        Out.out("m2是：",m2);
        Out.out("map是：",map);
        map.putAll(m2);
        Out.out("新的map是：",map);

        Out.out("每次输出时候，顺序好像不是一致的。",map);
        Out.out("每次输出时候，顺序好像不是一致的。",map);
        Out.out("每次输出时候，顺序好像不是一致的。",map);
        Out.out("好像是一致的",map);
    }

    public void test03(){

    }

    public static void main(String[] args) {
        TestMap tm = new TestMap();

        tm.test01();
        tm.test02();
        tm.test03();
    }

}
