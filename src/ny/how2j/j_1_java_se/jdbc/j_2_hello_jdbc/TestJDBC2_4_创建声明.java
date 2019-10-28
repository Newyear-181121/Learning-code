package jdbc.j_2_hello_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 创建 Statement ： 声明，
 *
 * 我擦，，，用UTF-8 居然可以用中文类名了。
 */
public class TestJDBC2_4_创建声明 {
    /**
     *  1. 初始化了驱动
     *  2. 建立了连接
     * @param args
     */
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "root");

            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
            Statement s = c.createStatement();

            System.out.println("获取 Statement对象： " + s);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}