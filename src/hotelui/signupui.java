package hotelui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import vo.HotelInforvo;

/*
 * @author hzp
 * @version 1.0.20161118
 */
public class signupui extends JPanel{
	
	private final int name=0;
	private final int address=1;
	private final int introduction=2;
	private final int password=3;
	private final int confirmpassword=4;
	private final int tradearea=5;
	private final int level=6;
	
	/*
	 * 常量值
	 * 用于规定输入框和选择框的大小
	 * 也使用于布局中status的位置确定
	 */
	private final int textfield_width=280;
	private final int textfield_height=35;
	
	/*
	 * labels
	 * kind是标识信息类别
	 * status是检测输入后反馈信息
	 */
	private JLabel kind[]=new JLabel[7];
	private JLabel status[]=new JLabel[5];
	private JLabel welcome=new JLabel("欢迎注册酒店预定系统");
	
	//输入框和选择框
	private JTextField nameT=new JTextField("");
	private JTextField addressT=new JTextField("");
	private JTextArea introductionT=new JTextArea("");
	private JScrollPane introductionSP=new JScrollPane(introductionT);
	
	private JPasswordField passwordT=new JPasswordField(15);
	private JPasswordField confirmpasswordT=new JPasswordField(15);
	
	private JComboBox<String> tradeareaC = new JComboBox<String>();
	private JComboBox<String> levelC = new JComboBox<String>();
	
	//buttons
	private JButton backb=new JButton("返回");
	private JButton nextb=new JButton("填写客房信息");
	private JButton submitb=new JButton("提交注册");
	
	public signupui(){
		initui();
	}
	
	private void initui(){
		Labels();
		TextFields();
		Buttons();
		
		//设置界面中一些常量值
		final int frame_width=800;
		final int frame_height=600;
		final int label_gap=50;	
		final int label_textfield_gap=115;
		
		//创建JPanel，并添加标识、文本框、选择框、按钮
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setSize(frame_width,frame_height);
		
		// 为方便修改，x和y保存jpanel的大小
		int x=frame_width/5-15;
		int y=70;
		
		//标识的添加和排版
		int labelg=label_gap;
		
		this.add(welcome);
		welcome.setLocation(10, 10);
		
		for(int i=0;i<kind.length;i++)
			this.add(kind[i]);
		kind[name].setLocation(x, y+labelg*0);
		kind[password].setLocation(x, y+labelg*1);
		kind[confirmpassword].setLocation(x, y+labelg*2);
		kind[tradearea].setLocation(x, y+labelg*3);
		kind[level].setLocation(x, y+labelg*4);
		kind[address].setLocation(x, y+labelg*5);
		kind[introduction].setLocation(x, y+labelg*6);
		
		//文本框的添加和排版
		int textw=textfield_width;
		int texth=textfield_height;
		int ltg=label_textfield_gap;
		
		this.add(nameT);
		this.add(passwordT);
		this.add(confirmpasswordT);
		this.add(tradeareaC);
		this.add(levelC);
		this.add(addressT);
		this.add(introductionSP);
		nameT.setLocation(x+ltg, y+labelg*0);
		passwordT.setLocation(x+ltg, y+labelg*1);
		confirmpasswordT.setLocation(x+ltg, y+labelg*2);
		tradeareaC.setLocation(x+ltg, y+labelg*3);
		levelC.setLocation(x+ltg, y+labelg*4);
		addressT.setLocation(x+ltg, y+labelg*5);
		introductionSP.setLocation(x+ltg, y+labelg*6);	
		
		//标识输入是否正确的添加和排版
		//不添加商圈和星级的判断标识
		for(int i=0;i<status.length;i++)
			this.add(status[i]);
		status[name].setLocation(x+ltg+textw, y+labelg*0);
		status[password].setLocation(x+ltg+textw, y+labelg*1);
		status[confirmpassword].setLocation(x+ltg+textw, y+labelg*2);
		status[address].setLocation(x+ltg+textw, y+labelg*5);
		status[introduction].setLocation(x+ltg+textw, y+labelg*6);
		
		//按钮的添加
		this.add(backb);
		this.add(nextb);
		backb.setLocation(x+ltg+textw, y+labelg*6+texth*3+10);
		nextb.setLocation(x+ltg, y+labelg*6+texth*3+10);
	}
	
	
	private void Labels(){
		final int label_width=120;
		final int label_height=30;
		
		for(int i=0;i<kind.length;i++){
			kind[i]=new JLabel("",JLabel.RIGHT);
			kind[i].setSize(label_width, label_height);
			kind[i].setFont(new Font("wingding",1,20));
			kind[i].setForeground(Color.black);
		}
		for(int i=0;i<status.length;i++){
			status[i]=new JLabel("");
			status[i].setSize(label_width*2, label_height);
			status[i].setFont(new Font("华文楷体",1,15));
			status[i].setForeground(Color.red);
		}
		kind[name].setText("酒店名称：");
		kind[password].setText("密码：");
		kind[confirmpassword].setText("确认密码：");
		kind[tradearea].setText("商圈：");
		kind[level].setText("星级：");
		kind[address].setText("详细地址：");
		kind[introduction].setText("酒店描述：");
		
		welcome.setSize(label_width*2, label_height);
		welcome.setFont(new Font("华文行楷",4,22));
		welcome.setForeground(new Color(0, 191, 255));
	}
	
	private void TextFields(){
		//初始化名称、密码、确认密码、地址、介绍输入框
		nameT.setText("");
		passwordT.setText("");
		confirmpasswordT.setText("");
		addressT.setText("");
		introductionT.setText("");
		nameT.setSize(textfield_width, textfield_height);
		passwordT.setSize(textfield_width, textfield_height);
		confirmpasswordT.setSize(textfield_width, textfield_height);
		addressT.setSize(textfield_width, textfield_height);
		introductionT.setSize(textfield_width, textfield_height);
		
		//初始化商圈、星级选择框
		String tradearea[]={"  南京","  上海","  北京","  连云港"};
		tradeareaC=new JComboBox<String>(tradearea);
		tradeareaC.setFont(new Font("华文楷体",1,15));
		tradeareaC.setSize(textfield_width, textfield_height);
		
		String level[]={"    1","    2","    3","    4","    5"};
		levelC=new JComboBox<String>(level);	
		levelC.setFont(new Font("华文楷体",1,15));	
		levelC.setSize(textfield_width, textfield_height);
		
		//初始化简介输入框
		introductionSP.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		introductionSP.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		introductionT.setFont(new Font("楷体",1,15));
		introductionT.setWrapStyleWord(true);  
		introductionT.setLineWrap(true);
		introductionSP.setSize(textfield_width, (int)(textfield_height*2.5));
		introductionT.setSize(textfield_width, (int)(textfield_height*2.5));
	}
	
	private void Buttons(){
		final int button_width=140;
		final int button_height=50;
		
		backb.setFont(new Font("华文新魏",1,20));
		backb.setForeground(Color.white);
		backb.setBackground(new Color(0, 191, 255));
		backb.setBorderPainted(false);
		backb.setFocusPainted(false);
		backb.setSize( button_width, button_height);
		backb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 
		
		nextb.setFont(new Font("华文新魏",1,20));	
		nextb.setForeground(Color.white);
		nextb.setBackground(new Color(0, 191, 255));
		nextb.setBorderPainted(false);
		nextb.setFocusPainted(false);
		nextb.setSize( button_width*3/2, button_height);
		nextb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		nextb.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 HotelInforvo infor=new HotelInforvo();
				 boolean checkresult[]=new boolean[infor.getinforcheck_count()];
				 infor.setname(nameT.getText());
				 infor.setaddress(addressT.getText());
				 infor.settradearea(tradeareaC.getSelectedItem().toString());
				 infor.setlevel(levelC.getSelectedItem().toString());
				 infor.setintroduction(introductionT.getText());
				 String temp="", tempc="";
				 temp=new String(passwordT.getPassword()).trim();
				 tempc=new String(confirmpasswordT.getPassword()).trim();
				 if(temp.length()==0)
					 status[password].setText("请输入密码");
				 else
					 status[password].setText("");
				 if(!temp.equals(tempc))
					 status[confirmpassword].setText("两次密码不同，请重新输入");
				 else
					 status[confirmpassword].setText("");
				 checkresult=new monitorbl().signupcheck(infor);
				 if(nameT.getText().length()>20)
					 status[name].setText("请勿超过20个字母");
				 else{
					 if(!checkresult[0])
						 status[name].setText("仅限英文字母输入");
					 else
						 status[name].setText("");
				 }
				 for(int i=1;i<checkresult.length;i++){
					 if(!checkresult[i])
						 status[i].setText("请勿只输入空格");
					 else
						 status[i].setText("");
				 }
			 }
		}
		);
		
		backb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
	}
	
}


