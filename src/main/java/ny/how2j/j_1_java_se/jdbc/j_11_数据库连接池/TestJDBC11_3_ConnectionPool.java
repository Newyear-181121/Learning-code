package jdbc.j_11_数据库连接池;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *  数据库连接池
 *
 *  TestJDBC11_3_ConnectionPool构造方法和初始化
 *
 *
 * 1. ConnectionPool() 构造方法约定了这个连接池一共有多少连接
 *
 * 2. 在init() 初始化方法中，创建了size条连接。 注意，这里不能使用try-with-resource这种自动关闭连接的方式，因为连接恰恰需要保持不关闭状态，供后续循环使用
 *
 * 3. getConnection， 判断是否为空，如果是空的就wait等待，否则就借用一条连接出去
 *
 * 4. returnConnection， 在使用完毕后，归还这个连接到连接池，并且在归还完毕后，调用notifyAll，通知那些等待的线程，有新的连接可以借用了。
 *
 * 注：连接池设计用到了多线程的wait和notifyAll，这些内容可以在多线程交互章节查阅学习。
 */
public class TestJDBC11_3_ConnectionPool {
    List<Connection> cs = new ArrayList<Connection>();      //线程池容器。

    int size;       //线程数量。

    public TestJDBC11_3_ConnectionPool(int size) {
        this.size = size;
        init();
    }

    /**
     * 初始化方法
     */
    public void init() {

        //这里恰恰不能使用try-with-resource的方式，因为这些连接都需要是"活"的，不要被自动关闭了
        try {
            Class.forName("com.mysql.jdbc.Driver");
            for (int i = 0; i < size; i++) {    //创建对应数量的线程。
                Connection c = DriverManager
                        .getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root", "root");

                cs.add(c);  //把创建的连接对象加到容器中去。

            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 线程安全，，得到数据库连接池中的一个线程。
     * @return  一个数据库连接。
     */
    public synchronized Connection getConnection() {
        while (cs.isEmpty()) {          //判断线程池是否为空。
            try {
                this.wait();        //如果是，就等待。
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        Connection c = cs.remove(0);    //从线程池中移出一个线程，并返回线程对象。//得到线程池中的一个线程。
        return c;
    }

    /**
     * 把传入的连接加到线程池中去。
     * @param c 传入一个连接。
     */
    public synchronized void returnConnection(Connection c) {
        cs.add(c);
        this.notifyAll();
    }
}
