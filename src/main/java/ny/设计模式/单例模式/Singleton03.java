package ny.设计模式.单例模式;

/**
 * @auther: NewYear
 * @Date: 2020-12-28 11:14
 * @version: 0.0.1
 * @description: Singleton03 静态内部类实现方式。
 */
public class Singleton03 {
    /**
     * 声明一个私有的内部静态类
     */
    private static class Singleton03Class{
        private static final Singleton03 instance = new Singleton03();
    }

    private void singleton03(){

    }

    /**
     * 返回内部类中 创建的 对象。
     * @return
     */
    public Singleton03 getInstance(){
        return Singleton03Class.instance;
    }
}
