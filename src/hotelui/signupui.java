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
	 * ����ֵ
	 * ���ڹ涨������ѡ���Ĵ�С
	 * Ҳʹ���ڲ�����status��λ��ȷ��
	 */
	private final int textfield_width=280;
	private final int textfield_height=35;
	
	/*
	 * labels
	 * kind�Ǳ�ʶ��Ϣ���
	 * status�Ǽ�����������Ϣ
	 */
	private JLabel kind[]=new JLabel[7];
	private JLabel status[]=new JLabel[5];
	private JLabel welcome=new JLabel("��ӭע��Ƶ�Ԥ��ϵͳ");
	
	//������ѡ���
	private JTextField nameT=new JTextField("");
	private JTextField addressT=new JTextField("");
	private JTextArea introductionT=new JTextArea("");
	private JScrollPane introductionSP=new JScrollPane(introductionT);
	
	private JPasswordField passwordT=new JPasswordField(15);
	private JPasswordField confirmpasswordT=new JPasswordField(15);
	
	private JComboBox<String> tradeareaC = new JComboBox<String>();
	private JComboBox<String> levelC = new JComboBox<String>();
	
	//buttons
	private JButton backb=new JButton("����");
	private JButton nextb=new JButton("��д�ͷ���Ϣ");
	private JButton submitb=new JButton("�ύע��");
	
	public signupui(){
		initui();
	}
	
	private void initui(){
		Labels();
		TextFields();
		Buttons();
		
		//���ý�����һЩ����ֵ
		final int frame_width=800;
		final int frame_height=600;
		final int label_gap=50;	
		final int label_textfield_gap=115;
		
		//����JPanel������ӱ�ʶ���ı���ѡ��򡢰�ť
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setSize(frame_width,frame_height);
		
		// Ϊ�����޸ģ�x��y����jpanel�Ĵ�С
		int x=frame_width/5-15;
		int y=70;
		
		//��ʶ����Ӻ��Ű�
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
		
		//�ı������Ӻ��Ű�
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
		
		//��ʶ�����Ƿ���ȷ����Ӻ��Ű�
		//�������Ȧ���Ǽ����жϱ�ʶ
		for(int i=0;i<status.length;i++)
			this.add(status[i]);
		status[name].setLocation(x+ltg+textw, y+labelg*0);
		status[password].setLocation(x+ltg+textw, y+labelg*1);
		status[confirmpassword].setLocation(x+ltg+textw, y+labelg*2);
		status[address].setLocation(x+ltg+textw, y+labelg*5);
		status[introduction].setLocation(x+ltg+textw, y+labelg*6);
		
		//��ť�����
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
			status[i].setFont(new Font("���Ŀ���",1,15));
			status[i].setForeground(Color.red);
		}
		kind[name].setText("�Ƶ����ƣ�");
		kind[password].setText("���룺");
		kind[confirmpassword].setText("ȷ�����룺");
		kind[tradearea].setText("��Ȧ��");
		kind[level].setText("�Ǽ���");
		kind[address].setText("��ϸ��ַ��");
		kind[introduction].setText("�Ƶ�������");
		
		welcome.setSize(label_width*2, label_height);
		welcome.setFont(new Font("�����п�",4,22));
		welcome.setForeground(new Color(0, 191, 255));
	}
	
	private void TextFields(){
		//��ʼ�����ơ����롢ȷ�����롢��ַ�����������
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
		
		//��ʼ����Ȧ���Ǽ�ѡ���
		String tradearea[]={"  �Ͼ�","  �Ϻ�","  ����","  ���Ƹ�"};
		tradeareaC=new JComboBox<String>(tradearea);
		tradeareaC.setFont(new Font("���Ŀ���",1,15));
		tradeareaC.setSize(textfield_width, textfield_height);
		
		String level[]={"    1","    2","    3","    4","    5"};
		levelC=new JComboBox<String>(level);	
		levelC.setFont(new Font("���Ŀ���",1,15));	
		levelC.setSize(textfield_width, textfield_height);
		
		//��ʼ����������
		introductionSP.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		introductionSP.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		introductionT.setFont(new Font("����",1,15));
		introductionT.setWrapStyleWord(true);  
		introductionT.setLineWrap(true);
		introductionSP.setSize(textfield_width, (int)(textfield_height*2.5));
		introductionT.setSize(textfield_width, (int)(textfield_height*2.5));
	}
	
	private void Buttons(){
		final int button_width=140;
		final int button_height=50;
		
		backb.setFont(new Font("������κ",1,20));
		backb.setForeground(Color.white);
		backb.setBackground(new Color(0, 191, 255));
		backb.setBorderPainted(false);
		backb.setFocusPainted(false);
		backb.setSize( button_width, button_height);
		backb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 
		
		nextb.setFont(new Font("������κ",1,20));	
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
					 status[password].setText("����������");
				 else
					 status[password].setText("");
				 if(!temp.equals(tempc))
					 status[confirmpassword].setText("�������벻ͬ������������");
				 else
					 status[confirmpassword].setText("");
				 checkresult=new monitorbl().signupcheck(infor);
				 if(nameT.getText().length()>20)
					 status[name].setText("���𳬹�20����ĸ");
				 else{
					 if(!checkresult[0])
						 status[name].setText("����Ӣ����ĸ����");
					 else
						 status[name].setText("");
				 }
				 for(int i=1;i<checkresult.length;i++){
					 if(!checkresult[i])
						 status[i].setText("����ֻ����ո�");
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


