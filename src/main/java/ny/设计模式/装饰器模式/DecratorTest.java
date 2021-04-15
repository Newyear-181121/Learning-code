package ny.设计模式.装饰器模式;

import org.junit.Test;

/**
 * @description: DecratorTest   装饰器模式事例
 * @projectName: Learning-code-----notes
 * @author: NewYear
 * @createTime: 2021-04-15 周四 13:59
 * @version: 0.0.1
 */
public class DecratorTest {

    @Test
    public void test(){
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------装饰器装饰后------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}



/**
 * 抽象构件角色
 */
interface Component {
    public void operation();
}
/**
 * 具体构件角色
 */
class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
/**
 * 抽象装饰角色
 */
class Decorator_2 implements Component {
    private Component component;
    public Decorator_2(Component component) {
        this.component = component;
    }
    public void operation() {
        component.operation();
    }
}
/**
 * 具体装饰角色
 */
class ConcreteDecorator extends Decorator_2 {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}