package ny.设计模式.静态代理模式;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-26 21:55
 * @version: 0.0.1
 * @description: StaticProxy
 *      在学习多线程的时候开始接触。
 *
 * 静态代理
 * 公共接口：
 * 1. 真实角色
 * 2. 带路角色
 */
public class StaticProxy {

    public static void main(String[] args) {
        new Proxy(new You()).happyMarry();

        // new Thread(线程对象).start();
    }
}

/**
 * 公共接口
 */
interface Marry{
    void happyMarry();
}

/**
 * 真实角色
 */
class You implements Marry{
    @Override
    public void happyMarry() {
        Out.out("真实方法执行了。");
    }

}

/**
 * 代理角色
 */
class Proxy implements Marry{

    // 真实角色 参数。
    private Marry target;

    public Proxy(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        read();
        this.target.happyMarry(); // 实际上执行的是真实角色的方法
        after();
    }

    /**
     * 执行实际方法器执行的准备方法。
     */
    private void read() {
        Out.out("准备方法执行");
    }

    /**
     * 指定实际方法后收尾的方法。
     */
    private void after(){
        Out.out("收尾结束");
    }


}


