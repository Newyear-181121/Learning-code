package ny.base.IO.file.缓冲流;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

import java.io.*;

/**
 * @auther: NewYear
 * @Date: 2020-11-20 15:16
 * @version: 0.0.1
 * @description: 字符缓冲流
 */
public class 字符缓冲流 {
    public void bufferedReader(String src){
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(src)))){
            String line = null;
            while ((line=reader.readLine()) != null){
                Out.out(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        bufferedReader("D:\\java project\\Learning-code\\README.md");
    }
}
