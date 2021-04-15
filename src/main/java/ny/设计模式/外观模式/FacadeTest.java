package ny.设计模式.外观模式;

import org.junit.Test;

/**
 * @description: FacadeTest
 * @projectName: Learning-code-----notes
 * @author: NewYear
 * @createTime: 2021-04-15 周四 14:10
 * @version: 0.0.1
 *
 *
 *
 *  外观（Facade）模式包含以下主要角色。
 *      1. 外观（Facade）角色：为多个子系统对外提供一个共同的接口。
 *      2. 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
 *      3. 客户（Client）角色：通过一个外观角色访问各个子系统的功能。
 */
public class FacadeTest {

    /**
     * 相当于封装后统一调用。
     */
    @Test
    public void test(){
        Facade f = new Facade();
        f.method();
    }
}



/**
 * 外观角色
 */
class Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
/**
 * 子系统角色
 */
class SubSystem01 {
    public void method1() {
        System.out.println("子系统01的method1()被调用！");
    }
}
/**
 * 子系统角色
 */
class SubSystem02 {
    public void method2() {
        System.out.println("子系统02的method2()被调用！");
    }
}
/**
 * 子系统角色
 */
class SubSystem03 {
    public void method3() {
        System.out.println("子系统03的method3()被调用！");
    }
}