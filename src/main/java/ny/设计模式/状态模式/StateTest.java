package ny.设计模式.状态模式;

import org.junit.Test;

/**
 * @description: StateTest
 * @projectName: Learning-code-----notes
 * @author: NewYear
 * @createTime: 2021-04-15 周四 16:13
 * @version: 0.0.1
 *
 *
 *
 * 状态模式包含以下主要角色。
 *  1. 环境类（Context）角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。
 *  2. 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
 *  3. 具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换。
 *
 */
public class StateTest {

    @Test
    public void test(){
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}

/**
 * 环境类
 */
class Context {
    private State state;
    //定义环境类的初始状态
    public Context() {
        this.state = new ConcreteStateA();
    }
    //设置新状态
    public void setState(State state) {
        this.state = state;
    }
    //读取状态
    public State getState() {
        return (state);
    }
    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}

/**
 * 抽象状态类
 */
abstract class State {
    public abstract void Handle(Context context);
}

/**
 * 具体状态A类
 */
class ConcreteStateA extends State {
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}

/**
 * 具体状态B类
 */
class ConcreteStateB extends State {
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}