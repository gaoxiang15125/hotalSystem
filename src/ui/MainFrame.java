package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class MainFrame extends JFrame {
	public MainFrame() {
		// 创建窗体
		JFrame frame = new JFrame("webpromotionmain");
		frame.setLayout(new GridLayout(5,1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocation(450, 150);
		frame.setVisible(true);
		frame.setResizable(false);
		
		//用于排版
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		JPanel jp4=new JPanel();
	
		JButton promotion=new JButton("制定营销策略");
		JButton credit=new JButton("信用充值");
		promotion.setPreferredSize(new Dimension(200,100));
		credit.setPreferredSize(new Dimension(200,100));


		jp3.add(promotion);
		jp3.add(credit);
		
		frame.add(jp1);
		frame.add(jp2);
		frame.add(jp3);
		frame.add(jp4);
		
		//按钮响应
		promotion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

				
			}
		});
		
		credit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				JPanel jp1=new JPanel();
				JPanel jp2=new JPanel();
				JPanel jp3=new JPanel();
				JLabel jlb2=new JLabel("信用值");
				JButton jb1=new JButton("确定");
				JButton jb2=new JButton("取消");
				JLabel jlb1=new JLabel("账 号");
			
				JTextField account=new JTextField(10);
				JTextField credit=new JTextField(10);
				JFrame chongzhi=new JFrame("信用充值");
				chongzhi.setLayout(new GridLayout(3,1));
				jp1.add(jlb1);
				jp1.add(account);
				
				jp2.add(jlb2);
				jp2.add(credit);
				
				jp3.add(jb1);
				jp3.add(jb2);
				jb2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						chongzhi.dispose();
					}
				});
				chongzhi.add(jp1);
				chongzhi.add(jp2);
				chongzhi.add(jp3);
				chongzhi.setSize(300, 150);

				chongzhi.setVisible(true);
				chongzhi.setLocation(700, 400);
				chongzhi.setResizable(false);
				
			}
		});
}
}
