package gui_2_Test;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * ��ϰ-Ϊ���ж�
 * @author New year
 * ��JTextField���������ݣ����Ա߼�һ����ťJButton,
 * �������ť��ʱ���ж�JTextFiled����û�����ݣ���ʹ��JOptionPane������ʾ
 * 
 * ����ж�
 * �жϸ��ַ����Ƿ������ݿ����жϸ��ַ����ĳ���
 * 
 */
public class Test_01 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Ϊ���ж�");
		f.setSize(500, 400);
		f.setLocation(200,100);
		//f.setLayout(null);	//������û�����õ�ʱ��һ��Ҫ�����ı���Ĵ�С��λ�ã���Ȼ������ʾ
		
		f.setLayout(new FlowLayout());//���ò�����  ��˳�򲼾���
		
		
		JTextField tf = new JTextField();
		//tf.setText("please input");
		tf.setPreferredSize(new Dimension(80,30));
		//tf.setLocation(100,100);
		//tf.setSize(100,30);
		
		JButton b = new JButton("���");
		//b.setSize(80,30);
		//b.setLocation(210,100);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();		//�ж��Ƿ�Ϊ�տ����ж�����ַ����ĳ���
				if(text.length() == 0){
					JOptionPane.showMessageDialog(f, "�ı�����Ϊ��");
					tf.grabFocus();
				} 
			}
			
		});
		
		
		
		f.add(tf);
		f.add(b);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
		
		
		
	}

}
