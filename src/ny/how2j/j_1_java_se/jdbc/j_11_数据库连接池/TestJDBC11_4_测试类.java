package jdbc.j_11_数据库连接池;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC11_4_测试类 {

    public static void main(String[] args) {
        TestJDBC11_3_ConnectionPool cp = new TestJDBC11_3_ConnectionPool(3);//线程池中的线程数为3
        for (int i = 0; i < 100; i++) {
            new WorkingThread("working thread" + i, cp).start();
        }

    }
}

/**
 * 自定义的线程类。
 */
class WorkingThread extends Thread {
    private TestJDBC11_3_ConnectionPool cp;

    /**
     * 声明线程的名称。传入线程池。
     * @param name  线程名
     * @param cp    线程池
     */
    public WorkingThread(String name, TestJDBC11_3_ConnectionPool cp) {
        super(name);
        this.cp = cp;
    }

    /**
     *
     */
    public void run() {
        Connection c = cp.getConnection();
        System.out.println(this.getName()+ ":\t 获取了一根连接，并开始工作"  );
        try (Statement st = c.createStatement()){

            //模拟时耗１秒的数据库ＳＱＬ语句
            Thread.sleep(1000);
            st.execute("select * from hero");

        } catch (SQLException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        cp.returnConnection(c);
        System.out.println("返还了对应的线程。");
    }
}
