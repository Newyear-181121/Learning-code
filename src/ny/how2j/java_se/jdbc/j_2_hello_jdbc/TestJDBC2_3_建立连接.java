package jdbc.j_2_hello_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 初始化驱动之后，就是与数据库建立链接。
 */
public class TestJDBC2_3_建立连接 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            // 建立与数据库的Connection：连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)/或者 localhost：本地主机
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 root

            Connection c =  DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "root");

            System.out.println("连接成功，获取连接对象： " + c);

        } catch (ClassNotFoundException e) {
            System.out.println("没有初始化驱动类");
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
