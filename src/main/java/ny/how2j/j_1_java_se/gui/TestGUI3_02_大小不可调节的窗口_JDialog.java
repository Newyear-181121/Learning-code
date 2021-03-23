package gui;

import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * JDialog也是窗体型容器，右上角没有最大和最小化按钮
 * @author New year
 *
 */
public class TestGUI3_02_大小不可调节的窗口_JDialog {
	
	public static void main(String[] args) {
		
		//普通的窗体，带最大和最小化按钮
		JDialog d = new JDialog();
		d.setTitle("窗口");
		d.setSize(400,300);
		d.setLocation(200, 200);
		d.setLayout(null);
		JButton b = new JButton("按键");
		b.setBounds(50,50,280,30);
		
		d.add(b);
		
		d.setVisible(true);
	}

}
