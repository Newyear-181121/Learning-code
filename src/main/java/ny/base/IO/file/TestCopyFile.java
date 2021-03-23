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

    public void copy(String srcPath,String destPath){

        try(InputStream is = new FileInputStream(new File(srcPath));
            OutputStream os = new FileOutputStream(new File(destPath)) ) {

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
        }
    }

    @Test
    public void test(){
        copy("C:/Demo/testFileOut-test01.txt","C:/Demo/testCoptFile-test01.txt");
    }
}
