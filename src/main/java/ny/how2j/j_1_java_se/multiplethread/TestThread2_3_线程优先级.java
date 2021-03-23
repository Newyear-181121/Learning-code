package multiplethread;


/**
 * 线程优先级
 * @author New year
 *
 *当线程处于竞争关系的时候，优先级高的线程会有更大的几率获得CPU资源 
 *为了演示该效果，要把暂停时间去掉，多条线程各自会尽力去占有CPU资源 
 *同时把英雄的血量增加100倍，攻击减低到1，才有足够的时间观察到优先级的演示 
 *如图可见，线程1的优先级是MAX_PRIORITY，所以它争取到了更多的CPU资源执行代码
 *
 *在Hero2_3  中将暂停时间去掉了。
 */
public class TestThread2_3_线程优先级 extends FatherForHero {

	public static void main(String[] args) {

        Thread t1 = new Thread(){
        	public void run(){
        		
        		while (!teemo.isDead()){
        			bh.attackHero(teemo);
        		}
        	}
        };
        
        Thread t2 = new Thread(){
        	public void run(){
        		while(!leesin.isDead()){
        			bh.attackHero(leesin);
        		}
        	}
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
	}

}

/**
 * 会出现争用
 * 有时候是执行一个线程，有时候是另一个。
 * 
 */
