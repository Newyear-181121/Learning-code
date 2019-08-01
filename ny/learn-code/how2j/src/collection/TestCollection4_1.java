package collection;

import java.util.ArrayList;
import java.util.List;

import character.APHero;
import character.Hero;


/**
 * 泛型 Generic 
 * @author New year
 *
 *不指定泛型的容器，可以存放任何类型的元素
 *指定了泛型的容器，只能存放指定类型的元素以及其子类 
 *
 *
 *泛型的简写 
 *
 *为了不使编译器出现警告，需要前后都使用泛型，像这样：
 * 
 *List<Hero> genericheros = new ArrayList<Hero>();
 *
 *
 *不过JDK7提供了一个可以略微减少代码量的泛型简写方式
 *
 *List<Hero> genericheros2 = new ArrayList<>();
 *
 *
 *后面的泛型可以用<>来代替，聊胜于无吧 
 */
public class TestCollection4_1 {

	public static void main(String[] args) {

		//对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
		List heros = new ArrayList();
		
		heros.add(new Hero("盖伦"));
		
		//本来用于存放英雄的容器，现在也可以存放物品了
		heros.add(new Item4_1("冰杖"));
		
		//对象转型会出现问题
		Hero h1 = (Hero) heros.get(0);
		//尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
		Hero h2 = (Hero) heros.get(1);
		
		//引入泛型Generic
        //声明容器的时候，就指定了这种容器，只能放Hero，放其他的就会出错
		List<Hero> genericheros = new ArrayList<Hero>();
		genericheros.add(new Hero());
		//如果不是Hero类型，根本就放不进去
        //genericheros.add((Hero1_1) new Item4_1("冰杖"));		//强制转型也没有用。
		
		//除此之外，还能存放Hero的子类
		genericheros.add(new APHero());	//一开始add出错，是应为APHero没有继承Hero类。
		
		//并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
		Hero h = genericheros.get(0);
		
		
		}

}
