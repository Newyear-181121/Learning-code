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
 * 		����У��
 * @author New year
 *
 */
public class Test_02 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("����У��");
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
				String text = tf.getText();
				try {
					Integer.parseInt(text);
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(f, "��������ݲ�������");
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
