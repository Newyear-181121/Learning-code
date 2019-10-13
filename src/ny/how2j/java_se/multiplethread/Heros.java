package multiplethread;


/**
 * 		想将对象创建在另外的类中，看其他类能否直接调用这里的对象。。。
 * @author New year
 *
 */
public class Heros  {		//extends Hero
	
	public static void main(String[] args){
	Hero gareen = new Hero();
    gareen.name = "盖伦";
    gareen.hp = 616;
    gareen.damage = 50;

    Hero teemo = new Hero();
    teemo.name = "提莫";
    teemo.hp = 300;
    teemo.damage = 30;
     
    Hero bh = new Hero();
    bh.name = "赏金猎人";
    bh.hp = 500;
    bh.damage = 65;
     
    Hero leesin = new Hero();
    leesin.name = "盲僧";
    leesin.hp = 455;
    leesin.damage = 80;

	}
}
