package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JAVA的图形界面下有两组控件，一组是awt,一组是swing。 
 * 一般都是使用swing
 * @author New year
 *
 */
public class TestGUI5_01 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("title");
		f.setSize(400,330);
		f.setLocation(200,200);
		f.setLayout(null);
		
		//标签
		JLabel l = new JLabel("文字");
		//文字颜色
		l.setForeground(Color.red);
		l.setBounds(50,50,280,30);
		
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
