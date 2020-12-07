package ny.base.net.tcp.talk;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 16:55
 * @version: 0.0.1
 * @description: TestClient002
 */
public class TestClient002 {

    public static void main(String[] args) {
        TestClient c = new TestClient();
        c.test04();
    }

    /**
     * 这样做的多线程好像有顶问题。
     */
    public void test04(){
        Client client = new Client(9996);

        Thread tr = new Thread(() -> {
            client.sendOnConsole();
        });
        Thread ts = new Thread(() -> {
            client.receiveOnConsole();
        });

        tr.start();
        ts.start();
    }
}
