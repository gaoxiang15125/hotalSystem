package hotelui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class inforui extends JPanel{
	 
	private final int name = 0;
	private final int id = 1;
	private final int tradearea = 2;
	private final int level = 3;
	private final int address = 4;
	private final int introduction = 5;
	
	/*
	 * ����ֵ
	 * ���ڹ涨������ѡ���Ĵ�С
	 * Ҳʹ���ڲ�����status��λ��ȷ��
	 */
	private final int label_width=120;
	private final int label_height=30;
	private final int textfield_width = 100;
	private final int textfield_height = 35;

	private JLabel kindL[] = new JLabel[6];
	private JLabel room_kind_num = new JLabel("��������������");
	
	private JTextField kindT[] = new JTextField[6];
	
	private JTextField nameT = new JTextField();
	private JTextField idT = new JTextField();
	private JTextField tradeareaT = new JTextField();
	private JTextField levelT = new JTextField();
	private JTextField addressT = new JTextField();
	private JTextField introductionT = new JTextField();

	private JComboBox<String> tradeareaC = new JComboBox<String>();
	private JComboBox<String> levelC = new JComboBox<String>();
	
//	private Object content[][] = new Object[5][5];
//	private JTable roomTB;
	
	public inforui(){
		initui();
	}
	
	public void initui(){
//		Labels();
		TextFields();
		
		//���ý�����һЩ����ֵ
		final int frame_width=800;
		final int frame_height=600;
		
		final int label_gap=34;	
		
		//����JPanel������ӱ�ʶ���ı���ѡ��򡢰�ť
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setSize(frame_width,frame_height);
		
		// Ϊ�����޸ģ�x��y����jpanel�Ĵ�С
		int x=frame_width/5-30;
		int y=70;
		
		//��ʶ����Ӻ��Ű�
		int labelw=label_width;
		int labelg=label_gap;
		
/*		
		for(int i=0;i<kindL.length;i++)
			jpanel.add(kindL[i]);
		kindL[name].setLocation(x,y);
		kindL[id].setLocation(x+labelw+textfield_width+15,y);
		kindL[tradearea].setLocation(x,y+labelg);
		kindL[level].setLocation(x+labelw+textfield_width+15,y+labelg);
		kindL[address].setLocation(x,y+labelg*2);
		kindL[introduction].setLocation(x,y+labelg*3);
*/
		
		for(int i=0;i<kindT.length;i++)
			this.add(kindT[i]);
		kindT[name].setLocation(x,y);
		kindT[id].setLocation(x+textfield_width*5/2,y);
		kindT[tradearea].setLocation(x,y+labelg);
		kindT[level].setLocation(x+textfield_width*5/2,y+labelg);
		kindT[address].setLocation(x,y+labelg*2);
		kindT[introduction].setLocation(x,y+labelg*3);
		
		this.add(nameT);
		this.add(idT);
		this.add(tradeareaT);
		this.add(tradeareaC);
		this.add(levelT);
		this.add(levelC);
		this.add(addressT);
		this.add(introductionT);
		tradeareaC.setVisible(false);
		levelC.setVisible(false);
		nameT.setLocation(x+textfield_width,y);
		idT.setLocation(x+textfield_width*7/2,y);
		tradeareaT.setLocation(x+textfield_width,y+labelg);
		levelT.setLocation(x+textfield_width*7/2,y+labelg);
		tradeareaC.setLocation(x+textfield_width,y+labelg);
		levelC.setLocation(x+textfield_width*7/2,y+labelg);
		addressT.setLocation(x+textfield_width,y+labelg*2);
		introductionT.setLocation(x+textfield_width,y+labelg*3);
		
//		this.add(jpanel);
//		this.setSize(frame_width, frame_height);
//		roomTB.setBounds(new Rectangle(x, y+labelg*4, 400, 200));
//		this.add(roomTB);	
//	    JScrollPane scrollPane=new JScrollPane(roomTB);
//	    this.add(scrollPane);
//	    scrollPane.setLocation(x,y+labelg*5);
//		this.add(roomTB);
//		roomTB.setLocation(x, y+labelg*5);
	}
	
	private void Labels(){
		
		for(int i=0;i<kindL.length;i++){
			kindL[i] = new JLabel("",JLabel.RIGHT);
			kindL[i].setSize(label_width, label_height);
			kindL[i].setFont(new Font("������κ",1,20));
			kindL[i].setForeground(Color.black);
		}
		
		kindL[name].setText("���ƣ�");
		kindL[id].setText("ID��");
		kindL[tradearea].setText("��Ȧ��");
		kindL[level].setText("�Ǽ���");	
		kindL[address].setText("��ϸ��ַ��");
		kindL[introduction].setText("�Ƶ�������");	

/*
 		String kindS[] = {"����","�۸�","����","��ס����","��ס�ͷ��䶯����"};
		Roomvo roomvo = new Roomvo();
		content[0] = roomvo.getLD();
		content[1] = roomvo.getLS();
		content[2] = roomvo.getSD();
		content[3] = roomvo.getSS();
		content[4] = roomvo.getfamily();
		roomTB = new JTable(content,kindS);
		roomTB.setSize(400, 200);
*/
	}
	
	private void TextFields(){
		/*
		 * ��ȡ�Ƶ���Ϣ
		 */
		nameT.setFont(new Font("���Ŀ���",1,15));
		idT.setFont(new Font("���Ŀ���",1,15));
		tradeareaT.setFont(new Font("���Ŀ���",1,15));
		levelT.setFont(new Font("���Ŀ���",1,15));
		addressT.setFont(new Font("���Ŀ���",1,15));
		introductionT.setFont(new Font("���Ŀ���",1,15));		
		nameT.setText("  sb");
		idT.setText("  1001100");
		tradeareaT.setText("  �Ͼ�");
		levelT.setText("  4");
		addressT.setText("  �Ͼ������ִ��163��");
		introductionT.setText("  ���Ƶ�����ȫ���ṩ�ܶ�");
		
		nameT.setSize(textfield_width*3/2, textfield_height);
		idT.setSize(textfield_width*3/2, textfield_height);
		tradeareaT.setSize(textfield_width*3/2, textfield_height);
		levelT.setSize(textfield_width*3/2, textfield_height);
		addressT.setSize(textfield_width*4, textfield_height);
		introductionT.setSize(textfield_width*4, textfield_height*2);
		
		//��ʼ����Ȧ���Ǽ�ѡ���
		String tradeareaS[]={"  �Ͼ�","  �Ϻ�","  ����","  ���Ƹ�"};
		tradeareaC=new JComboBox<String>(tradeareaS);
		tradeareaC.setFont(new Font("���Ŀ���",1,15));
		tradeareaC.setSize(textfield_width, textfield_height);
				
		String levelS[]={"    1","    2","    3","    4","    5"};
		levelC=new JComboBox<String>(levelS);	
		levelC.setFont(new Font("���Ŀ���",1,15));	
		levelC.setSize(textfield_width, textfield_height);
		
		nameT.setEditable(false);
		idT.setEditable(false);
		tradeareaT.setEditable(false);
		levelT.setEditable(false);
		addressT.setEditable(false);
		introductionT.setEditable(false);
		
		for(int i=0;i<kindT.length;i++){
			kindT[i] = new JTextField();
			kindT[i].setSize(textfield_width, textfield_height);
			kindT[i].setFont(new Font("������κ",1,20));
			kindT[i].setForeground(Color.black);
			kindT[i].setEditable(false);
		}
		kindT[introduction].setSize(textfield_width, textfield_height*2);
		kindT[name].setText("���ƣ�");
		kindT[id].setText("ID��");
		kindT[tradearea].setText("��Ȧ��");
		kindT[level].setText("�Ǽ���");	
		kindT[address].setText("��ϸ��ַ��");
		kindT[introduction].setText("�Ƶ�������");	
	}
}







