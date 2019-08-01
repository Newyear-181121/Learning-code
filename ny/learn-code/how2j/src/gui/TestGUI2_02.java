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
 * ���̼���
 * @author New year
 *���̼������� KeyListener
 *keyPressed ���� ��������
 *keyReleased ���� ��������
 *keyTyped ���� һ�����µ������϶���
 *KeyEvent.getKeyCode() ���Ի�ȡ��ǰ�������ĸ���
 */
public class TestGUI2_02 {
	public static void main(String[] args) {
	
	JFrame f = new JFrame("���ڱ���");//���û�м���������ڵ���һ�䣬�������ж�������﷨���󣬶���ʾ�ڱ������ϡ�
	f.setSize(400,300);
	f.setLocation(580,200);
	f.setLayout(null);
	
	boolean flag = false;
	
	final JLabel l = new JLabel();
	
	ImageIcon i = new ImageIcon("E:/�洢�ļ���/�����ļ�/Java/how2j(ѧϰ���ϣ�/how2j��ѧϰ���룩/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
	l.setIcon(i);
	l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
	//if(i==null)		//�������У�ͼƬ��ַ�����Ǵ��ˣ�����iҲ���ǿա�
	//	extracted();	//����쳣�׳�����û���á�
	
	//System.out.println("����������");		//���е�����һ����
	
	//���Ӽ��̼���
	f.addKeyListener(new KeyListener(){
		
		
		//��������
		public void keyReleased(KeyEvent e){
			System.out.println(e.getKeyCode());
			System.out.println("������û�й���");
			//39�������ˡ��Ҽ���
			if (e.getKeyCode() == 39){
				//ͼƬ�����ƶ� ��y���겻�䣬x�������ӣ�
				l.setLocation(l.getX() + 10,l.getY());
							
			}
		
			
			//37�������ˡ������
			if (e.getKeyCode() == 37){
				//����
				//System.out.println(e.getKeyCode());	//���KeyCode
				l.setLocation(l.getX() - 10,l.getY());
			}
			
			//��
			if (e.getKeyCode() == 38){
				l.setLocation(l.getX(),l.getY() - 10);
			
			}
			
			//��
			if (e.getKeyCode()==40){
				l.setLocation(l.getX(), l.getY()+10);
			}
		}
			
			
		
		
		//��������
		public void keyPressed(KeyEvent e){
			
			//�����������ķ�����
			//System.out.println(e.getKeyCode());
		}
		
		//һ�����µ������϶���
		public void keyTyped(KeyEvent e){
			
		}
		
	});
	
	
	
	JButton b = new JButton("����ͼƬ");	//��ť����
	b.setBounds(50,200,100,30);		//��ť��С
	
	
	
	
	//����ť    ����     ����
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
				b.setText("��ʾͼƬ");
				flag = true;
			} else {
				l.setVisible(true);
				b.setText("����ͼƬ");
				flag = false;
			}
			f.requestFocus();//����Ҫ��һ����仰����ť�ͼ��̻����г�ͻ��
		}
		
	}
	Listener ourListener = new Listener(b,flag);
	b.addActionListener(ourListener);
	
	
	
	//f.setFocusable(true);//button��keylistener��ͻ������
	//Ҳ����ʹ��f.setFocusable();
	//������˼����f.setFocusable(true);
	
	f.add(l);
	f.add(b);
	
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	f.setVisible(true);
	
	}

	/**
	 * �׳��Զ����쳣�ķ�����
	 * 
	 * if��i==null����������������ͼƬ·�����󣬶���i���������ݣ�����Ϊ�ա�
	 */
/*	private static void extracted() {
		{
			try {
				throw new notImageException();
			} catch (notImageException e1) {
				// TODO Auto-generated catch block
				System.out.println("û��ͼƬ�������Ҳ���ͼƬ");
				e1.printStackTrace();
				
			}
		}
	}
	*/
}

/**
 * �Զ����쳣
 * @author New year
 *	����û����ʾͼƬ��ʱ���׳�����쳣
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