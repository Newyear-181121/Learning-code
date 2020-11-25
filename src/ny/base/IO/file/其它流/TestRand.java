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
     *  指定第i块 的起始位置，和实际长度。
     * @param i 第index块
     * @param benginPos 起始偏移量
     * @param actualSize 每块文件的实际大小。
     */
    public void split(int i,int benginPos,int actualSize) {
        try (RandomAccessFile raf = new RandomAccessFile(new File("src\\ny\\base\\IO\\file\\TestFileOut.java"),"r");) {
            raf.seek(benginPos);
            byte[] flush = new byte[1024*10];
            int len = -1 ;
            while( (len = raf.read(flush)) != -1 ){
                if(actualSize>len){
                    Out.out(new String(flush,0,len));
                    actualSize -=len;
                }else {
                    Out.out(new String(flush,0,actualSize));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 分块读取
     */
    @Test
    public void test01(){
        File src = new File("src\\ny\\base\\IO\\file\\TestFileOut.java");

        // 文件总大小
        long len = src.length();
        //定义每块的大小
        int blockSize = 1024;
        // 块数
        int size = (int) Math.ceil(len*1.0/blockSize);  //函数作用向上取整。 // len 是int型的时候，除数结果自动四舍五入了。必须要先转成 double型，保留小数。然后使用函数向上取整数。

        int benginPos = 0;
        int actualSize = (int) (blockSize>len?len:blockSize);

        Out.out("文件大小是："+len);
        Out.out("块数",size);
        for(int i = 0 ; i<size; i++){
            benginPos = i*blockSize;
            if (i == size-1 ){
                actualSize = (int)len;  //读取到文件尾部，剩余大小小于 blockSize 时，直接取剩余大小的值。
            }else{
                actualSize = blockSize;
                len -=actualSize;  // 每读取一次就把总长度减掉对应的值。
            }

            System.out.println("第"+i+"次输出起始索引位置是："+ benginPos + "----实际输出快大小：" +actualSize);
            split(i,benginPos,actualSize);
        }
    }
}
