package gui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;



/**
 * 图片加载工具类。
 * @author New year
 *
 *
 * 来源，游戏类中来的。
 * 
 * 返回指定的路径文件的图片对象
 */
public class ImageUtil {
		//工具类最好将构造方法私有化。
		private ImageUtil(){
			
		}

		public static Image getImage(String path){
			BufferedImage bi = null;
			try{
				java.net.URL u = ImageUtil.class.getClassLoader().getResource(path);
				bi = ImageIO.read(u);
			}catch(IOException e){
				e.printStackTrace();
			}
			return bi;
		}
}
