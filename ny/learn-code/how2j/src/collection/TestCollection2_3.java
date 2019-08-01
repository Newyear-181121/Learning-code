package collection;

import java.util.ArrayList;

/**
 * 获取指定位置的对象
 * @author New year
 *		通过get获取指定位置的对象，如果输入的下标越界，一样会报错
 */
public class TestCollection2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList heros = new ArrayList();
		 
        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero1_1("hero " + i));
        }
        Hero1_1 specialHero = new Hero1_1("special hero");
        heros.add(specialHero);
         
        //获取指定位置的对象
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        System.out.println(heros.get(6));
	}

}
