package ny.base.net;

import ny.base.常用类.myUtil.Out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @auther: NewYear
 * @Date: 2020-12-03 20:57
 * @version: 0.0.1
 * @description: 模拟浏览器
 */
public class 模拟浏览器 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.66 Safari/537.36");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
        String msg = null;
        while(null!=(msg = br.readLine())){
            Out.out(msg);
        }
    }

}
