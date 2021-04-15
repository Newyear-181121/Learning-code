package ny.设计模式.代理模式;

import org.junit.Test;

/**
 * @description: ProxyTest
 * @projectName: Learning-code-----notes
 * @authOr: NewYear
 * @createTime: 2021-04-15 周四 11:11
 * @version: 0.0.1
 *
 * 代理模式的主要角色如下。
 *  1. 抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
 *  2. 真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 *  3. 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 */
public class ProxyTest {
    /**
     * 通过代理类来执行实际上需要执行的方法。
     */
    @Test
    public void test_01(){
            Proxy proxy = new Proxy();
            proxy.request();

    }

    @Test
    public void test_02(){
        Subject subject = new RealSubject();
        subject.request();

        subject = new Proxy();
        subject.request();
    }
}

/**
 * 抽象主题
 */
interface Subject {
    void request();
}


/**
 * 真实主题
 */
class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("直接执行，访问真实主题方法...");
    }
}


class Proxy implements Subject{

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。  就是在执行过程中添加一个代理，实际上是通过代理执行的真实方法。");
    }
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}