package gui;

 //import gui.JFrameClean;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * //���̼�������		
 * @author New year
 * //������̼������ڲ���
 */
 class key extends KeyAdapter {
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() != 0)
			System.out.println("���£�"+e.getKeyCode());
	}
		
	public void keyReleased(KeyEvent e) {		//����̧��
		if(e.getKeyCode() != 0)
			System.out.println("̧��"+e.getKeyCode());
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
		
		
		//���һ����ť
		JButton b = new JButton("Button");
	}

		
		//KeyEvent e = null;
		//h.keyReleased(e);
		
		
		
		
		/**
		 * ��     		37
		 * shang 	38
		 * ��		39
		 * ��		40
		 */
}


