package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GridLayout
 * GridLayout�������񲼾���
 * @author New year
 *
 */
public class TestGUI4_04 {
	 public static void main(String[] args) {
		 
	        JFrame f = new JFrame("LoL");
	        f.setSize(400, 300);
	        f.setLocation(200, 200);
	        // ���ò�����ΪGridLayerout�������񲼾���
	        // ��GridLayerout�Ĺ��췽����ʾ��������2��3��
	        f.setLayout(new GridLayout(2, 3));
	 
	        JButton b1 = new JButton("����");
	        JButton b2 = new JButton("������");
	        JButton b3 = new JButton("ŷ����");
	        JButton b4 = new JButton("��ҩʦ");
	        JButton b5 = new JButton("�ܲ�ͨ");
	 
	        f.add(b1);
	        f.add(b2);
	        f.add(b3);
	        f.add(b4);
	        f.add(b5);
	 
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        f.setVisible(true);
	 }

}
