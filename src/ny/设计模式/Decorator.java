package ny.设计模式;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-17 21:09
 * @version: 0.0.1
 * @description: 装饰器模式
 *  学习 处理流之前简单了解下 设计模式： 装饰器模式  Decorator mode
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