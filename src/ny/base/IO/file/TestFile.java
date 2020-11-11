package ny.base.IO.file;

import ny.base.常用类.myUtil.Out;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Date;

/**
 * @auther: NewYear
 * @Date: 2020-10-14 19:37
 * @version: 0.0.1
 * @description: TestFile
 *          File 中方法 分类
 *              文件路径
 *              文件状态
 *
 */
public class TestFile {

    String current; //当前项目绝对路径。

    File f ;



    public TestFile(){
        current = System.getProperty("user.dir");
        f = new File(current);
    }
    /**
     * 输出当前项目绝对路径。
     */
    private void outDir() {
        System.out.println("当前文件夹路径是："+current);
    }

    /**
     * file 类常用方法测试。
     */
    public void test1()  {
        outDir();
        Out.out("文件是否存在：",f.exists());
        Out.out("File是否是目录：",f.isDirectory());
        Out.out("File是否是文件：",f.isFile());
        Out.out("File最后修改时间：",new Date(f.lastModified()));
        Out.out("File(文件）的大小：",f.length());
        Out.out("File的文件名：",f.getName());
        Out.out("File的目录路径:",f.getPath());
        Out.out("File的绝对路径是：",f.getAbsolutePath());

        try {
            Out.out("File的标准路径是：",f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    /**
     *
     * @param file
     * @param level 临时
     * @param max  最大层数
     */
    public void printFiles(File file,int level,int max){
        if(level>= max && max != 0){
            return;
        }
        for (int i = 0 ; i<level;i++){
            System.out.print("—");
        }
        System.out.println(file.getName());
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File temp:files){
                printFiles(temp,level+1,max);   //递归调用。
            }
        }
    }

    /**
     * 打印 文件夹 中所有的文件和子文件
     * @param file
     */
    public void printFiles(File file,int level){
        printFiles(file,level,0);
    }

    public void printFiles(File file){
        printFiles(file,0,0);
    }


    /**
     * 测试 遍历子文件夹
     */
    private void test2() {
        printFiles(f,0,3);
    }

    /**
     * 添加注解后可以 单独启动测试用例。
     *
     *  test  list();
     */
    @Test
    public void test03(){
        String[] list = f.list();
        for (String l : list){
            Out.out(l);
        }
    }

    /**
     * 列出 文件系统的 磁盘根目录
     */
    @Test
    public void listRoot(){
        File[] files = f.listRoots();
        for ( File f: files ) {
            Out.out(f);
        }
    }

    @Test
    public void list(){
        File[] files = f.listFiles();
        for ( File f: files ) {
            Out.out(f);
        }
    }


    public static void main(String[] args)  {
        TestFile tf = new TestFile();


        tf.test1();

        tf.test2();

        //tf.test03();
    }
}
