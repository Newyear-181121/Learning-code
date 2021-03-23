package util;

import java.io.File;

public class ChangeFile {
	
	//只要设置目录就可以了，
    static String filePath = "文件路径";

    static String name;
    static String parentName;
    static String path;
    
    static int num;
    static int numa;
    
    /**
	 * 开始
	 * @param args
	 */
	public static void main(String[] args){
		start(filePath);
		
		
		
	}
	
	/**
	 * 输入文件夹的绝对路径
	 * @param path
	 */
	public static void start(String path){
		showFiles(path);
		System.out.println("成功更改了 " + num + " 个文件。");
		System.out.println("遍历了" + numa + "个文件夹");
	}
    
	/**
	 * 遍历
	 */
	private static void showFiles(String filePath){
		File root = new File(filePath);
	    File[] files = root.listFiles();
	    for(File file:files){    
	    
	    	if(file.isDirectory()){
	    		/*
	    		 * 递归调用
	    		 */
	    		showFiles(file.getAbsolutePath());
	    		numa++;
	    		// filelist.add(file.getAbsolutePath());
	    		changeName(file.getAbsolutePath());
	    		// System.out.println("显示"+filePath+" 下所有子目录及其文件  "+file.getAbsolutePath());
	    	}else{
	    		changeName(file.getAbsolutePath());
	    		//System.out.println("显示"+filePath+"         下所有子目录 "+file.getAbsolutePath());
	    	}   
	     
	     
	    }
	    
	    
	    
	}
	/**
	 * 更改
	 * 这里只需要把单前文件名改一下就可以了
	 */
	private static void changeName(String filePath){
		
		File file = new File(filePath);
		name = file.getName().toLowerCase();		
		parentName = file.getParent();		
		path = parentName + "\\" + name;

		boolean ok = file.renameTo(new File(path));
		ok(ok);
	}
	private static void ok(boolean b){
		if(b){
			System.out.println("成功");
			num++;
		} else {
			System.out.println("失败");
		}
	}
	
	
}
