package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JAVA��ͼ�ν�����������ؼ���һ����awt,һ����swing�� 
 * һ�㶼��ʹ��swing
 * @author New year
 *
 */
public class TestGUI5_01 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("title");
		f.setSize(400,330);
		f.setLocation(200,200);
		f.setLayout(null);
		
		//��ǩ
		JLabel l = new JLabel("����");
		//������ɫ
		l.setForeground(Color.red);
		l.setBounds(50,50,280,30);
		
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
