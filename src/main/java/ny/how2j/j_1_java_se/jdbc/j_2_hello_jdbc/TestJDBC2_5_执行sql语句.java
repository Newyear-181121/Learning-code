package jdbc.j_2_hello_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 前面的是：1. 初始化驱动
 *          2. 建立链接，有了驱动就得链接数据库嘛。
 *          3. 创建声明，
 *          4. 就可以执行sql语句了。
 *
 *
 *     我去，才晓得可以直接再这里执行键表操作。
 */
public class TestJDBC2_5_执行sql语句 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "root");

            Statement s = c.createStatement();

            // 准备sql语句
            // 注意： 字符串要用单引号'
            /*      建表的sql语句
            CREATE TABLE hero (
                    id int(11) AUTO_INCREMENT,
                    name varchar(30) ,
                    hp float ,
                    damage int(11) ,
                    PRIMARY KEY (id)
            )  DEFAULT CHARSET=utf8;
            */
            /*
            String sql = "CREATE TABLE hero (\n" +
                    "                    id int(11) AUTO_INCREMENT,\n" +
                    "                    name varchar(30) ,\n" +
                    "                    hp float ,\n" +
                    "                    damage int(11) ,\n" +
                    "                    PRIMARY KEY (id)\n" +
                    "            )  DEFAULT CHARSET=utf8;";

            s.execute(sql);
            System.out.println("执行创建表的操作成功");
            */

            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";

            s.execute(sql);

            System.out.println("执行插入语句成功");

        } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

    }

}
