package gui;

import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * JDialogҲ�Ǵ��������������Ͻ�û��������С����ť
 * @author New year
 *
 */
public class TestGUI3_02 {
	
	public static void main(String[] args) {
		
		//��ͨ�Ĵ��壬��������С����ť
		JDialog d = new JDialog();
		d.setTitle("����");
		d.setSize(400,300);
		d.setLocation(200, 200);
		d.setLayout(null);
		JButton b = new JButton("����");
		b.setBounds(50,50,280,30);
		
		d.add(b);
		
		d.setVisible(true);
	}

}
