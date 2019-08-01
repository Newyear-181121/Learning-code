package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * FlowLayout
 * 设置布局器为FlowLayout,顺序布局器
 *容器上的组件水平摆放
 *加入到容器即可，无需单独指定大小和位置
 `* @author New year
 *
 */
public class TestGUI4_02 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("biaoti");
		f.setSize(400,300);
		f.setLocation(200,200);
		// 设置布局器为FlowLayerout
        // 容器上的组件水平摆放
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("001");
		JButton b2 = new JButton("002");
		JButton b3 = new JButton("003");
		
		// 加入到容器即可，无需单独指定大小和位置
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
