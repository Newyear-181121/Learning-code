package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * ��ť����
 * @author New year
 *
 */
public class TestGUI2_01 {
	
	public static void main(String[] args){
		
		JFrame f = new JFrame("���ڱ���");
		f.setSize(400, 300);
		f.setLocation(580,200);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
									//����������		//������һ����gui_image�������ͼƬ
		//ImageIcon i = new ImageIcon("gui_image/shana.png");// set path  //����·��      ��  �������ļ���
		ImageIcon i = new ImageIcon("E:/�洢�ļ���/�����ļ�/Java/how2j(ѧϰ���ϣ�/how2j��ѧϰ���룩/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
		l.setIcon(i);
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		JButton b = new JButton("����ͼƬ");	//��ť����
		b.setBounds(50,200,100,30);		//��ť��С
		
		JButton b2 = new JButton("��ʾͼƬ");
		b2.setBounds(180,200,100,30);
		
		//����ť    ����     ����
		b.addActionListener(new ActionListener(){
			
			//����ť�����ʱ���ͻᴥ��    ActionEvent �¼�
			//actionPerformed   �����ͻᱻִ��
			public void actionPerformed(ActionEvent e){
				l.setVisible(false);
			}
		});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				l.setVisible(true);
				//l.setBounds(100, 50, i.getIconWidth(), i.getIconHeight());//����
			}
			
		});
		
		f.add(l);
		f.add(b);
		f.add(b2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
