package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * 事件监听之，鼠标
 * @author New year
 *
 */
public class TestGUI2_03_2  extends JFrame{	//继承了JFrame类，就可以直接只用他的方法，而声明这个类型的对象要导入这个类，这时也可以使用他的方法。	

	/**
	 * 这是什么鬼哦，，版本号？
	 */
	private static final long serialVersionUID = 1L;
	
	
	//设置面板		//我觉得这里应该是给事件监听类声明对象。
	Wdmb wdmb = new Wdmb();		//实例化监听对象
	
	public static void main(String[] args) {
		 //实例化当前类
		TestGUI2_03_2 index = new TestGUI2_03_2();		//实例化的时候回调用他的构造方法
					  									//原文中的类名是这个，懒得改了就这名字吧。	index//				
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("E:/存储文件夹/桌面文件/Java/how2j(学习资料）/how2j（学习代码）/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
		l.setIcon(i);
		l.setBounds(375, 275, i.getIconWidth(), i.getIconHeight());
		
		index.add(l);
		
		l.addMouseMotionListener(new MouseMotionListener(){

			//拖拽
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				
				l.setLocation(x,y);			//拖拽图片的效果不理想
			}

			//移动
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			
		});
		
		
		
		
		index.setVisible(true);
	}
	
	//自动执行						//相当于利用他的构造方法自动执行
	//构造方法
	public TestGUI2_03_2() {	
		
		this.add(wdmb);		//当前窗口对象增加监听对象。
		
		//添加鼠标监听事件								
		this.addMouseListener(wdmb);					//这两个监听都是接口，都是抽象的，没有定义具体的实现，
														//
		//添加鼠标拖拽事件								//
		this.addMouseMotionListener(wdmb);				//具体实现方法都是写在Wdmb的类中了。
		
		
		
		
		this.setSize(500,500);
		this.setLocation(300,200);
		this.setTitle("随便");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
	/**
	 * 把本来这里的大括号改到后面去了，
	 * 把原来的外部的并列的类改成了，内部类。
	 * 
	 * 好像并没有用
	 */

/**
 * 	这是事件监听类。
 * @author New year
 *		这应该是并列类吧，毕竟不直接是内部类
 *	这个类是给上面的类使用的。
 */
class Wdmb extends JPanel implements MouseListener,MouseMotionListener{

  //方法覆盖
    //JPanel自带方法,下面格式是固定的
    //paint 会在三种情况下自动被调用
    //1、启动程序  2、窗口大小发生变化时  3、运行repaint函数时
	
	public void paint(Graphics g){
		//覆盖父类的方法
        super.paint(g);
	}
	
	
	/**
	 * 鼠标事件
	 */

	//鼠标单击
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("鼠标单击点击时的位置是：");
        System.out.println("X坐标："+e.getX());
        System.out.println("X坐标："+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		 //System.out.println("鼠标被按下");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("鼠标被松开");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("鼠标移动到界面中");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		 //System.out.println("鼠标从界面离开");
		
	}
	
	/**
	 * 鼠标拖拽事件
	 */
	
	//鼠标拖拽
	@Override
	public void mouseDragged(MouseEvent e) {
		//System.out.println("鼠标拖拽时候的位置是：");
        //System.out.println("X坐标："+e.getX());
        //System.out.println("X坐标："+e.getY());
	}

	//鼠标移动
	@Override
	public void mouseMoved(MouseEvent e) {	
		//System.out.println("鼠标移动时的位置是：");
        //System.out.println("X坐标："+e.getX());
        //System.out.println("X坐标："+e.getY());
		
	}
	
}

