package ny.设计模式.原型模式;

import org.junit.Test;

/**
 * @auther: NewYear
 * @Date: 2021-04-07 19:48
 * @Version: 0.0.1
 * @Description: RealizeType 原型模式基础实现
 */
class RealizeType implements Cloneable {

    RealizeType(){
        System.out.println("原型模式实现类实例创建");
    }

    public RealizeType clone() throws CloneNotSupportedException{
        System.out.println("clone 原型实例成功");
        return (RealizeType) super.clone();
    }

}


/**
 * 测试类
 */
public class TestRealizeType{

    @Test
    public void test_main(){
         RealizeType realize1 = new RealizeType();
        RealizeType realize2 = null;
        try {
            realize2 = realize1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆失败！！！");
        }
        System.out.println("realize1==realize2" +"   "+ (realize1==realize2));
    }
}