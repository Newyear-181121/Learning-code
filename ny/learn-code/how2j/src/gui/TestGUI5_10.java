package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 * �����
 * @author New year
 * JPasswordField ����� 
 * ���ı���ͬ����ȡ�����������ݣ��Ƽ�ʹ��getPassword���÷����᷵��һ���ַ����飬�����ַ���
 */
public class TestGUI5_10 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("LOL");
		f.setSize(400,300);
		f.setLocation(200,200);
		
		f.setLayout(new FlowLayout());
		
		JLabel l = new JLabel("���룺");
		// �����
		JPasswordField pf = new JPasswordField("");
		pf.setText("����̨��Ȼ����ʾ�������ı����ﲻ����ʾ");
		pf.setPreferredSize(new Dimension(80,30));
		// ���ı���ͬ����ȡ�����������ݣ��Ƽ�ʹ��getPassword���÷����᷵��һ���ַ����飬�����ַ���
		char[] password = pf.getPassword();
		String p = String.valueOf(password);
		System.out.println(p);
		
		f.add(l);
		f.add(pf);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
		
	}

}
