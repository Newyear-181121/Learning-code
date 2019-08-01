package file;

import java.io.File;
import java.io.IOException;


/**
 * 文件常用方法2
 * @author New year
 *
 */
public class TestFile1_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("E:储存文件夹/New year/java_demo/LOL.txt");//原来的文件数d:/LOLFolder/skin/garen.ski
		  
        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        f.list();
        System.out.println("这里001:"+f.list());
        
        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[] fs= f.listFiles();
        System.out.println("这里002是："+fs );
  
        // 以字符串形式返回获取所在文件夹
        f.getParent();
        System.out.println("这里003:"+ f.getParent() );
  
        // 以文件形式返回获取所在文件夹
        f.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        f.mkdir();
        System.out.println("这里004"+ f.getParentFile() + " + " +f.mkdir());
  
        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        f.mkdirs();
        System.out.println("这里005:"+f.mkdirs());
        
  
        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        f.createNewFile();
        // 所以创建一个空文件之前，通常都会创建父目录
        f.getParentFile().mkdirs();
        System.out.println("这里006:"+f.createNewFile());
  
        // 列出所有的盘符c: d: e: 等等
        f.listRoots();
        System.out.println("这里001:"+f.list());
  
        // 刪除文件
        f.delete();
        System.out.println("这里001:"+f.list());
  
        // JVM结束的时候，刪除文件，常用于临时文件的删除
        f.deleteOnExit();
  
    
	}

}
