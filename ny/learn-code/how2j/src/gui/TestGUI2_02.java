package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * 键盘监听
 * @author New year
 *键盘监听器： KeyListener
 *keyPressed 代表 键被按下
 *keyReleased 代表 键被弹起
 *keyTyped 代表 一个按下弹起的组合动作
 *KeyEvent.getKeyCode() 可以获取当前点下了哪个键
 */
public class TestGUI2_02 {
	public static void main(String[] args) {
	
	JFrame f = new JFrame("窗口标题");//如果没有加主函数入口的那一句，后面三行都会出现语法错误，都显示在标点符号上。
	f.setSize(400,300);
	f.setLocation(580,200);
	f.setLayout(null);
	
	boolean flag = false;
	
	final JLabel l = new JLabel();
	
	ImageIcon i = new ImageIcon("E:/存储文件夹/桌面文件/Java/how2j(学习资料）/how2j（学习代码）/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
	l.setIcon(i);
	l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
	//if(i==null)		//这样不行，图片地址就算是错了，对象i也不是空。
	//	extracted();	//这个异常抛出方法没有用。
	
	//System.out.println("键被按下了");		//运行到了这一步。
	
	//增加键盘监听
	f.addKeyListener(new KeyListener(){
		
		
		//键被弹起
		public void keyReleased(KeyEvent e){
			System.out.println(e.getKeyCode());
			System.out.println("程序有没有过来");
			//39代表按下了“右键”
			if (e.getKeyCode() == 39){
				//图片向右移动 （y坐标不变，x坐标增加）
				l.setLocation(l.getX() + 10,l.getY());
							
			}
		
			
			//37代表按下了“左键”
			if (e.getKeyCode() == 37){
				//左移
				//System.out.println(e.getKeyCode());	//输出KeyCode
				l.setLocation(l.getX() - 10,l.getY());
			}
			
			//上
			if (e.getKeyCode() == 38){
				l.setLocation(l.getX(),l.getY() - 10);
			
			}
			
			//下
			if (e.getKeyCode()==40){
				l.setLocation(l.getX(), l.getY()+10);
			}
		}
			
			
		
		
		//键被按下
		public void keyPressed(KeyEvent e){
			
			//输出按键代码的方法。
			//System.out.println(e.getKeyCode());
		}
		
		//一个按下弹起的组合动作
		public void keyTyped(KeyEvent e){
			
		}
		
	});
	
	
	
	JButton b = new JButton("隐藏图片");	//按钮名称
	b.setBounds(50,200,100,30);		//按钮大小
	
	
	
	
	//给按钮    增加     监听
	class Listener implements ActionListener{
		
		JButton b = null;
		boolean flag;
		
		Listener(JButton b,boolean flag){
			this.b = b;
			this.flag = flag;
		}
		public void actionPerformed(ActionEvent e){
			if(!flag){
				l.setVisible(false);
				b.setText("显示图片");
				flag = true;
			} else {
				l.setVisible(true);
				b.setText("隐藏图片");
				flag = false;
			}
			f.requestFocus();//还是要加一个这句话，按钮和键盘还是有冲突。
		}
		
	}
	Listener ourListener = new Listener(b,flag);
	b.addActionListener(ourListener);
	
	
	
	//f.setFocusable(true);//button和keylistener冲突的问题
	//也可以使用f.setFocusable();
	//这里加了几句句f.setFocusable(true);
	
	f.add(l);
	f.add(b);
	
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	f.setVisible(true);
	
	}

	/**
	 * 抛出自定义异常的方法，
	 * 
	 * if（i==null—）不会成立，如果图片路径错误，对象i还是有内容，不会为空。
	 */
/*	private static void extracted() {
		{
			try {
				throw new notImageException();
			} catch (notImageException e1) {
				// TODO Auto-generated catch block
				System.out.println("没有图片，或者找不到图片");
				e1.printStackTrace();
				
			}
		}
	}
	*/
}

/**
 * 自定义异常
 * @author New year
 *	窗口没有显示图片的时候抛出这个异常
 */
	/*
class notImageException extends Exception{
	public notImageException(){
		
	}
	public notImageException(String s){
		super(s);
	}
}


*/