package jdbc.j_3_增删改;

import util.jdbc.ExecuteMySql;

public class TestJDBC3_1_增加 {

    public static void main(String[] args) {

        ExecuteMySql s = new ExecuteMySql();

        String sql = "insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";
        s.execute(sql);


    }
}
