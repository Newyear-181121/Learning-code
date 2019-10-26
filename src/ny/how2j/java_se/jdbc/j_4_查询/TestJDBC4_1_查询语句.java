package jdbc.j_4_查询;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *  executeQuery 执行SQL查询语句
 *
 *  查询语句和其他增删改，有区别，
 *      查询语句有返回值，而增删改语句没有返回值。
 */
public class TestJDBC4_1_查询语句 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "root"); Statement s = c.createStatement();) {

            String sql = "select * from hero";

            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");// 可以使用字段名
                String name = rs.getString(2);// 也可以使用字段的顺序
                float hp = rs.getFloat("hp");//字段名
                int damage = rs.getInt(4);//字段顺序
                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);//跟c语言一样了。
            }
            // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
            // rs.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
