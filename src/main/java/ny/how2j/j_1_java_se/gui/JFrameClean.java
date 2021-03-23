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
	 * @param length		窗口大小的长，int
	 * @param width		窗口大小的宽，int
	 * @param x		窗口位置的横坐标，int
	 * @param y		窗口位置的纵坐标，int
	 */
	public JFrameClean (int length,int width,int x,int y) {		//怎样才能在别的类中使用这些设置？
		
		this.setSize(length,width);					// 主窗体设置大小
		this.setLocation(x,y);				// 主窗体设置位置
		this.setLayout(null);				// 主窗体中的组件设置为绝对定位
	}

	public JFrameClean(){
		this(600,500,300,100);
	}
}
