package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * 窗体大小不可变化 
 * 
 *通过调用方法 setResizable(false); 做到窗体大小不可变化
 *
 *
 *
 *点击按钮，弹出一个窗口。
 * @author New year
 *
 */
public class TestGUI3_04 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("LOL");
		f.setSize(400,300);
		f.setLocation(200,300);
		f.setLayout(null);
		JButton b = new JButton("button");
		b.setBounds(50,50,100,30);
		
		JButton b2 = new JButton("003");
		b2.setBounds(50,50,80,30);
		
		/**
		 * 创建事件监听对象
		 * 并进行方法重写
		 */
		ActionListener a = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//可以这样用就行了。
				
			}
			
		};
		
		
		// 给按钮 增加 监听
		b.addActionListener(new ActionListener() {
			// 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog f2 = new JDialog(f);
				
				
				
				f2.setSize(300, 300);
				f2.setLocation(200,200);
				f2.setLayout(null);
				
				
				
				b2.addActionListener(a);
				
				f2.add(b2);
				
				
				f2.setVisible(true);
			}
		});
		
		
		
		f.add(b);
		
		//窗体大小不可变化
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		
	}

}
