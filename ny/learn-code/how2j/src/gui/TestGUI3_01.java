package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 窗体型容器
 * @author New year
 *java的图形界面中，容器是用来存放 按钮，输入框等组件的。 
 *
 *窗体型容器有两个，一个是JFrame,一个是JDialog
 *
 *JFrame是最常用的窗体型容器，默认情况下，在右上角有最大化最小化按钮
 */
public class TestGUI3_01 {
	static boolean bu = true;
	

	public static void main(String[] args){
		
		
		//普通的窗体，带最大和最小化按钮
		JFrame f = new JFrame("name");
		
		f.setSize(400,400);
		f.setLocation(500,200);
		f.setLayout(null);
		
		JButton b = new JButton("隐藏图片");		//按钮
		
		//设置按钮的样式
		b.setBounds(150,200,100,30);
		
		JLabel l = new JLabel();				//标签
		
		ImageIcon i = new ImageIcon("E:/New year/Pictures/like/348706.jpg");			//图片		//在括号中设置图片的path
		
		l.setIcon(i);		//把标签设置为图片
		
		//设置标签的大小
		l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
		
		//给按钮增加监听
		b.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				if(bu) {
					l.setVisible(false);
					bu = false;
					b.setText("显示图片");
				} else {
					b.setText("隐藏图片");
					l.setVisible(true);
					bu = true;
				}
			}
		});
		
		f.add(l);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}
}
