package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * �����С���ɱ仯 
 * 
 *ͨ�����÷��� setResizable(false); ���������С���ɱ仯
 *
 *
 *
 *�����ť������һ�����ڡ�
 * @author New year
 *
 */
public class TestGUI3_04 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("LOL");
		f.setSize(400,300);
		f.setLocation(200,300);
		f.setLayout(null);
		JButton b = new JButton("button");
		b.setBounds(50,50,100,30);
		
		JButton b2 = new JButton("003");
		b2.setBounds(50,50,80,30);
		
		/**
		 * �����¼���������
		 * �����з�����д
		 */
		ActionListener a = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//���������þ����ˡ�
				
			}
			
		};
		
		
		// ����ť ���� ����
		b.addActionListener(new ActionListener() {
			// ����ť�����ʱ���ͻᴥ�� ActionEvent�¼�
            // actionPerformed �����ͻᱻִ��
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog f2 = new JDialog(f);
				
				
				
				f2.setSize(300, 300);
				f2.setLocation(200,200);
				f2.setLayout(null);
				
				
				
				b2.addActionListener(a);
				
				f2.add(b2);
				
				
				f2.setVisible(true);
			}
		});
		
		
		
		f.add(b);
		
		//�����С���ɱ仯
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
