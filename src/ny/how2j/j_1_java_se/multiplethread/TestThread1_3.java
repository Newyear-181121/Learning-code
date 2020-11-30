package multiplethread;


/**
 * 创建多线程-实现Runnable接口
 * @author New year
 *		//look  Battle.java
 */
public class TestThread1_3 extends FatherForHero {

	public static void main(String[] args) {

        Battle battle1 = new Battle(bh,leesin);
        new Thread(battle1).start();
        
        Battle battle2 = new Battle(gareen,teemo);
        new Thread(battle2).start();

        int x =50;
        while (x>0){
                System.out.println(x);
                x--;
        }

	}

}
