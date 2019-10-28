package jdbc.j_5_预编译Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 和 Statement一样，PreparedStatement也是用来执行sql语句的
 * 与创建Statement不同的是，需要根据sql语句创建PreparedStatement
 * 除此之外，还能够通过设置参数，指定相应的值，而不是Statement那样使用字符串拼接
 *
 * 注： 这是JAVA里唯二的基1的地方，另一个是查询语句中的ResultSet也是基1的。
 */
public class TestJDBC5_1_使用PreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "root");
             // 根据sql语句创建PreparedStatement
             PreparedStatement ps = c.prepareStatement(sql);
        ) {

            // 设置参数
            ps.setString(1, "提莫");
            ps.setFloat(2, 313.0f);
            ps.setInt(3, 50);
            // 执行
            ps.execute();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
/**
 *  2 : PreparedStatement的优点1-参数设置
 *
 *  Statement 需要进行字符串拼接，可读性和维护性比较差
 *
 * String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
 *
 *
 * PreparedStatement 使用参数设置，可读性好，不易犯错
 *
 * String sql = "insert into hero values(null,?,?,?)";
 *
 */