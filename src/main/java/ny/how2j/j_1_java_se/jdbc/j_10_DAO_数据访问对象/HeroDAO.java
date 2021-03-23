package jdbc.j_10_DAO_数据访问对象;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 */
public class HeroDAO implements DAO {

    /*  把驱动的初始化放在了构造方法HeroDAO里：
    *       因为驱动初始化只需要执行一次，所以放在这里更合适，其他方法里也不需要写了，代码更简洁
    *
    */
    public HeroDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("数据库驱动异常。");
        }
    }

    /*
     *  提供了一个getConnection方法返回连接
     *      所有的数据库操作都需要事先拿到一个数据库连接Connection，
     *      以前的做法每个方法里都会写一个，如果要改动密码，那么每个地方都需要修改。
     *      通过这种方式，只需要修改这一个地方就可以了。
     *      代码变得更容易维护，而且也更加简洁。
     */
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root",
                    "root");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接异常。");
        }
        return connection;
    }

    /**
     *
     * @return 数据库中数据的数量
     */
    public int getTotal() {
        int total = 0;
        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "select count(*) from hero";

            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                total = rs.getInt(1);
            }

            System.out.println("total:" + total);

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return total;
    }

    /**
     *  再数据库中加入一条数据。
     * @param hero 空
     */
    public void add(Hero hero) {

        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setString(1, hero.name);
            ps.setFloat(2, hero.hp);
            ps.setInt(3, hero.damage);

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                hero.id = id;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void update(Hero hero) {

        String sql = "update hero set name= ?, hp = ? , damage = ? where id = ?";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setString(1, hero.name);
            ps.setFloat(2, hero.hp);
            ps.setInt(3, hero.damage);
            ps.setInt(4, hero.id);

            ps.execute();

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    /**
     * 根据id删除数据。
     * @param id
     */
    public void delete(int id) {

        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "delete from hero where id = " + id;

            s.execute(sql);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    /**
     * 根据id得到数据。
     * @param id 想要得到的id数
     * @return 对应id的数据
     */
    public Hero get(int id) {
        Hero hero = null;

        try (Connection c = getConnection(); Statement s = c.createStatement();) {

            String sql = "select * from hero where id = " + id;

            ResultSet rs = s.executeQuery(sql);

            if (rs.next()) {
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                hero.id = id;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return hero;
    }

    /**
     *
     * @return 所有的数据
     */
    public List<Hero> list() {
        return list(0, Short.MAX_VALUE);
    }

    /**
     *  得到指定范围的数据
     * @param start  开始的数据
     * @param count
     * @return
     */
    public List<Hero> list(int start, int count) {
        List<Hero> heros = new ArrayList<Hero>();

        String sql = "select * from hero order by id desc limit ?,? ";

        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setInt(1, start);
            ps.setInt(2, count);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Hero hero = new Hero();
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.id = id;
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                heros.add(hero);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return heros;
    }
}
