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
        Persion p = new Persion();
        p.say();

        Amplifier am = new Amplifier(p);
        am.say();
    }

}

interface Say{
    void say();
}



class Persion implements Say{
    private int voice = 10;
    @Override
    public void say() {
        Out.out("Persion 的生音属性是：",this.getVoice());
    }
    public int getVoice() {
        return voice;
    }
    public void setVoice(int voice) {
        this.voice = voice;
    }
}

// 放大器
class Amplifier implements Say{
    private Persion p;
    Amplifier(Persion p){
        this.p = p;
    }
    @Override
    public void say(){
        Out.out("放大后的声音是：",p.getVoice()*100);
        Out.out("放大过的声音");
    }
}