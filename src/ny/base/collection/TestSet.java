package ny.base.collection;

import ny.base.常用类.myUtil.Out;

import java.util.HashSet;
import java.util.Set;

/**
 * @auther: NewYear
 * @Date: 2020-10-22 15:02
 * @version: 0.0.1
 * @description: TestSet
 *
 *  测试 HashSet 的基本用法
 *
 *      Set 无序，且不可重复。
 *
 */
public class TestSet {

    Set<String> set ;

    private TestSet(){
        set = new HashSet<>();
    }

    /**
     * 初始化赋值方法。
     */
    private void init(Set set,int startIndex,int endIndex){
        if (startIndex >= endIndex ){
            throw new RuntimeException("输入的两个索引异常，开始索引大于等于结束索引");
        }
        for (int i = startIndex ; i < endIndex ; i++){
            set.add("set "+i);
        }
    }
    private void init(Set set){
        init(set,0,10);
    }
    private void init(){
        init(set);
    }

    public void test(){
        init();

        Out.out("Set里面的元素是无序的:\n",set );
        Out.out(set);
        Out.out("但是同时多次输出时，顺序时一致的。 \n",set);

        set.remove("set 0");
        Out.out(set);


    }

    public void test2(){
        Set<String> set2 = new HashSet<>();
        init(set2,10,20);

        set.addAll(set2);
        String[] strs = (String[]) set.toArray();       //转换类型需要强制转型
        Out.out(set);
    }

    public static void main(String[] args) {
        TestSet ts= new TestSet();
        ts.test();
        ts.test2();

    }

}
