package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * FlowLayout
 * ���ò�����ΪFlowLayout,˳�򲼾���
 *�����ϵ����ˮƽ�ڷ�
 *���뵽�������ɣ����赥��ָ����С��λ��
 `* @author New year
 *
 */
public class TestGUI4_02 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("biaoti");
		f.setSize(400,300);
		f.setLocation(200,200);
		// ���ò�����ΪFlowLayerout
        // �����ϵ����ˮƽ�ڷ�
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("001");
		JButton b2 = new JButton("002");
		JButton b3 = new JButton("003");
		
		// ���뵽�������ɣ����赥��ָ����С��λ��
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
