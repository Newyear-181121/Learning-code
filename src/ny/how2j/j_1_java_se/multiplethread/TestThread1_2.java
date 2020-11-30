package multiplethread;

/**
 * 创建多线程-继承线程类
 * @author New year
 *
 *使用多线程，就可以做到盖伦在攻击提莫的同时，赏金猎人也在攻击盲僧 
 *设计一个类KillThread 继承Thread，并且重写run方法 
 *启动线程办法： 实例化一个KillThread对象，并且调用其start方法 
 *就可以观察到 赏金猎人攻击盲僧的同时，盖伦也在攻击提莫
 *
 * FatherForHero 在这里声明的 Hero对象。 还是这种方法 简单。
 */
public class TestThread1_2 extends FatherForHero{

	public static void main(String[] args) {
        
        //使用之前创立的KillThread这个类
        //这个KillThread 类是使用继承线程类的方法的。
        KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        //线程类也要先创立对象再使用。
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();
        
        
	}

}
