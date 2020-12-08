package ny.base.net.tcp.服务器聊天室;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 20:55
 * @version: 0.0.1
 * @description: TestClient002
 */
public class TestClient002 {
    public static void main(String[] args) {
        Client c = new Client(9999);
        c.talk();
    }
}
