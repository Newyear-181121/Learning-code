package ny.设计模式.适配器模式;

import org.junit.Test;

/**
 * @description: AdapterTest_class
 * @projectName: Learning-code
 * @authOr: NewYear
 * @createTime: 2021-04-15 周四 13:10
 * @version: 0.0.1
 *
 *
 * 适配器模式（Adapter）包含以下主要角色。
 *  1. 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 *  2. 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 *  3. 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *
 *
 *
 *  url : http://c.biancheng.net/view/1361.html
 */
public class AdapterTest {
    /**
     * 类适配器模式  调用测试
     */
    @Test
    public void test_class(){
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }

    /**
     * 对象适配器模式 调用测试
     */
    @Test
    public void test_object(){
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}

/**
 *  目标接口
 */
interface Target {
    public void request();
}
/**
 *  适配者接口
 */
class Adaptee{
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
/**
 *  类适配器类
 */
class ClassAdapter extends Adaptee implements Target
{
    public void request()    {
        specificRequest();
    }
}





/**
 *对象适配器类
 */
class ObjectAdapter implements Target
{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee=adaptee;
    }

    public void request()    {
        adaptee.specificRequest();
    }
}