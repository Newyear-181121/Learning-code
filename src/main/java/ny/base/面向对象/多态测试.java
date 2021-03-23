package ny.base.面向对象;

/**
 * @auther: NewYear
 * @Date: 2020-10-10 10:57
 * @version: 0.0.1
 * @description: 多态测试   多态这里的 特性有点多。
 *
 *   子类会继承父类的所有的public 方法， 如果子类重写了父类的方法，
 */
public class 多态测试 {
    public static void main(String[] args) {
        father f = new father();
        f.test(f);

        f.test(new son());
        f.test();
        new son().test();   // 子类有自己的实现，就会执行子类的方法。
        new son2().test();  //子类没有重写，就会执行父类的方法。
        new daughter().test();

        new son3().test();  //重写方法后，就行的就是重写后的方法，没有重写，就是执行继承自父类的方法。
    }
}

/**
 * 父类
 */
class father{
    public father(){
        System.out.println("-----------------------");
        System.out.println("father的构造器执行了。");
    }

    /**
     * father 的test方法。
     * @param father
     */
    public void test(father father){
        father.cry();
    }
    public void test(){
        cry();
    }

    public void cry(){
        System.out.println("father执行 cry 方法");
    }
}

/**
 * 子类1
 */
class son extends father{

    public son(){
        super();                                    //不管有没有写，都会有这句默认在第一行执行。
        System.out.println("son的构造器执行了。");
    }


    public void cry(){
        System.out.println("son执行 cry 方法");
    }

}


/**
 * 子类2
 */
class daughter extends father{
    public daughter() {
        System.out.println("daughter的构造器执行了。");
    }

    public void cry(){
        System.out.println("daughter执行 cry 方法");
    }

}


class son2 extends father{

}

class son3 extends father{
    public void test(){
        System.out.println("son3重写了父类的test方法");
    }
}
