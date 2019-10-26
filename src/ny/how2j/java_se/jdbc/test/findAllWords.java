package jdbc.test;

import util.jdbc.ExecuteMySql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class findAllWords {
    public static void main(String[] args) {
        ExecuteMySql executeMySql = new ExecuteMySql();//
        String sql = "select * from hero";
        try {
            ResultSet rs = executeMySql.getS().executeQuery(sql);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
