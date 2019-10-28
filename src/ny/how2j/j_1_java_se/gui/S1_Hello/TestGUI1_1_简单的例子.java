package gui.S1_Hello;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * 图形界面
 * Hello Swing
 * @author New year
 *
 *
 */
public class TestGUI1_1_简单的例子 {

	public static void main(String[] args){
		
		//主窗体
		JFrame f = new JFrame("窗口名");
		
		//设置主窗体大小
		f.setSize(400,300);
		
		//主窗体设置位置
		f.setLocation(200,200);
		
		//主窗体中的组件设置为绝对定位
		f.setLayout(null);
		
		//按钮组件
		JButton b = new JButton("按钮名，可以随意设置,暂时没有功能。");
		
		//同时设置组建的大小和位置
		//设置的是b这个组件。
		b.setBounds(50,50,280,30);
		
		//把按钮加入到主窗体中
		f.add(b);
		
		//关闭窗体的时候，退出程序
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//让窗体变得可见
		f.setVisible(true);//这个方法会对所有的组件进行渲染，所以一定要放在最后面。
		
	}
}
