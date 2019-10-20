package util.jdbc;

import java.sql.*;

/**
 * 执行失去了语句的方法，把驱动初始化，链接建立，创建声明，都提取到这个包里面来了。
 */
public class ExecuteMySql {


    ResultSet rs = null;

    public void execute(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                        "root", "root");
                Statement s = c.createStatement();
        ) {
            s.execute(sql);
            System.out.println("执行sql语句\n" + sql + "\n成功。");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql语句异常。");
        }
    }

    /**
     * 把查询语句加到
     * @param sql
     */
    public ResultSet executeQuery(String sql){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                        "root", "root");
                Statement s = c.createStatement();
        ) {
            rs = s.executeQuery(sql);
            System.out.println("执行sql语句\n" + sql + "\n成功。");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql语句异常。");
        }

        return rs;
    }
}