package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 * 序列化一个对象
 * @author New year
 *
 *
 *			创建一个Hero对象，设置其名称为garen。 
 *			把该对象序列化到一个文件garen.lol。
 *			然后再通过序列化把该文件转换为一个Hero对象
 *
 *			注：把一个对象序列化有一个前提是：这个对象的类，必须实现了Serializable接口
 */
public class TestStream9_1 {

	public static void main(String[] args) {
		
		//创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;
        
      //准备一个文件用于保存该对象
        File f =new File("f:demo/garen.lol");		//没有创建这个文件
        											//输出的时候依然会建立这个文件

        try(
        		//创建对象输出流
        		FileOutputStream fos = new FileOutputStream(f);
        		ObjectOutputStream oos = new ObjectOutputStream(fos);			//缓存流，数据流，对象流  都要建立在字节流上。。。
        		//创建对象输入流 
        		FileInputStream fis = new FileInputStream(f);
        		ObjectInputStream ois = new ObjectInputStream(fis);
        	){
        		oos.writeObject(h);
        		Hero h2 = (Hero) ois.readObject();
        		System.out.println(h2.name);
        		System.out.println(h2.hp);
        	
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        			//原文中有这个，而我这里只是把另一个类直接加到一个文件中了。
          			//在没有加   Hero h2 = (Hero) ois.readObject();这句代码的时候没有这个异常。
        catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

//这里不能再有public了
 class Hero implements Serializable {
    //表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
 
}