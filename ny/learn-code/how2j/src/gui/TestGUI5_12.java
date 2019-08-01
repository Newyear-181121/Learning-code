package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * 进度条
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
		
		//进度条最大100
		pb.setMaximum(100);
		//当前进度是50
		pb.setValue(40);
		
		pb.setLocation(100, 200);
		
		//显示当前进度
		pb.setStringPainted(true);
		
		
		
		f.add(pb);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
}
