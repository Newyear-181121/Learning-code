package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * �Ի���
 * 
 * @author New year
 *
 *
 *JOptionPane.showConfirmDialog(f, "�Ƿ� ʹ����� ��");
 *��ʾѯ�ʣ���һ�������ǸöԻ������ĸ��������
 *JOptionPane.showInputDialog(f, "������yes������ʹ����Һ���Ը�");
 *�����û�������
 *JOptionPane.showMessageDialog(f, "��ʹ����ұ�ץס�� �������3�Σ�");
 *��ʾ��Ϣ
 */
public class TestGUI5_08_JOptionPane {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("name");
		f.setSize(400,300);
		f.setLocation(580,240);
		f.setLayout(null);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//��һ����ť�����ϼ���
		JButton b = new JButton("�����Ի���");
		b.setBounds(50,50,100,30);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				/**
				 * �����Ķ��ǶԻ����ˡ�
				 */
				int option = JOptionPane.showConfirmDialog(f,"�Ƿ���ȷ��");
				
				if (JOptionPane.OK_OPTION == option) {
				String answer = JOptionPane.showInputDialog(f,"pleas input yes");
					if ("yes".equals(answer))
						JOptionPane.showMessageDialog(f,"yes");
					else 
						JOptionPane.showMessageDialog(f,"no");
				}
				
				
			}
			
			
		});
		
		
		
		/**
		 * �����Ķ��ǶԻ����ˡ�
		 */
		//ԭ��������ĶԻ������ĵ����̼�������ȥ�ˡ�
		//����Ի������������Ļ����򿪳���ͻ��Զ������Ի���
		
		
		f.add(b);
		
		
		f.setVisible(true);
		
	}

}
