package ny.base.net.tcp.服务器聊天室;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-12-07 21:14
 * @version: 0.0.1
 * @description: TestService
 */
public class TestService {
    public static void main(String[] args) {
        Service s = new Service(9999);
        s.run();
        int port = s.getsocket().getLocalPort();
        Out.out(port);
    }
}
