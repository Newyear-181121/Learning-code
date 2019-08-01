package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ������
 * @author New year
 *MouseAdapter ������������
 *һ��˵����д��������ʱ�򣬻�ʵ��MouseListener��
 *����MouseListener�����кܶ෽��ʵ���϶�û���õ�������mouseReleased ��mousePressed��mouseExited�ȵȡ�
 *���ʱ��Ϳ���ʹ�� ��������������MouseAdapter ֻ��Ҫ��д��Ҫ�ķ������ɡ�
 */
public class TestGUI2_04 {
	public static void main(String[] args) {
		  
        final JFrame f = new JFrame("LoL");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
  
        final JLabel l = new JLabel("");
  
        ImageIcon i = new ImageIcon("E:/�洢�ļ���/�����ļ�/Java/how2j(ѧϰ���ϣ�/how2j��ѧϰ���룩/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
        l.setIcon(i);
        l.setBounds(375, 275, i.getIconWidth(), i.getIconHeight());
  
        f.add(l);
  
        // MouseAdapter ��������ֻ��Ҫ��д�õ��ķ�����û���õ��ľͲ���д��
        l.addMouseMotionListener(new MouseAdapter() {
  
            // ֻ��mouseEntered�õ���
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
