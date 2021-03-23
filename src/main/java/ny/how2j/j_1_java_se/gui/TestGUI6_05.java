package gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * TabbedPanel
 * @author New year
 *
 */
public class TestGUI6_05 {
	public static void main(String[] args) {
		JFrame f = new JFrame("lol");
		f.setSize(400,300);
		f.setLocation(200,200);
		
		f.setLayout(null);		//窗体布局
		
		JPanel p1 = new JPanel();		//面板		基本面板
		p1.setBounds(50,50,300,60);
		
		p1.setBackground(Color.RED);		//设置背景
		
		p1.setLayout(new FlowLayout());		//设置布局
		
		JButton b1 = new JButton("英雄1");
        JButton b2 = new JButton("英雄2");
        JButton b3 = new JButton("英雄3");
  
        //按钮加入基本面板
        p1.add(b1);		
        p1.add(b2);
        p1.add(b3);
  
        JPanel p2 = new JPanel();		//第二个基本面板
        
        JButton b4 = new JButton("英雄4");
        JButton b5 = new JButton("英雄5");
        JButton b6 = new JButton("英雄6");
  
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        
        p2.setBackground(Color.BLUE);		//设置背景颜色
        p2.setBounds(10,150,300,60);		//设置位置及大小
        
        JTabbedPane tp = new JTabbedPane();			//分页式面板
        tp.add(p1);									//把基本面板加入分页式面板
        tp.add(p2);
        
        // 设置tab的标题			设置标签的标题
        tp.setTitleAt(0, "红色tab");
        tp.setTitleAt(1, "蓝色tab");
        										//这个工具类还是有用的。
        ImageIcon i = new ImageIcon(ImageUtil.getImage("gui_image/j.png"));//这里好像用的是反射的方法
        tp.setIconAt(0, i);		//设置tab的图标
        tp.setIconAt(1, i);
        
        //内容窗格
        f.setContentPane(tp);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setVisible(true);
	}

}
