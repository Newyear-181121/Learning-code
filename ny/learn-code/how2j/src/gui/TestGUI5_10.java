package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 * 密码框
 * @author New year
 * JPasswordField 密码框 
 * 与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
 */
public class TestGUI5_10 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("LOL");
		f.setSize(400,300);
		f.setLocation(200,200);
		
		f.setLayout(new FlowLayout());
		
		JLabel l = new JLabel("密码：");
		// 密码框
		JPasswordField pf = new JPasswordField("");
		pf.setText("控制台虽然会显示，但是文本框里不会显示");
		pf.setPreferredSize(new Dimension(80,30));
		// 与文本框不同，获取密码框里的内容，推荐使用getPassword，该方法会返回一个字符数组，而非字符串
		char[] password = pf.getPassword();
		String p = String.valueOf(password);
		System.out.println(p);
		
		f.add(l);
		f.add(pf);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
		
	}

}
