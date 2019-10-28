package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 鼠标监听
 * @author New year
 *
 *MouseListener 鼠标监听器
 *mouseReleased 鼠标释放
 *mousePressed 鼠标按下
 *mouseExited 鼠标退出
 *mouseEntered 鼠标进入
 *mouseClicked 鼠标点击
 *在本例中，使用mouseEntered，当鼠标进入图片的时候，图片就移动位置
 */
public class TestGUI2_3_鼠标监听 {

	public static void main(String[] args) {
		
		final JFrame f = new JFrame("LOL");
		//f.setBounds(0, 0, 0, 0);
		f.setSize(800,600);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("../gui_image/shana.png");
		l.setIcon(i);	//标签设置为图片。
		l.setBounds(375,275,i.getIconWidth(),i.getIconHeight());
		
		f.add(l);
		
		
		//这里好像是匿名内部类的调用，给对象增加鼠标监听。
		
		//l.addMouseListener(new MouseListener() {	//l.的话是图片增加鼠标监听
		//前面改成f.就成为窗口增加鼠标监听
		f.addMouseListener(new MouseListener() {
			
			//	释放鼠标
			public void mouseReleased(MouseEvent e) {
				
			}
			
			//	按下鼠标
			public void mousePressed(MouseEvent e) {
			
			}

			

			// 鼠标进入
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			// 鼠标退出
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			// 按下释放组合动作为点击鼠标
			@Override
			public void mouseClicked(MouseEvent e) {
				Random r = new Random();
				  
                int x = r.nextInt(f.getWidth() - l.getWidth());
                int y = r.nextInt(f.getHeight() - l.getHeight());
  
                l.setLocation(x, y);
			}
			
			
			
			
		});

		
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
