package ny.设计模式.桥接模式;

import org.junit.Test;

/**
 * @description: BridgeTest
 * @projectName: Learning-code
 * @author: NewYear
 * @createTime: 2021-04-15 周四 13:32
 * @version: 0.0.1
 *
 *
 *
 *  桥接（Bridge）模式包含以下主要角色。
 *      1. 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 *      2. 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *      3. 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 *      4. 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 *
 *
 *  url: http://c.biancheng.net/view/1364.html
 */
public class BridgeTest {

    @Test
    public void test(){
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}




/**
 * 实现化角色
 */
interface Implementor {
    public void OperationImpl();
}



/**
 * 具体实现化角色
 */
class ConcreteImplementorA implements Implementor {
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}



/**
 * 抽象化角色
 */
abstract class Abstraction {

    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();

}



/**
 * 扩展抽象化角色
 */
class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();
    }
}