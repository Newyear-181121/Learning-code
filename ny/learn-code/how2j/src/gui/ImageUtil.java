package gui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;



/**
 * ͼƬ���ع����ࡣ
 * @author New year
 *
 *
 * ��Դ����Ϸ�������ġ�
 * 
 * ����ָ����·���ļ���ͼƬ����
 */
public class ImageUtil {
		//��������ý����췽��˽�л���
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
