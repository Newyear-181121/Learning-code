package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * 当一个对话框被设置为模态的时候，其背后的父窗体，是不能被激活的，除非该对话框被关闭
 * @author New year
 *
 */
public class TestGUI3_03 {

	public static void main(String[] args) {
		JFrame f = new JFrame("外部窗体");
		f.setSize(800,600);
		f.setLocation(100,100);
		f.setLayout(null);
		
		JButton b1 = new JButton("弹出窗口");
		b1.setBounds(60,50,280,30);
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// 根据外部窗体实例化JDialog
				JDialog d = new JDialog(f);
				// 设置为模态
				d.setModal(true);
				
				d.setTitle("模态对话框");
				d.setSize(400,300);
				d.setLocation(200,200);
				d.setLayout(null);
				JButton b = new JButton("按钮");
				b.setBounds(50,50,280,30);
				d.add(b);
				d.setVisible(true);
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	
		
	}
}
