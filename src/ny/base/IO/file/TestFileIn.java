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

    private File file;  // 1. 声明数据源
    private FileInputStream infile;



    public TestFileIn(){
        file = new File(System.getProperty("user.dir")+"/" + ".gitignore" );  // 2. 声明 操作的数据流
    }


    @Test
    public void test(){
        try {
            infile = new FileInputStream(file);

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
        } finally {
            if (infile != null){
                try {
                    infile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }




}
