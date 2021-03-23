package jdbc.j_3_增删改;


import util.jdbc.ExecuteMySql;

import java.sql.SQLException;

/**
 * 增删改就是sql语句不同而已。
 */
public class TestJDBC3_2_删除 {

    public static void main(String[] args) {

        ExecuteMySql s = new ExecuteMySql();
        String sql = "delete from hero where id = 5";
        try {
            s.getS().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}