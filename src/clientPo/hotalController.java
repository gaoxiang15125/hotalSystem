package clientPo;

import java.util.ArrayList;

class hotalController {
	/*
	 * @author ����
	 * @see   �洢һ���Ƶ����ϸ��Ϣ
	 * 
	 */
	
	//�Ƶ�����
	private String name;
	//�Ƶ��ַ
	private String address;
	//�Ƶ�绰����
	private String Phone;
	//�Ƶ��Ǽ�
	private String star;
	//�Ƶ���ʷ������Ϣ
	private ArrayList<String>  evaluate;
	//�Ƶ깩�������˺�
	private String hotalID;
	//�Ƶ������Ϣ
	private String introduce;
	//�Ƶ�Ӫ������
	private String stategy;
	//�����ʼ��Ϣ����������
	private ArrayList<String > moreAinfo;
	
	
	public hotalController(ArrayList<String> moreAinfo) {
		// TODO Auto-generated constructor stub
		this.moreAinfo = (ArrayList<String>) moreAinfo.clone();
		setInfoRight();
	}
/*
 * @see ����������Ϣ
 * 			ʹ����ڷ���
 */
	private void setInfoRight() {
		// TODO Auto-generated method stub
		name = moreAinfo.get(0);
		address = moreAinfo.get(1);
		Phone = moreAinfo.get(2);
		star = moreAinfo.get(3);
		hotalID = moreAinfo.get(4);
		introduce = moreAinfo.get(5);
		stategy = moreAinfo.get(6);
		moreAinfo.remove(0);
		moreAinfo.remove(1);
		moreAinfo.remove(2);
		moreAinfo.remove(3);
		moreAinfo.remove(4);
		moreAinfo.remove(5);
		moreAinfo.remove(6);
		evaluate = (ArrayList<String>) moreAinfo.clone();
	}

	public String getName() {
		return name;
	}

	
	public String getAddress() {
		return address;
	}
	
	
	public String getPhone() {
		return Phone;
	}
	
	
	public String getStar() {
		return star;
	}
	
	
	public ArrayList<String> getEvaluate() {
		return evaluate;
	}
	
	public String getHotalID() {
		return hotalID;
	}
	
	
	
	public String getIntroduce() {
		return introduce;
	}
	
	
	
}