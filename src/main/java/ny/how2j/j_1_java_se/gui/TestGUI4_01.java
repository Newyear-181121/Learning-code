package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * ���Զ�λ
 * ���Զ�λ����ָ��ʹ�ò������������λ�úʹ�С��Ҫ����ָ��
 * @author New year
 *
 */
public class TestGUI4_01 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("lol");
		f.setSize(400, 300);
		f.setLocation(200,200);
		//// ���ò�����Ϊnull�������о��Զ�λ�������ϵ��������Ҫָ��λ�úʹ�С
		f.setLayout(null);
		JButton b1 = new JButton("Ӣ��1");
		// ָ��λ�úʹ�С
		b1.setBounds(50,50,80,30);
		 JButton b2 = new JButton("Ӣ��2");
	        b2.setBounds(150, 50, 80, 30);
	        JButton b3 = new JButton("Ӣ��3");
	        b3.setBounds(250, 50, 80, 30);
	        // û��ָ��λ�úʹ�С�����������������
	        JButton b4 = new JButton("Ӣ��3");
	        
	        JDialog d = new JDialog();
	        d.setTitle("����");
	        d.setModal(true);
	        d.setLocation(200, 200);
	        d.setSize(500,500);
	        
	        ActionListener a = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					d.setVisible(true);
				}
	        	
	        };   
	        
	        b1.addActionListener(a);
	        b2.addActionListener(a);
	        b3.addActionListener(a);
	        
	        
	        
	 
	        f.add(b1);
	        f.add(b2);
	        f.add(b3);
	        // b4û��ָ��λ�úʹ�С�����������������
	        f.add(b4);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        f.setVisible(true);
		
	}

}
