package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ����������
 * @author New year
 *java��ͼ�ν����У�������������� ��ť������������ġ� 
 *
 *������������������һ����JFrame,һ����JDialog
 *
 *JFrame����õĴ�����������Ĭ������£������Ͻ��������С����ť
 */
public class TestGUI3_01 {
	static boolean bu = true;
	

	public static void main(String[] args){
		
		
		//��ͨ�Ĵ��壬��������С����ť
		JFrame f = new JFrame("name");
		
		f.setSize(400,400);
		f.setLocation(500,200);
		f.setLayout(null);
		
		JButton b = new JButton("����ͼƬ");		//��ť
		
		//���ð�ť����ʽ
		b.setBounds(150,200,100,30);
		
		JLabel l = new JLabel();				//��ǩ
		
		ImageIcon i = new ImageIcon("E:/New year/Pictures/like/348706.jpg");			//ͼƬ		//������������ͼƬ��path
		
		l.setIcon(i);		//�ѱ�ǩ����ΪͼƬ
		
		//���ñ�ǩ�Ĵ�С
		l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
		
		//����ť���Ӽ���
		b.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				if(bu) {
					l.setVisible(false);
					bu = false;
					b.setText("��ʾͼƬ");
				} else {
					b.setText("����ͼƬ");
					l.setVisible(true);
					bu = true;
				}
			}
		});
		
		f.add(l);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}
}
