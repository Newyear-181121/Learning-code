package ny.base.IO.file;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @auther: NewYear
 * @Date: 2020-11-11 21:16
 * @version: 0.0.1
 * @description: TestIO
 *
 *  io 使用的标准步骤：
 *      1. 选择源
 *      2. 选择流
 *      3. 读写操作   增加分段读取（缓存）
 *      4. 释放资源
 */
public class TestFileIn {

    private File file =  new File(System.getProperty("user.dir")+"/" + ".gitignore" );  // 1. 声明数据源


    /**
     * 只要修改传入参数，就可以改成可以使用的方法。
     */
    @Test
    public void test(){
        try (FileInputStream infile = new FileInputStream(file);) {


            byte[] flush = new byte[1024*10]; // 缓冲容器
            int len = -1;

            while ((len = infile.read(flush)) != -1) {
                String str = new String(flush,0,len);   // 从字符串数组 声明 字符串，从 flush 的 0 开始，长度是流的长度。
                Out.out(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Out.out("声明流 异常");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
