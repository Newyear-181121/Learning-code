package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * setPreferredSize
 * ���� ʹ�� ������ ��Ҳ���� ͨ��setPreferredSize���򲼾�������������ʾ�Ĵ�С.
 * ע ֻ�Բ��ֲ����������ã�����FlowLayout���������á� ����GridLayout�Ͳ������ã���Ϊ���񲼾����������
 * @author New year
 *
 */
public class TestGUI4_05 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("title");
		f.setSize(400,300);
		f.setLocation(200,200);
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("001");
		JButton b2 = new JButton("002");
		JButton b3 = new JButton("003");
		
		// ���� ʹ�� ������ ��Ҳ���� ͨ��setPreferredSize���򲼾�������������ʾ�Ĵ�С
		b3.setPreferredSize(new Dimension(180,40));
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
