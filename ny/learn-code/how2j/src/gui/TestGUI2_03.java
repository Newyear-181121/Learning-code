package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ������
 * @author New year
 *
 *MouseListener ��������
 *mouseReleased ����ͷ�
 *mousePressed ��갴��
 *mouseExited ����˳�
 *mouseEntered ������
 *mouseClicked �����
 *�ڱ����У�ʹ��mouseEntered����������ͼƬ��ʱ��ͼƬ���ƶ�λ��
 */
public class TestGUI2_03 {

	public static void main(String[] args) {
		
		final JFrame f = new JFrame("LOL");
		//f.setBounds(0, 0, 0, 0);
		f.setSize(800,600);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("E:/�洢�ļ���/�����ļ�/Java/how2j(ѧϰ���ϣ�/how2j��ѧϰ���룩/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
		l.setIcon(i);	//��ǩ����ΪͼƬ��
		l.setBounds(375,275,i.getIconWidth(),i.getIconHeight());
		
		f.add(l);
		
		
		//��������������ڲ���ĵ��ã�������������������
		
		//l.addMouseListener(new MouseListener() {	//l.�Ļ���ͼƬ����������
		//ǰ��ĳ�f.�ͳ�Ϊ��������������
		f.addMouseListener(new MouseListener() {
			
			//	�ͷ����
			public void mouseReleased(MouseEvent e) {
				
			}
			
			//	�������
			public void mousePressed(MouseEvent e) {
			
			}

			

			// ������
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			// ����˳�
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			// �����ͷ���϶���Ϊ������
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
