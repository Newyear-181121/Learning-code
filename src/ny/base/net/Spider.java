package ny.base.net;

import ny.base.常用类.myUtil.Out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 *      爬虫的简单原理
 *
 *          1. 获取URL
 *          2. 下载资源
 *          3. 分析资源
 *          4. 处理资源
 *
 * @auther: NewYear
 * @Date: 2020-12-03 20:30
 * @version: 0.0.1
 * @description: Spider
 */
public class Spider {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com");
        InputStream is =  url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String msg = null;
        while(null!=(msg = br.readLine())){
            Out.out(msg);
        }
    }
}
