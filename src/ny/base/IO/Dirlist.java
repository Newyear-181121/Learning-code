package ny.base.IO;

import ny.base.常用类.myUtil.Out;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @auther: NewYear
 * @Date: 2020-10-09 14:08
 * @version: 0.0.1
 * @description: Dirlist
 */
public class Dirlist {

    /**
     * 输出当前路径下的所有文件或目录
     * @param args
     */
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0 ){
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]) );
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        Out.out("打印当前路径下的所有文件及文件夹名称：");
        for (String dirItem : list){
            System.out.println(dirItem);
        }
    }

}

class DirFilter implements FilenameFilter {

    private Pattern pattern;

    public DirFilter(String regex){
        pattern =Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
