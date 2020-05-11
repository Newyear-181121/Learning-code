package collection;

//import charactor.Hero;
//第二次使用隔壁的Hero1_1类，看看有什么不同的效果           还是一样的，只是重写了一个toString方法


/**
 * 	使用数组的局限性
 * @author New year
 *
 */
public class Testcollection1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的局限性
		
		/**
		 * 通长一个类中，都不需要导入此类，可以直接使用
		 */
		Hero1_1  heros[] = new Hero1_1[10];		//这里的数组声明没有调用构造函数
		//声明长度是10的数组
		//不用的数组就浪费了
		//超过10个的数，又放不下
		heros[0] = new Hero1_1("盖伦");
				//放不下要报错
		System.out.println("这一步应该是执行了");
		heros[20] = new Hero1_1("提莫");				//先调用类构造函数     然后引用的过程中出现错误，抛出异常，终止了程序的正常运行。
		System.out.println("这一步应该是没有执行的");
	}

}
 