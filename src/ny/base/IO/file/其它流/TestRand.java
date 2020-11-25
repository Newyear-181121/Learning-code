package ny.base.IO.file.其它流;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @auther: NewYear
 * @Date: 2020-11-24 16:04
 * @version: 0.0.1
 * @description: TestRand
 *  随机读取
 */
public class TestRand {

    /**
     * 测试文件偏移读取。
     */
    @Test
    public void test01() {
        try (RandomAccessFile raf = new RandomAccessFile(new File("src\\ny\\base\\IO\\file\\TestFileOut.java"),"r");) {

            raf.seek(10);

            byte[] flush = new byte[1024*10];
            int len = -1 ;
            while( (len = raf.read(flush)) != -1 ){
                Out.out(new String(flush,0,len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
