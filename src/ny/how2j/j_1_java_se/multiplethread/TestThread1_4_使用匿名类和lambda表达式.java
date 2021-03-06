package multiplethread;


/**
 * 创建多线程-匿名类
 * @author New year
 *		
 *使用匿名类，继承Thread,重写run方法，直接在run方法中写业务代码
 *匿名类的一个好处是可以很方便的访问外部的局部变量。
 *前提是外部的局部变量需要被声明为final。(JDK7以后就不需要了)
 *
 *  lamdba 表达是推导：@see(ny.base.lambda)包
 */
public class TestThread1_4_使用匿名类和lambda表达式 extends FatherForHero {

	public static void main(String[] args) {

		//匿名类
		Thread t1 = new Thread() {
			public void run() {
				//匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                //但是在JDK7以后，就不是必须加final的了
				while(!teemo.isDead()){		// 如果没死就一直打 。_ 。
					gareen.attackHero(teemo);
				}
			}
		};
		
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				while (!leesin.isDead()) {
					bh.attackHero(leesin);
				}
			}
		};
		t2.start();

	}

}
