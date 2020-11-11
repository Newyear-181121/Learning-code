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
 *      3. 读写操作
 *      4. 释放资源
 */
public class TestIO {

    private File file;  // 1. 声明数据源
    private FileInputStream infile;



    public TestIO(){
        file = new File(System.getProperty("user.dir")+"/" + ".gitignore" );  // 2. 声明 操作的数据流
    }


    @Test
    public void test(){
        try {
            infile = new FileInputStream(file);

            int temp;
            while (true) {

                if ((temp = infile.read()) != -1) {
                    Out.out((char)temp);
                }

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
