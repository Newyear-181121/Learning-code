package gui;

 //import gui.JFrameClean;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * //键盘监听的类		
 * @author New year
 * //定义键盘监听的内部类
 */
 class key extends KeyAdapter {
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() != 0)
			System.out.println("按下："+e.getKeyCode());
	}
		
	public void keyReleased(KeyEvent e) {		//键的抬起
		if(e.getKeyCode() != 0)
			System.out.println("抬起"+e.getKeyCode());
	}
		
}
	
public class demo extends JFrameClean{	
	public demo(int a, int b, int c, int d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		
		JFrame f = new JFrame();
		new JFrameClean(400,400,300,300);
		
		
		//添加一个按钮
		JButton b = new JButton("Button");
	}

		
		//KeyEvent e = null;
		//h.keyReleased(e);
		
		
		
		
		/**
		 * 左     		37
		 * shang 	38
		 * 右		39
		 * 下		40
		 */
}


