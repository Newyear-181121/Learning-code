package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * �¼�����֮�����
 * @author New year
 *
 */
public class TestGUI2_03_2  extends JFrame{	//�̳���JFrame�࣬�Ϳ���ֱ��ֻ�����ķ�����������������͵Ķ���Ҫ��������࣬��ʱҲ����ʹ�����ķ�����	

	/**
	 * ����ʲô��Ŷ�����汾�ţ�
	 */
	private static final long serialVersionUID = 1L;
	
	
	//�������		//�Ҿ�������Ӧ���Ǹ��¼���������������
	Wdmb wdmb = new Wdmb();		//ʵ������������
	
	public static void main(String[] args) {
		 //ʵ������ǰ��
		TestGUI2_03_2 index = new TestGUI2_03_2();		//ʵ������ʱ��ص������Ĺ��췽��
					  									//ԭ���е���������������ø��˾������ְɡ�	index//				
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("E:/�洢�ļ���/�����ļ�/Java/how2j(ѧϰ���ϣ�/how2j��ѧϰ���룩/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
		l.setIcon(i);
		l.setBounds(375, 275, i.getIconWidth(), i.getIconHeight());
		
		index.add(l);
		
		l.addMouseMotionListener(new MouseMotionListener(){

			//��ק
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				
				l.setLocation(x,y);			//��קͼƬ��Ч��������
			}

			//�ƶ�
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			
		});
		
		
		
		
		index.setVisible(true);
	}
	
	//�Զ�ִ��						//�൱���������Ĺ��췽���Զ�ִ��
	//���췽��
	public TestGUI2_03_2() {	
		
		this.add(wdmb);		//��ǰ���ڶ������Ӽ�������
		
		//����������¼�								
		this.addMouseListener(wdmb);					//�������������ǽӿڣ����ǳ���ģ�û�ж�������ʵ�֣�
														//
		//��������ק�¼�								//
		this.addMouseMotionListener(wdmb);				//����ʵ�ַ�������д��Wdmb�������ˡ�
		
		
		
		
		this.setSize(500,500);
		this.setLocation(300,200);
		this.setTitle("���");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}
	/**
	 * �ѱ�������Ĵ����Ÿĵ�����ȥ�ˣ�
	 * ��ԭ�����ⲿ�Ĳ��е���ĳ��ˣ��ڲ��ࡣ
	 * 
	 * ����û����
	 */

/**
 * 	�����¼������ࡣ
 * @author New year
 *		��Ӧ���ǲ�����ɣ��Ͼ���ֱ�����ڲ���
 *	������Ǹ��������ʹ�õġ�
 */
class Wdmb extends JPanel implements MouseListener,MouseMotionListener{

  //��������
    //JPanel�Դ�����,�����ʽ�ǹ̶���
    //paint ��������������Զ�������
    //1����������  2�����ڴ�С�����仯ʱ  3������repaint����ʱ
	
	public void paint(Graphics g){
		//���Ǹ���ķ���
        super.paint(g);
	}
	
	
	/**
	 * ����¼�
	 */

	//��굥��
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("��굥�����ʱ��λ���ǣ�");
        System.out.println("X���꣺"+e.getX());
        System.out.println("X���꣺"+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		 //System.out.println("��걻����");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("��걻�ɿ�");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("����ƶ���������");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		 //System.out.println("���ӽ����뿪");
		
	}
	
	/**
	 * �����ק�¼�
	 */
	
	//�����ק
	@Override
	public void mouseDragged(MouseEvent e) {
		//System.out.println("�����קʱ���λ���ǣ�");
        //System.out.println("X���꣺"+e.getX());
        //System.out.println("X���꣺"+e.getY());
	}

	//����ƶ�
	@Override
	public void mouseMoved(MouseEvent e) {	
		//System.out.println("����ƶ�ʱ��λ���ǣ�");
        //System.out.println("X���꣺"+e.getX());
        //System.out.println("X���꣺"+e.getY());
		
	}
	
}

