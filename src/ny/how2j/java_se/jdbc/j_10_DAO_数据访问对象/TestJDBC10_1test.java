package jdbc.j_10_DAO_数据访问对象;

import org.junit.Test;

/**
 *
 */
public class TestJDBC10_1test {

    @Test
    public void testConnection(){
        DAO dao = new HeroDAO();
        //dao.getConnection();
        // 这个方法实在HeroDAO中写的，所一不能用DAO的接口对象调用这个方法。

        Hero hero = new Hero();
        hero.id = 1;
        hero.name = "小米";
        hero.hp = 2000;
        hero.damage = 300;
        dao.add(hero);
    }
}
