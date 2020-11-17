package ny.设计模式;

import ny.base.常用类.myUtil.Out;

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
 */
public class Decorator {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        coffee.outSelf();
        Drink suger = new Suger(coffee);
        suger.outSelf();
        Drink milk = new Milk(coffee);
        milk.outSelf();

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
        Out.out(info()+"-->"+cost());
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
        Out.out(info()+"-->"+cost());
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
        return super.info()+"添加了Milk";
    }

    @Override
    public void outSelf() {
        Out.out(info()+"-->"+cost());
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
        return super.info()+"添加了Suger";
    }

    @Override
    public void outSelf() {
        Out.out(info()+"-->"+cost());
    }
}

