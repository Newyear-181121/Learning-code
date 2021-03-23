package ny.设计模式.单例模式;

/**
 * @auther: NewYear
 * @Date: 2020-12-28 10:59
 * @version: 0.0.1
 * @description: Singleton  饿汉模式
 */
public class Singleton {
    private static Singleton instance = new Singleton();    //初始化的时候，直接就加载了这个对象。

    private Singleton(){

    }

    public Singleton getInstance(){
        return instance;
    }
}
