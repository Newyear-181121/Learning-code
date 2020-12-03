package ny.base.net;

import ny.base.常用类.myUtil.Out;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @auther: NewYear
 * @Date: 2020-12-03 16:23
 * @version: 0.0.1
 * @description: TestIP
 */
public class TestIP {

    static InetAddress addr = null;

    public static void main(String[] args) throws UnknownHostException {


        addr = InetAddress.getLocalHost();
        Out.out("本机ip地址是：",addr.getHostAddress());
        Out.out("本机名是：",addr.getHostName());


        addr = InetAddress.getByName("www.163.com");
        Out.out("ip地址是：",addr.getHostAddress());
        Out.out("主机名是：",addr.getHostName());
    }
}
