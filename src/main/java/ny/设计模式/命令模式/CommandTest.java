package ny.设计模式.命令模式;

import org.junit.Test;

/**
 * @description: CommandTest
 * @projectName: Learning-code-----notes
 * @author: NewYear
 * @createTime: 2021-04-15 周四 15:47
 * @version: 0.0.1
 *
 *
 * 命令模式包含以下主要角色。
 *  1. 抽象命令类（CommandTest）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()。
 *  2. 具体命令类（Concrete CommandTest）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 *  3. 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 *  4. 调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 */
public class CommandTest {

    @Test
    public void test(){
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}


/**
 * 调用者
 */
class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}

/**
 * 抽象命令
 */
interface Command {
    public abstract void execute();
}

/**
 * 具体命令
 */
class ConcreteCommand implements Command {

    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    public void execute() {
        receiver.action();
    }
}

/**
 * 接收者
 */
class Receiver {
    public void action() {
        System.out.println("接收者的action()方法被调用...");
    }
}