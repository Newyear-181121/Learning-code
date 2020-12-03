package ny.设计模式.装饰器模式;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

/**
 * @auther: NewYear
 * @Date: 2020-11-17 21:09
 * @version: 0.0.1
 * @description: 装饰器模式
 *  设计模式： 装饰器模式  Decorator mode
 *  四大组件：
 *      1. 抽象组件：需要装饰的抽象对象（接口或抽象父类）
 *      2. 具体组件： 需要装饰的对象
 *      3. 抽象装饰类： 包含了对抽象组件的引用及装饰者共有的方法
 *      4. 具体装饰类： 被装饰的对象。
 *
 *
 *    具体组件 和 抽象装饰类  实现 抽象组件 接口
 *              具体装饰类继承 抽象装饰了。
 *
 *    具体 组件 和具体装饰类 都可以有多个。
 *
 *    具体装饰类 是装饰品，，用来装饰 具体组件的。
 *
 *        new 装饰类（具体类）   装饰品都是在外面的，，   就像手机壳 是手机的装饰品，在手机外面一样。
 *
 *    具体组件 可以 有多个装饰类，
 *
 */
public class Decorator {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        coffee.outSelf();

        Drink suger = new Suger(coffee);
        suger.outSelf();

        Drink milk = new Milk(coffee);
        milk.outSelf();

        Drink milk2 = new Milk(suger);
        milk2.outSelf();

        milk = new Milk(milk);
        milk.outSelf();

        suger = new Suger(new Milk(suger));
        suger.outSelf();
    }

    @Test
    public void  testTea(){
        Drink tea = new Tea();
        Drink suger = new Suger(tea);
        suger.outSelf();

    }

}

/**
 * 抽象组件
 * 需要装饰的抽象对象（接口或抽象父类）
 */
interface Drink{
    double cost();//费用
    String info();//说明
    void outSelf(); // 输出自己的信息。
}

/**
 * 具体组件
 * 需要装饰的对象
 */
class Coffee implements Drink{
    private String name = "Coffee";

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String info() {
        return name;
    }

    @Override
    public void outSelf() {
        Out.out(info()+"-->"+cost()+"------"+this.getClass().getName());
    }
}

class Tea implements Drink{
    private String name = "tea";
    @Override
    public double cost() {
        return 8;
    }

    @Override
    public String info() {
        return name;
    }

    @Override
    public void outSelf() {
        Out.out(info()+"-->"+cost()+"------"+this.getClass().getName());
    }
}

/**
 * 抽象装饰类
 * 包含了对抽象组件的引用及装饰者共有的方法
 */
abstract class Decorate implements Drink{
    //对抽象组件的引用
    private Drink drink;
    public Decorate(Drink drink){
        this.drink = drink;
    }

    @Override
    public double cost() {
        return this.drink.cost();
    }

    @Override
    public String info() {
        return this.drink.info();
    }

    @Override
    public void outSelf() {
        Out.out(info()+"-->"+cost()+"------"+this.getClass().getName());
    }
}

/**
 * 具体装饰类1 Mikl
 * 被装饰的对象   装饰品
 */
class Milk extends Decorate{
    public Milk(Drink drink){
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()*5;
    }

    @Override
    public String info() {
        return super.info()+"添加了Milk ";
    }

    @Override
    public void outSelf() {
        Out.out(info()+"-->"+cost()+"------"+this.getClass().getName());
        Out.out("\t子类继承父类的方法，只要不重写方法就是一样的。\n\t是子类自己有一个跟父类相同的方法");
    }
}

/**
 * 具体装饰类2 Suger
 * 被装饰的对象 装饰品
 */
class Suger extends Decorate{
    public Suger(Drink drink){
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()*2;
    }

    @Override
    public String info() {
        return super.info()+"添加了Suger ";
    }

//    @Override
//    public void outSelf() {
//        Out.out(info()+"-->"+cost());
//    }
}

