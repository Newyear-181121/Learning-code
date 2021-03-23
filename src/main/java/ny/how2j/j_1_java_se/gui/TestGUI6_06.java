package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *		 CardLayerout
 * @author New year
 * CardLayerout ������ ����TabbedPanel ���ڱ�������������һ��������������һ��CardLayerout ��JPanel
 * ���JPanel����������壬����ͨ��CardLayerout������л�
 */
public class TestGUI6_06 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("CardLayerout");
		
		JPanel comboBoxPane = new JPanel();
		String buttonPanel = "��ť���";
		String inputPanel = "��������";
		String comboBoxItems[] = {buttonPanel,inputPanel };
		JComboBox<String> cb = new JComboBox<>(comboBoxItems);
		comboBoxPane.add(cb);
		
		//����Panel�䵱��Ƭ
		JPanel card1 = new JPanel();
		card1.add(new JButton("001"));
		card1.add(new JButton("002"));
		card1.add(new JButton("003"));
		
		JPanel card2 = new JPanel();
		card2.add(new JTextField("�����",20));
		
		JPanel cards;	//a panel that uses CardLayout		//ʹ�ÿ�Ƭ���ֵ����
		cards = new JPanel(new CardLayout());
		cards.add(card1,buttonPanel);					//�ѣ����������ӵ�cards�����ȥ
		cards.add(card2,inputPanel);
		
		f.add(comboBoxPane,BorderLayout.NORTH);
		f.add(cards,BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250, 150);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent evt) {
				CardLayout cl = (CardLayout) (cards.getLayout());
				cl.show(cards, (String) evt.getItem());
			}
		});
	}

}
