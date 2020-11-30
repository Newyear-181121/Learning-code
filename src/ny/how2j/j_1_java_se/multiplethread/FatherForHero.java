package multiplethread;

/**
 * @auther: NewYear
 * @Date: 2020/11/30 22:54
 * @version: 0.0.1
 * @function:   声明对象。
 * @description: FatherForHero
 *
 *  直接在这里声明四个 实例，后面的类直接继承此类就可以不用再声明 四个Hero 对象了
 */
public class FatherForHero {
    static Hero gareen = new Hero("盖伦",616,50);
    static Hero teemo = new Hero("提莫",300,30);
    static Hero bh = new Hero("赏金猎人",500,65);
    static Hero leesin = new Hero("盲僧",455,80);
}
