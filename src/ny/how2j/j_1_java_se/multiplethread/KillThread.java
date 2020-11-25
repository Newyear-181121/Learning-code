package multiplethread;


/**
 *    这个类是1_2服务的类
 * @author New year
 *
 * 	实现线程方式一： 继承 Thread 方法。
 *
 * 			继承 Thread 类的对象，调用 start 方法启动线程。
 *
 */
public class KillThread extends Thread{
	
	private Hero h1;
	private Hero h2;
	
	public KillThread(Hero h1, Hero h2){
		this.h1 = h1;
		this.h2 = h2;
	}
	
	public void run(){
		while(!h2.isDead()){
			h1.attackHero(h2);
		}
	}
	

}
