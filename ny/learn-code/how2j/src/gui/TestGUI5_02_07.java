package gui;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 * ʹ��JLabel��ʾͼƬ
 * @author New year
 *
 * ava GUI ��ʾͼƬ��ͨ����label������ͼ��ʵ�ֵ�
 * ע�� �����ͼƬ·����e:/project/j2se/shana.png������Ҫȷ��������ͼƬ����Ȼ������ʾ
 * ע�� ͼƬ�ĺ�׺������ʵ��ʽ�����뱣��һ�£�������п����޷�������ʾ�� ʲô��˼�أ������ļ�������jpg�ģ����ǽ����ǰѺ�׺���޸ĳ���png,��ô�ᵼ����ʾʧ�ܡ�
 *
 */
public class TestGUI5_02_07 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("name");
		f.setSize(400,300);
		f.setLocation(580, 200);
		f.setLayout(null);
		
		JLabel l = new JLabel();		//��ǩ
		
		//����ͼƬ����ImageIcon����
		ImageIcon i = new ImageIcon("E:/�洢�ļ���/�����ļ�/Java/how2j(ѧϰ���ϣ�/how2j��ѧϰ���룩/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
		//����ImageIcon
		l.setIcon(i);
		//label�Ĵ�С����ΪImageIcon,������ʾ������
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		JButton b = new JButton("JButton ��ͨ��ť");		//��ť
        b.setBounds(50,200, 200, 30);
        
        
        /**
         * ��ѡ��
         * JCheckBox ��ѡ��
         * ʹ��isSelected����ȡ�Ƿ�ѡ����
         */
        JCheckBox bc1 = new JCheckBox("001");
        JCheckBox bc2 = new JCheckBox("002");
        //���� Ϊ Ĭ�ϱ�ѡ��
        bc1.setSelected(true);
        bc1.setBounds(200,50,130,30);
        bc2.setBounds(200,100,130,30);
        
      //�ж� �Ƿ� �� ѡ��
        System.out.println(bc2.isSelected());
        
		
		/**
		 * ��ѡ��
		 * 
		 * 	JRadioButton ��ѡ��
		 *	ʹ��isSelected����ȡ�Ƿ�ѡ���� 
		 * 
		 *	����������������ѡ����Ա�ͬʱѡ�У�Ϊ��ʵ��ֻ��ѡ��һ��������Ҫ�õ�ButtonGroup
		 */
        JRadioButton b1 = new JRadioButton("����Ӣ��");
        // ���� Ϊ Ĭ�ϱ�ѡ��
        b1.setSelected(true);
        b1.setBounds(250, 50, 130, 30);
        JRadioButton b2 = new JRadioButton("ħ�� Ӣ��");
        b2.setBounds(250, 100, 130, 30);
 
        System.out.println(b2.isSelected());
        
     // ��ť����
        ButtonGroup bg = new ButtonGroup();
        // ��b1��b2���� ͬһ�� ��ť��������� ������ͬһʱ�䣬ֻ��һ�� ��ť �ᱻѡ��
        bg.add(b1);
        bg.add(b2);
        
        /*
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(bc1);
        bg2.add(bc2);
        */
        
      //��������ֵ���Ŀ
        String[] heros = new String[] { "��������", "����" };
        JComboBox<String> cb = new JComboBox<String>(heros);
 
        cb.setBounds(100, 10, 80, 30);
 
        f.add(cb);
		
        f.add(b1);
        f.add(b2);
        
		
		f.add(b);
		f.add(l);
		
		f.add(bc1);
		f.add(bc2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
