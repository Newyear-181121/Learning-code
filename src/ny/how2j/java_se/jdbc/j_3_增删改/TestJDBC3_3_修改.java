package jdbc.j_3_增删改;

import util.jdbc.ExecuteMySql;

import java.sql.SQLException;

/**
 * 修改就是更新
 */
public class TestJDBC3_3_修改 {
    public static void main(String[] args) {
        ExecuteMySql ems = new ExecuteMySql();
        String sql = "update hero set name = 'name 5' where id = 3";
        try {
            ems.getS().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
