package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * BorderLayout
 * 设置布局器为BorderLayout
 *容器上的组件按照上北 下南 左西 右东 中的顺序摆放
 * @author New year
 *
 */
public class TestGUI4_03 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("name");
		f.setSize(400,300);
		f.setLocation(200,200);
		// 设置布局器为BorderLayerout
        // 容器上的组件按照上北下南左西右东中的顺序摆放
		f.setLayout(new BorderLayout());
		
		JButton b1 = new JButton("001");
		JButton b2 = new JButton("002");
		JButton b3 = new JButton("003");
		JButton b4 = new JButton("004");
		JButton b5 = new JButton("005");
		
		
		// 加入到容器的时候，需要指定位置
		f.add(b1,BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.WEST);
		f.add(b4, BorderLayout.EAST);
		f.add(b5, BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
