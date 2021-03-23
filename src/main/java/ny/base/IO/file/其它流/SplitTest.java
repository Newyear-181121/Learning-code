package ny.base.IO.file.其它流;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @auther: NewYear
 * @Date: 2020-11-25 15:57
 * @version: 0.0.1
 * @description: SplitTest  分隔文件，封装。
 */
public class SplitTest {

    private File src;
    private File destDir;
    private long len;
    private int blockSize ;
    private int size;

    /* 构造 */
    public SplitTest(String src, String destDir,int blockSize) {
        this.src = new File(src);
        this.destDir = new File(destDir);
        this.blockSize = blockSize;
        init();
    }

    private void init(){
        len = src.length();
        size = (int) Math.ceil(len*1.0/blockSize);
    }


    public void split(int benginPos){
        int actualSize = (int) (blockSize>len?len:blockSize);
        for(int i = 0 ; i<size; i++){
            benginPos = i*blockSize;
            if (i == size-1 ){
                actualSize = (int)len;  //读取到文件尾部，剩余大小小于 blockSize 时，直接取剩余大小的值。
            }else{
                actualSize = blockSize;
                len -=actualSize;  // 每读取一次就把总长度减掉对应的值。
            }
            splitdetail(i,benginPos,actualSize);
        }
    }

    private void splitdetail(int i,int benginPos,int actualSize){
        try (RandomAccessFile raf = new RandomAccessFile(src,"r");
             RandomAccessFile raf2 = new RandomAccessFile(destDir.getName()+"/"+i+"-"+src.getName(),"rw")) {
            raf.seek(benginPos);
            byte[] flush = new byte[1024*10];
            int len = -1 ;
            while( (len = raf.read(flush)) != -1 ){
                if(actualSize>len){
                    raf2.write(flush,0,len);
                    actualSize -=len;
                }else {
                    raf2.write(flush,0,actualSize);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SplitTest st = new SplitTest("src/ny/base/IO/file/其它流/SplitTest.java","src/out",1024);
        st.split(0);
    }
}
