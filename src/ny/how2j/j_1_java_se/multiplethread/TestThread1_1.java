package multiplethread;

/**
 * 线程概念
 * @author New year
 *
 *首先要理解进程(Processor)和线程(Thread)的区别 
 *进程：启动一个LOL.exe就叫一个进程。 接着又启动一个DOTA.exe，这叫两个进程。 
 *线程：线程是在进程内部同时做的事情，比如在LOL里，有很多事情要同时做，比如"盖伦” 击杀“提莫”，同时“赏金猎人”又在击杀“盲僧”，这就是由多线程来实现的。 
 *
 *
 *  此处代码演示的是不使用多线程的情况：
 *  	只有在盖伦杀掉提莫后，赏金猎人才开始杀盲僧
 */
public class TestThread1_1 extends FatherForHero {

	public static void main(String[] args) {

		//盖伦攻击提莫		//只要不死一直打
		while(!teemo.isDead()){
			gareen.attackHero(teemo);
		}
		
		//赏金猎人 攻击盲僧
		while(!leesin.isDead()){
			bh.attackHero(leesin);
		}
	}

}
