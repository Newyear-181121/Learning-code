package character;

/**
 * 单例模式又叫做 Singleton模式，指的是一个类，在一个JVM里，只有一个实例存在。
 *
 * giant：巨人
 * dragon：龙
 *
 * 不管有没有调用获取调用对象的方法，这个类的对象已经有了，
 *
 * 这种单例模式又叫做饿汉式单例模式，无论如何都会创建一个实例
 */
public class GiantDragon {

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){
         
    }
 
    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();
     
    //public static 方法，提供给调用者获取12行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }
     
}
