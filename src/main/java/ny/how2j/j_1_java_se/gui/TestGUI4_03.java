package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * BorderLayout
 * ���ò�����ΪBorderLayout
 *�����ϵ���������ϱ� ���� ���� �Ҷ� �е�˳��ڷ�
 * @author New year
 *
 */
public class TestGUI4_03 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("name");
		f.setSize(400,300);
		f.setLocation(200,200);
		// ���ò�����ΪBorderLayerout
        // �����ϵ���������ϱ����������Ҷ��е�˳��ڷ�
		f.setLayout(new BorderLayout());
		
		JButton b1 = new JButton("001");
		JButton b2 = new JButton("002");
		JButton b3 = new JButton("003");
		JButton b4 = new JButton("004");
		JButton b5 = new JButton("005");
		
		
		// ���뵽������ʱ����Ҫָ��λ��
		f.add(b1,BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.WEST);
		f.add(b4, BorderLayout.EAST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
