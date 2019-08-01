package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 适配器
 * @author New year
 *MouseAdapter 鼠标监听适配器
 *一般说来在写监听器的时候，会实现MouseListener。
 *但是MouseListener里面有很多方法实际上都没有用到，比如mouseReleased ，mousePressed，mouseExited等等。
 *这个时候就可以使用 鼠标监听适配器，MouseAdapter 只需要重写必要的方法即可。
 */
public class TestGUI2_04 {
	public static void main(String[] args) {
		  
        final JFrame f = new JFrame("LoL");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
  
        final JLabel l = new JLabel("");
  
        ImageIcon i = new ImageIcon("E:/存储文件夹/桌面文件/Java/how2j(学习资料）/how2j（学习代码）/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
        l.setIcon(i);
        l.setBounds(375, 275, i.getIconWidth(), i.getIconHeight());
  
        f.add(l);
  
        // MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了
        l.addMouseMotionListener(new MouseAdapter() {
  
            // 只有mouseEntered用到了
            public void mouseDragged(MouseEvent e) {
  
               
  
                int x = e.getX();
                
                int y = e.getY(); 
  
                l.setLocation(x, y);
  
            }
        });
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }

}
