package ny.base.IO.file;

import org.junit.Test;
import util.Out;

import java.io.*;

/**
 * @auther: NewYear
 * @Date: 2020/11/15 14:27
 * @version: 0.0.1
 * @function:
 * @description: TestFileOut
 *      1. 创建源，
 *      2. 选择流
 *      3. 操作
 *      4. 释放资源
 */
public class TestFileOut {

    File f =null ;
    OutputStream os = null ;

    @Test
    public void Outfile(){
        File f = new File("C:/Demo/testFileOut-test01.txt");
        try {
            os = new FileOutputStream(f,true);       // 没有文件时可以创建文件，没有父文件夹时会抛出异常。
            /**
             * 声明时，不带Boolean 值时 默认时 false  ， true 表示追加 字符串到文件。
             */

            //    准备 输出的字符，转化相应的格式。
            String str = "test out file stream\r\n";
            byte[] bytes = str.getBytes();
            os.write(bytes,0,bytes.length);

            os.flush();                         // 刷新

        } catch (FileNotFoundException e) {
            Out.out("可能时没有这个文件夹，因为他不能自动创建文件夹。");
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
