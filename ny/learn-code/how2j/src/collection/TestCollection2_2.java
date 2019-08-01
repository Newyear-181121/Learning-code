package collection;

import java.util.ArrayList;

/**
 *   判断是否存在
 *   	通过方法contains 判断一个对象是否在容器中
 *   	判断标准： 是否是同一个对象，而不是name是否相同
 * @author New year
 *
 */
public class TestCollection2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList heros = new ArrayList();
		
		//初始化5个对象
		for ( int i = 0; i < 5 ; i++) {
			heros.add(new Hero1_1("hero" + i));		//add 括号中的都是添加内容          添加了一个Hero1_1对象
			
		}
		Hero1_1 specialHero = new Hero1_1("special hero");
		heros.add(specialHero);
		
		System.out.println(heros);
		//判断一个对象是否在容器中
		//判断标准： 是否是同一个对象，而不是name是否相同
		System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
		System.out.println(heros.contains(new Hero1_1("hero 1")));		//这里查找的contains中的内容是新的对象，是new的
		//如果我加一句查找hero 1 的语句返回值应该是true。
		//System.out.println(heros.contains(hero1));		初始化时没有给ArrayList中的hero1添加对象引用，所以这里这个hero1 ， JVM不能确定他是谁
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(heros.contains(specialHero));		//这里一开始就给specialHero添加了对象引用，所以添加进ArrayList的specialHero有名字，可以通过名字确定它是否在容器ArrayList中
		
		
		
	}

}
