package userui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class signupui extends JPanel{
	//常量值
	private final int frame_width=800;
	private final int frame_height=600;
		
	private final int label_gap=50;
	private final int label_width=120;
	private final int label_height=30;
		
	private final int label_textfield_gap=100;
		
	private final int textfield_width=220;
	private final int textfield_height=40;
		
	private final int button_width=220;
	private final int button_height=50;
	//labels
	private JLabel nameL=new JLabel();
	private JLabel passwordL=new JLabel();
	private JLabel confirmpasswordL=new JLabel();		
	private JLabel sexL=new JLabel();
	private JLabel birthL=new JLabel();
	private JLabel phoneL=new JLabel();
	private JLabel e_label[]=new JLabel[6];
	//背景图片
	ImageIcon signupsetting_0=new ImageIcon("image\\setting_0_1.jpg");
	ImageIcon signupsetting_1=new ImageIcon("image\\setting_white_1.png");
	
	//输入框和选择框
	private JTextField nameT=new JTextField("");
	private JTextField phoneT=new JTextField("");
	
	private JPasswordField passwordT=new JPasswordField("");
	private JPasswordField confirmpasswordT=new JPasswordField("");
	
	private JRadioButton sex_male=new JRadioButton("男");
	private JRadioButton sex_female=new JRadioButton("女");
	
	private JComboBox<String> birth_year = new JComboBox<String>();
	private JComboBox<String> birth_mouth = new JComboBox<String>();
	private JComboBox<String> birth_day = new JComboBox<String>();
	//按钮
	private JButton backb=new JButton();
	private JButton submitb=new JButton();
	
	protected signupui(){
		initui();
	}
	
	private void initui(){
		Labels();
		TextFields();
		Buttons();
		
		//创建JPanel，并添加标识、文本框、按钮
		this.setLayout(null);
		this.setSize(frame_width,frame_height);
		
		 // 为方便修改，x和y保存jpanel的大小
		int x=frame_width/5;
		int y=frame_height/7;

		 //标识的添加和排版
		int labelw=label_width;
		int labelh=label_height;
		int labelg=label_gap;
		
		this.add(nameL);
		this.add(passwordL);
		this.add(confirmpasswordL);
		this.add(sexL);
		this.add(birthL);
		this.add(phoneL);
		nameL.setBounds(x, y+labelg*0, labelw, labelh);
		passwordL.setBounds(x, y+labelg*1, labelw, labelh);
		confirmpasswordL.setBounds(x, y+labelg*2, labelw, labelh);
		sexL.setBounds(x, y+labelg*3, labelw, labelh);
		birthL.setBounds(x, y+labelg*4, labelw, labelh);
		phoneL.setBounds(x, y+labelg*5, labelw, labelh);
		
		// 文本框的添加和排版
		int textw=textfield_width;
		int texth=textfield_height;
		int ltg=label_textfield_gap;
		
		this.add(nameT);
		this.add(passwordT);
		this.add(confirmpasswordT);
		this.add(sex_male);
		this.add(sex_female);
		this.add(birth_year);
		this.add(birth_mouth);
		this.add(birth_day);
		this.add(phoneT);	
		nameT.setBounds(x+ltg, y+labelg*0, textw, texth);
		passwordT.setBounds(x+ltg, y+labelg*1, textw, texth);
		confirmpasswordT.setBounds(x+ltg, y+labelg*2, textw, texth);
		sex_male.setBounds(x+ltg, y+labelg*3, textw/2, texth);
		sex_female.setBounds(x+ltg+textw/2, y+labelg*3, textw/2, texth);
		birth_year.setBounds(x+ltg, y+labelg*4, textw/7*3, texth);
		birth_mouth.setBounds(x+ltg+textw/7*3, y+labelg*4, textw/7*2, texth);
		birth_day.setBounds(x+ltg+textw/7*5, y+labelg*4, textw/7*2, texth);
		phoneT.setBounds(x+ltg, y+labelg*5, textw, texth);
		
		 //按钮的添加
		this.add(backb);
		this.add(submitb);
		backb.setBounds(0, y+labelg*6, button_width/5*2, button_height/5*4);
		submitb.setBounds(x+ltg, y+labelg*6+20, button_width, button_height);
		
		// 背景的添加
		JLabel labelsetting=new JLabel(signupsetting_0);
		this.add(labelsetting);
		labelsetting.setBounds(0, 0, frame_width, frame_height);
	}

	
	private void Labels(){
		e_label[0]=nameL;
		e_label[1]=passwordL;
		e_label[2]=confirmpasswordL;
		e_label[3]=sexL;
		e_label[4]=birthL;
		e_label[5]=phoneL;
		for(int i=0;i<e_label.length;i++){
			e_label[i].setFont(new Font("隶书",4,22));
			e_label[i].setForeground(Color.black);
		}
		nameL.setText("    姓名：");
		passwordL.setText("    密码：");
		confirmpasswordL.setText("确认密码：");
		sexL.setText("    性别：");
		birthL.setText("    生日：");
		phoneL.setText("    电话：");
	}
	
	private void TextFields(){
		nameT.setText("");
		passwordT.setText("");
		confirmpasswordT.setText("");
		phoneT.setText("");
		// 规定单选按钮的字体大小和透明度
		sex_male.setFont(new Font("华文行楷",1,20));
		sex_female.setFont(new Font("华文行楷",1,20));
		sex_male.setOpaque(false);
		sex_female.setOpaque(false);
		// 初始化生日的年、月、日
		String years[]=new String[55];
		int year=2016-15;
		for(int i=0;i<55;i++){
			years[i]=String.valueOf(year);
			year--;
		}
		birth_year.setOpaque(false);
		birth_year=new JComboBox<String>(years);
		String mouths[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
		birth_mouth.setOpaque(false);
		birth_mouth=new JComboBox<String>(mouths);
		String days[]=new String[28];
		for(int i=0;i<28;i++){
			days[i]=String.valueOf(i+1);
		}
		birth_mouth.setOpaque(false);
		birth_day=new JComboBox<String>(days);
	}
	
	private void Buttons(){
		backb.setText("返回");
		submitb.setText("立即注册");
	}
	
}

