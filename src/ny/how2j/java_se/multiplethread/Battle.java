package multiplethread;


/**
 * 		for 1_3   
 * @author New year
 *
 *������Battle��ʵ��Runnable�ӿ�
 *������ʱ�����ȴ���һ��Battle����Ȼ���ٸ��ݸ�battle���󴴽�һ���̶߳��󣬲�����
 *
 *Battle battle1 = new Battle(gareen,teemo);
 *new Thread(battle1).start();
 *
 *
 *battle1 ����ʵ����Runnable�ӿڣ�������run����������ֱ�ӵ���run����������������һ���µ��̡߳�
 *���룬����һ���̶߳����start()�������Ż�����һ���µ��̡߳�
 *���ԣ��ڴ���Thread�����ʱ�򣬰�battle1��Ϊ���췽���Ĳ������ݽ�ȥ������߳�������ʱ�򣬾ͻ�ȥִ��battle1.run()�����ˡ�
 */
public class Battle  implements Runnable{
	
	private Hero h1;
	private Hero h2;
	
	public Battle(Hero h1,Hero h2) {
		this.h1 = h1;
		this.h2 = h2;
	}
	
	public void run(){
		while (!h2.isDead()){
			h1.attackHero(h2);
		}
	}
	
	

}
