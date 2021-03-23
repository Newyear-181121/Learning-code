package ny.base.net;

import ny.base.常用类.myUtil.Out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @auther: NewYear
 * @Date: 2020-12-03 20:59
 * @version: 0.0.1
 * @description: Test
 */
public class Test {

    @org.junit.Test
    public void test01() throws IOException {
        URL url = new URL("https://www.zhihu.com/");
        InputStream is =  url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String msg = null;
        while(null!=(msg = br.readLine())){
            Out.out(msg);
        }
    }
}
