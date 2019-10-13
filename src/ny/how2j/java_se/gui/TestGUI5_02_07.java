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
 * 使用JLabel显示图片
 * @author New year
 *
 * ava GUI 显示图片是通过在label上设置图标实现的
 * 注： 这里的图片路径是e:/project/j2se/shana.png，所以要确保这里有图片，不然不会显示
 * 注： 图片的后缀名和真实格式，必须保持一致，否则很有可能无法正常显示。 什么意思呢？就是文件本来是jpg的，但是仅仅是把后缀名修改成了png,那么会导致显示失败。
 *
 */
public class TestGUI5_02_07 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("name");
		f.setSize(400,300);
		f.setLocation(580, 200);
		f.setLayout(null);
		
		JLabel l = new JLabel();		//标签
		
		//根据图片创建ImageIcon对象
		ImageIcon i = new ImageIcon("E:/存储文件夹/桌面文件/Java/how2j(学习资料）/how2j（学习代码）/All/com.how2j.java_SE.study.Test/src/gui_image/shana.png");
		//设置ImageIcon
		l.setIcon(i);
		//label的大小设置为ImageIcon,否则显示不完整
		l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
		
		JButton b = new JButton("JButton 普通按钮");		//按钮
        b.setBounds(50,200, 200, 30);
        
        
        /**
         * 复选框
         * JCheckBox 复选框
         * 使用isSelected来获取是否选中了
         */
        JCheckBox bc1 = new JCheckBox("001");
        JCheckBox bc2 = new JCheckBox("002");
        //设置 为 默认被选中
        bc1.setSelected(true);
        bc1.setBounds(200,50,130,30);
        bc2.setBounds(200,100,130,30);
        
      //判断 是否 被 选中
        System.out.println(bc2.isSelected());
        
		
		/**
		 * 单选框
		 * 
		 * 	JRadioButton 单选框
		 *	使用isSelected来获取是否选中了 
		 * 
		 *	在这个例子里，两个单选框可以被同时选中，为了实现只能选中一个，还需要用到ButtonGroup
		 */
        JRadioButton b1 = new JRadioButton("物理英雄");
        // 设置 为 默认被选中
        b1.setSelected(true);
        b1.setBounds(250, 50, 130, 30);
        JRadioButton b2 = new JRadioButton("魔法 英雄");
        b2.setBounds(250, 100, 130, 30);
 
        System.out.println(b2.isSelected());
        
     // 按钮分组
        ButtonGroup bg = new ButtonGroup();
        // 把b1，b2放在 同一个 按钮分组对象里 ，这样同一时间，只有一个 按钮 会被选中
        bg.add(b1);
        bg.add(b2);
        
        /*
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(bc1);
        bg2.add(bc2);
        */
        
      //下拉框出现的条目
        String[] heros = new String[] { "卡特琳娜", "库奇" };
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
