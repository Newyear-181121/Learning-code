package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * ������
 * @author New year
 *
 */
public class TestGUI5_12 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("lol");
		f.setSize(400,300);
		f.setLocation(200,200);
		
		f.setLayout(new FlowLayout());
		
		JProgressBar pb = new JProgressBar();
		
		//���������100
		pb.setMaximum(100);
		//��ǰ������50
		pb.setValue(40);
		
		pb.setLocation(100, 200);
		
		//��ʾ��ǰ����
		pb.setStringPainted(true);
		
		
		
		f.add(pb);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
}
