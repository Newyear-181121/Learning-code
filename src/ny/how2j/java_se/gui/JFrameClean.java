package gui;

import javax.swing.JFrame;

/**
 * �����Ĵ�����
 * @author New year
 *	
 */
public class JFrameClean extends JFrame{

	/**
	 * 
	 * @param f		���ڶ���
	 * @param a		���ڴ�С�ĳ���int
	 * @param b		���ڴ�С�Ŀ�int
	 * @param c		����λ�õĺ����꣬int
	 * @param d		����λ�õ������꣬int
	 */
	public   JFrameClean (int a,int b,int c,int d) {		//���������ڱ������ʹ����Щ���ã�
		
		this.setSize(a,b);					// ���������ô�С
		this.setLocation(c,d);				// ����������λ��
		this.setLayout(null);				// �������е��������Ϊ���Զ�λ
	}
}
