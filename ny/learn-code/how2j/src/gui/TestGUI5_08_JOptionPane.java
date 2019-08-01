package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 对话框
 * 
 * @author New year
 *
 *
 *JOptionPane.showConfirmDialog(f, "是否 使用外挂 ？");
 *表示询问，第一个参数是该对话框以哪个组件对齐
 *JOptionPane.showInputDialog(f, "请输入yes，表明使用外挂后果自负");
 *接受用户的输入
 *JOptionPane.showMessageDialog(f, "你使用外挂被抓住！ 罚拣肥皂3次！");
 *显示消息
 */
public class TestGUI5_08_JOptionPane {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("name");
		f.setSize(400,300);
		f.setLocation(580,240);
		f.setLayout(null);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//加一个按钮，加上监听
		JButton b = new JButton("弹出对话框");
		b.setBounds(50,50,100,30);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/**
				 * 这后面的都是对话框了。
				 */
				int option = JOptionPane.showConfirmDialog(f,"是否点击确认");
				
				if (JOptionPane.OK_OPTION == option) {
				String answer = JOptionPane.showInputDialog(f,"pleas input yes");
					if ("yes".equals(answer))
						JOptionPane.showMessageDialog(f,"yes");
					else 
						JOptionPane.showMessageDialog(f,"no");
				}
				
				
			}
			
			
		});
		
		
		
		/**
		 * 这后面的都是对话框了。
		 */
		//原来在这里的对话框程序改到键盘监听里面去了。
		//如果对话框程序在这里的话，打开程序就会自动弹出对话框。
		
		
		f.add(b);
		
		
		f.setVisible(true);
		
	}

}
