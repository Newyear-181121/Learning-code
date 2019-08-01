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
		
		f.setLayout(null);		//���岼��
		
		JPanel p1 = new JPanel();		//���		�������
		p1.setBounds(50,50,300,60);
		
		p1.setBackground(Color.RED);		//���ñ���
		
		p1.setLayout(new FlowLayout());		//���ò���
		
		JButton b1 = new JButton("Ӣ��1");
        JButton b2 = new JButton("Ӣ��2");
        JButton b3 = new JButton("Ӣ��3");
  
        //��ť����������
        p1.add(b1);		
        p1.add(b2);
        p1.add(b3);
  
        JPanel p2 = new JPanel();		//�ڶ����������
        
        JButton b4 = new JButton("Ӣ��4");
        JButton b5 = new JButton("Ӣ��5");
        JButton b6 = new JButton("Ӣ��6");
  
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        
        p2.setBackground(Color.BLUE);		//���ñ�����ɫ
        p2.setBounds(10,150,300,60);		//����λ�ü���С
        
        JTabbedPane tp = new JTabbedPane();			//��ҳʽ���
        tp.add(p1);									//�ѻ����������ҳʽ���
        tp.add(p2);
        
        // ����tab�ı���			���ñ�ǩ�ı���
        tp.setTitleAt(0, "��ɫtab");
        tp.setTitleAt(1, "��ɫtab");
        										//��������໹�����õġ�
        ImageIcon i = new ImageIcon(ImageUtil.getImage("gui_image/j.png"));//��������õ��Ƿ���ķ���
        tp.setIconAt(0, i);		//����tab��ͼ��
        tp.setIconAt(1, i);
        
        //���ݴ���
        f.setContentPane(tp);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setVisible(true);
	}

}
