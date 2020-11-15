package ny.base.IO.file;

import org.junit.Test;

import java.io.*;

/**
 * @auther: NewYear
 * @Date: 2020/11/15 15:11
 * @version: 0.0.1
 * @function: 复制文件
 * @description: TestCopyFile
 */
public class TestCopyFile {
    File fi = null;
    File fo = null;
    InputStream is = null;
    OutputStream os = null;

    public void copy(String srcPath,String destPath){
        fi = new File(srcPath);
        fo = new File(destPath);

        try {
            is = new FileInputStream(fi);
            os = new FileOutputStream(fo);

            byte[] flush = new byte[1024];

            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush);
            }
            os.flush();


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test(){
        copy("C:/Demo/testFileOut-test01.txt","C:/Demo/testCoptFile-test01.txt");
    }
}
