package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * ��һ���Ի�������Ϊģ̬��ʱ���䱳��ĸ����壬�ǲ��ܱ�����ģ����ǸöԻ��򱻹ر�
 * @author New year
 *
 */
public class TestGUI3_03 {

	public static void main(String[] args) {
		JFrame f = new JFrame("�ⲿ����");
		f.setSize(800,600);
		f.setLocation(100,100);
		f.setLayout(null);
		
		JButton b1 = new JButton("��������");
		b1.setBounds(60,50,280,30);
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// �����ⲿ����ʵ����JDialog
				JDialog d = new JDialog(f);
				// ����Ϊģ̬
				d.setModal(true);
				
				d.setTitle("ģ̬�Ի���");
				d.setSize(400,300);
				d.setLocation(200,200);
				d.setLayout(null);
				JButton b = new JButton("��ť");
				b.setBounds(50,50,280,30);
				d.add(b);
				d.setVisible(true);
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	
		
	}
}
