package ny;

import java.io.File;

public class ChangeFile {
	
	//ֻҪ����Ŀ¼�Ϳ����ˣ�
    static String filePath = "�ļ�·��";

    static String name;
    static String parentName;
    static String path;
    
    static int num;
    static int numa;
    
    /**
	 * ��ʼ
	 * @param args
	 */
	public static void main(String[] args){
		start(filePath);
		
		
		
	}
	
	/**
	 * �����ļ��еľ���·��
	 * @param path
	 */
	public static void start(String path){
		showFiles(path);
		System.out.println("�ɹ������� " + num + " ���ļ���");
		System.out.println("������" + numa + "���ļ���");
	}
    
	/**
	 * ����
	 */
	private static void showFiles(String filePath){
		File root = new File(filePath);
	    File[] files = root.listFiles();
	    for(File file:files){    
	    
	    	if(file.isDirectory()){
	    		/*
	    		 * �ݹ����
	    		 */
	    		showFiles(file.getAbsolutePath());
	    		numa++;
	    		// filelist.add(file.getAbsolutePath());
	    		changeName(file.getAbsolutePath());
	    		// System.out.println("��ʾ"+filePath+" ��������Ŀ¼�����ļ�  "+file.getAbsolutePath());
	    	}else{
	    		changeName(file.getAbsolutePath());
	    		//System.out.println("��ʾ"+filePath+"         ��������Ŀ¼ "+file.getAbsolutePath());
	    	}   
	     
	     
	    }
	    
	    
	    
	}
	/**
	 * ����
	 * ����ֻ��Ҫ�ѵ�ǰ�ļ�����һ�¾Ϳ�����
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
			System.out.println("�ɹ�");
			num++;
		} else {
			System.out.println("ʧ��");
		}
	}
	
	
}
