package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * JScrollPanel
 * @author New year
 *
 *	ʹ�ô�����������������ַ�ʽ
 * 1. �ڴ���JScrollPane���������Ϊ��������ȥ
 * 
 * JScrollPane sp = new JScrollPane(ta);
 *
 *
 * 2. ϣ�����������������ʾ���������ʱ�򣬵���setViewportView
 * 
 * sp.setViewportView(ta);
 */
public class TestGUI6_04 {

	public static void main(String[] args) {
		JFrame f = new JFrame("lol");
		f.setSize(400,300);
		f.setLocation(200,200);
		
		f.setLayout(null);
		//׼��һ���ı���������źܶ�����
		JTextArea ta = new JTextArea();
		for (int i = 0; i < 100; i++) {
			ta.append(String.valueOf(i));
		}
		 //�Զ�����
		ta.setLineWrap(true);
		JScrollPane sp = new JScrollPane(ta);
		
		f.setContentPane(sp);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
}
