package gui;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * ͼ�ν���
 * Hello Swing
 * @author New year
 *
 *
 */
public class TestGUI1_1 {

	public static void main(String[] args){
		
		//������
		JFrame f = new JFrame("������");
		
		//�����������С
		f.setSize(400,300);
		
		//����������λ��
		f.setLocation(200,200);
		
		//�������е��������Ϊ���Զ�λ
		f.setLayout(null);
		
		//��ť���
		JButton b = new JButton("��ť����������������,��ʱû�й��ܡ�");
		
		//ͬʱ�����齨�Ĵ�С��λ��
		//���õ���b��������
		b.setBounds(50,50,280,30);
		
		//�Ѱ�ť���뵽��������
		f.add(b);
		
		//�رմ����ʱ���˳�����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�ô����ÿɼ�
		f.setVisible(true);//�������������е����������Ⱦ������һ��Ҫ��������档
		
	}
}
