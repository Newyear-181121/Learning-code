package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 文本框
 * @author New year
 *
 * JTextField 输入框
 * setText 设置文本
 * getText 获取文本
 * JTextField 是单行文本框，如果要输入多行数据，请使用JTextArea
 *
 */
public class TestGUI5_09_JTextField {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("title");
		f.setSize(400,300);
		f.setLocation(200,200);
		
		f.setLayout(new FlowLayout());
		
	//	JLabel lName = new JLabel("账号：");
		//输入框
		JTextField tfName = new JTextField("");
		tfName.setText("请输入账号");
		tfName.setPreferredSize(new Dimension(80,30));
		/*
		JLabel lPassword = new JLabel("密码：");
		//输入框
		JTextField tfPassword = new JTextField("");
		tfPassword.setText("请输入密码");
		tfPassword.setPreferredSize(new Dimension(80,30));
		*/
//		f.add(lName);
		f.add(tfName);
//		f.add(lPassword);
//		f.add(tfPassword);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
//		tfPassword.grabFocus();
		
	}

}
