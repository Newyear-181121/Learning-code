package ny.base.IO.file.缓冲流;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

import java.io.*;

/**
 * @auther: NewYear
 * @Date: 2020-11-20 14:51
 * @version: 0.0.1
 * @description: 字节缓冲流
 */
public class 字节缓冲流 {

    public void bufferedIn(String src){
        try(InputStream is = new BufferedInputStream(new FileInputStream(new File(src)))) {
            byte[] flush = new byte[1024*10];
            int len = -1;
            while((len = is.read(flush)) != -1){
                String  str = new String(flush,0,len);
                Out.out(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void noBufferedIn(String src){
        try(InputStream is = new FileInputStream(new File(src))) {
            byte[] flush = new byte[1024*10];
            int len = -1;
            while((len = is.read(flush)) != -1){
                String  str = new String(flush,0,len);
                Out.out(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        bufferedIn("D:\\java project\\Learning-code\\README.md");
    }
    @Test
    public void testno(){
        noBufferedIn("D:\\java project\\Learning-code\\README.md");
    }

    public void bufferedOut(String dest,String txt) {
        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(new File(dest)))) {
            byte[] flush = txt.getBytes();
            os.write(flush,0,flush.length);
            os.flush();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void noBufferedOut(String dest,String txt) {
        try (OutputStream os = new FileOutputStream(new File(dest))) {
            byte[] flush = txt.getBytes();
            os.write(flush,0,flush.length);
            os.flush();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    @Test
    public void out_buffered(){
        String str = "test";
        bufferedOut("C:/Demo/buffered_out_test03.txt",str);
    }
    @Test
    public void out_no_buffered(){
        String str = "test";
        noBufferedOut("C:/Demo/buffered_out_test03.txt",str);
    }
}