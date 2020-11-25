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

            int benginPos = 2;      // 起始位置的偏移量。
            int actualSize = 1024;      // 实际要读取的字符块的大小

            raf.seek(benginPos);

            byte[] flush = new byte[1024*10];
            int len = -1 ;
            while( (len = raf.read(flush)) != -1 ){

                // 如果需要的大小，大于本次读取的大小，
                if(actualSize>len){
                    Out.out(new String(flush,0,len));   //输出这次读取的所有长度
                    actualSize -=len;
                }else {
                    Out.out(new String(flush,0,actualSize));//输出实际需要的大小。
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
