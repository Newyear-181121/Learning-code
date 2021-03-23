package multiplethread;


/**
 * 临时暂停
 * @author New year
 *
 *当前线程，临时暂停，使得其他线程可以有更多的机会占用CPU资源
 */
public class TestThread2_4_yield方法 extends FatherForHero {

	public static void main(String[] args) {

        
        Thread t1 = new Thread() {
        	public void run(){
        		
        		while(!teemo.isDead()){
        			gareen.attackHero(teemo);
        		}
        	}
        };
        
        Thread t2 = new Thread(){
        	public void run(){
        		while(!leesin.isDead()){
        			//临时暂停，使得t1可以占用CPU资源
                    Thread.yield();
                    
                    bh.attackHero(leesin);
        		}
        	}
        };
        
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();
	}

}
