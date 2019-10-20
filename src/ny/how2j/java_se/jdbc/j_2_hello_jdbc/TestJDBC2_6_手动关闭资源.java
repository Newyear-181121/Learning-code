package jdbc.j_2_hello_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2_6_手动关闭资源 {

        public static void main(String[] args) {

            Connection c = null;
            Statement s = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");

                c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root",
                        "root");

                s = c.createStatement();

                String sql = "insert into hero values(null," + "'盖伦'" + "," + 600.0f + "," + 50 + ")";

                s.execute(sql);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
                // 先关闭Statement
                if (s != null)
                    try {
                        s.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                // 后关闭Connection
                if (c != null)  //先判断，是不是还有，没有了就不用关了。
                    try {
                        c.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

            }

        }
}
