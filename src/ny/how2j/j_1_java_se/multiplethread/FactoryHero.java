package multiplethread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: NewYear
 * @Date: 2020/11/30 22:20
 * @version: 0.0.1
 * @function:
 * @description: FactoryHero  创建一个 hero 的生产者。
 */
public class FactoryHero {
    static ArrayList<Hero> list = new ArrayList<>();
    static HashMap<String,Hero> map = new HashMap<>();

    public static List<Hero> getHerosToList(){

        Hero gareen = new Hero("盖伦",616,50);
        list.add(gareen);

        Hero teemo = new Hero("提莫",300,30);
        list.add(teemo);

        Hero bh = new Hero("赏金猎人",500,65);
        list.add(bh);

        Hero leesin = new Hero("盲僧",455,80);
        list.add(leesin);

        return list;
    }

    public static Map<String,Hero> getHerosToMap(){

        Hero gareen = new Hero("盖伦",616,50);
        map.put("盖伦",gareen);

        Hero teemo = new Hero("提莫",300,30);
        map.put("提莫",teemo);

        Hero bh = new Hero("赏金猎人",500,65);
        map.put("赏金猎人",bh);

        Hero leesin = new Hero("盲僧",455,80);
        map.put("盲僧",leesin);

        return map;
    }
}
