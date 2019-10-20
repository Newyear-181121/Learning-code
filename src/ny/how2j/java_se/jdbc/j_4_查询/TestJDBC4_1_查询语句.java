package jdbc.j_4_查询;

import util.jdbc.ExecuteMySql;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TestJDBC4_1_查询语句 {

    public static void main(String[] args) {
        ExecuteMySql ems = new ExecuteMySql();

        try {
             String sql = "select * from hero";

             // 执行查询语句，并把结果集返回给ResultSet
             ResultSet rs = ems.executeQuery(sql);
             while (rs.next()) {
                 int id = rs.getInt("id");// 可以使用字段名
                 String name = rs.getString(2);// 也可以使用字段的顺序
                 float hp = rs.getFloat("hp");
                 int damage = rs.getInt(4);
                 System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
             }
             // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
             // rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
