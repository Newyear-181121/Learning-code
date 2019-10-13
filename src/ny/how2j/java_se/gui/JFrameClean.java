package gui;

import javax.swing.JFrame;

/**
 * 纯净的窗口类
 * @author New year
 *	
 */
public class JFrameClean extends JFrame{

	/**
	 * 
	 * @param f		窗口对象
	 * @param a		窗口大小的长，int
	 * @param b		窗口大小的宽，int
	 * @param c		窗口位置的横坐标，int
	 * @param d		窗口位置的纵坐标，int
	 */
	public   JFrameClean (int a,int b,int c,int d) {		//怎样才能在别的类中使用这些设置？
		
		this.setSize(a,b);					// 主窗体设置大小
		this.setLocation(c,d);				// 主窗体设置位置
		this.setLayout(null);				// 主窗体中的组件设置为绝对定位
	}
}
