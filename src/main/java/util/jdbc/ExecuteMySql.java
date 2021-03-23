package util.jdbc;

import java.sql.*;

/**
 * 执行失去了语句的方法，把驱动初始化，链接建立，创建声明，都提取到这个包里面来了。
 */
public class ExecuteMySql {

    private Statement s;

    public Statement getS() {
        return s;
    }

    public void setS(Statement s) {
        this.s = s;
    }

    public ExecuteMySql(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                    "root", "root");
            s = c.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("数据库加载驱动。");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据或者声明异常。");
        }



    }

    /**
     * 把查询语句加到
     * @param sql
     *  查询语句不好弄，查询语句有返回值，如果先关闭掉了查询语句的声明，那么就不能都其结果进行操作了。
     */
    /*
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

     */
}