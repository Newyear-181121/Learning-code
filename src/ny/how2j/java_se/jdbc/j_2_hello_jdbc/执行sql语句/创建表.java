package jdbc.j_2_hello_jdbc.执行sql语句;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 创建表成功一次之后，再执行就会失败了。
 */
public class 创建表 {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "root");

            Statement s = c.createStatement();
            String sql = "CREATE TABLE hero (\n" +
                    "                    id int(11) AUTO_INCREMENT,\n" +
                    "                    name varchar(30) ,\n" +
                    "                    hp float ,\n" +
                    "                    damage int(11) ,\n" +
                    "                    PRIMARY KEY (id)\n" +
                    "            )  DEFAULT CHARSET=utf8;";
            s.execute(sql);

            System.out.println("执行创建数据库表成功。");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
