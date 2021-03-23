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


    /**
     *  字节输出流
     */
    @Test
    public void Outfile(){
        File f = new File("C:/Demo/testFileOut-test01.txt");
        try (OutputStream os = new FileOutputStream(f,true);) {       // 没有文件时可以创建文件，没有父文件夹时会抛出异常。
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
        }
    }


    /**
     * 字符输出流
     */
    public void write(String str){
        File f = new File("C:/Demo/testFileOut-test02.txt");

        try(Writer writer = new FileWriter(f)) {
            char[] ch = str.toCharArray();      //使用字符数组
            writer.write(ch);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 字符输出流  测试
     */
    @Test
    public void test02(){
        write("可以使用中文输出试试");
    }


    /**
     * ByteArrayOutputStream
     *  字节数组输出流，
     *      意思就是 把流输出到 一个字节数组中来。
     *      这个流内部维护了一个 32 byte 的数组。
     *
     *      这个流的用处就是保存 文件输入流中的字节内容。
     *
     */
    public ByteArrayOutputStream byteArrayOut(){

        File f = new File(System.getProperty("user.dir")+"/README.md");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // InputStream is;      // 如果要在 try 的括号中声明流，就不能在前面再 声明了。

        try ( InputStream is = new FileInputStream(f)){ // 在括号中声明，是会自动关闭的。
            byte[] flush = new byte[1024*10];
            int len = -1 ;
            while( (len = is.read(flush)) != -1 ){
                baos.write(flush,0,len);    // 写出到字节数组。     也可以写出到文件的，这里写出到自己维护的一个数组中来。
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos;
    }
}
