package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * 按钮监听
 * @author New year
 *
 */
public class TestGUI2_01 {
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("窗口标题");
		f.setSize(400, 300);
		f.setLocation(580,200);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
									//这样好像不行		//创建了一个包gui_image用来存放图片
		//ImageIcon i = new ImageIcon("gui_image/shana.png");// set path  //绝对路径      和  包名加文件名
		ImageIcon i = new ImageIcon("E:/存储文件夹/桌面文件/Java/how2j(学习资料）/how2j（学习代码）/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		JButton b = new JButton("隐藏图片");	//按钮名称
		b.setBounds(50,200,100,30);		//按钮大小
		
		JButton b2 = new JButton("显示图片");
		b2.setBounds(180,200,100,30);
		
		//给按钮    增加     监听
		b.addActionListener(new ActionListener(){
			
			//当按钮被点击时，就会触发    ActionEvent 事件
			//actionPerformed   方法就会被执行
			public void actionPerformed(ActionEvent e){
				l.setVisible(false);
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				l.setVisible(true);
				//l.setBounds(100, 50, i.getIconWidth(), i.getIconHeight());//可用
			}
			
		});
		
		f.add(l);
		f.add(b);
		f.add(b2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
