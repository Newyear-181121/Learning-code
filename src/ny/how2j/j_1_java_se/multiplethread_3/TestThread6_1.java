package multiplethread_3;


/**
 * 不好的解决方式     		解决互交问题
 * @author New year
 *
 */
public class TestThread6_1 {

	public static void main(String[] args) {

		final Hero6_1 gareen= new Hero6_1() ;
		gareen.name = "盖伦";
		gareen.hp = 616;
		gareen.damage = 60 ;
		
		Thread t1 = new Thread() {
			public void run() {
				int i = 0 ;
				while(true) {
					
					System.out.printf("t1线程，第%d次执行",i);
					i++;
					
					
					//因为减血更快，所以盖伦的血量迟早会到达1
                    //使用while循环判断是否是1，如果是1就不停的循环
                    //直到加血线程回复了血量
				//	while(gareen.hp==1){
				//		continue;
				//	}
					
					if(gareen.isDead()){
						System.out.println("已经没血了");
						break;
					}
					gareen.attackHero(gareen);
					
					gareen.hurt();
					System.out.printf("t1 为%s 减血1点,减少血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {		//在线程内部类中重写run方法。，，设置线程
			public void run() {
				int i = 0; 
				while(true) {
					
					System.out.printf("t2线程，第%d次执行：",i);
					i++;
					
					if(gareen.isHealth()){
						System.out.println("血量已经回满了");
						break;
					}
					
					
					gareen.recover();
					System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.start(); 		//线程声明后马上启动线程，
		
		
	}
	
	

}
