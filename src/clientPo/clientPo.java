package clientPo;

import java.util.ArrayList;

public class clientPo {
	/**
	 * @author ����
	 * @see ���û�������ʵ�廯�Ĵ洢��
	 * 			������set/get����
	 */
	//�û�������
	private String name;
	//�û����Ա�
	private String sex;
	//�û����˺�
	private String clientId;
	//�û�������ֵ
	private String vaule;
 
	//�û�����
	private String brithday;
	//�û��绰����
	private String phone;
	
	//�û���Ϣ������������
	private ArrayList<String> info;
	
	public clientPo(ArrayList<String> info){
		this.info = (ArrayList<String>) info.clone();
		getRight();
	}
	/*
	 * @param  ����info �������Ϣ
	 */
	private void getRight(){
		name = info.get(0);
		sex = info.get(1);
		clientId = info.get(2);
		vaule = info.get(3);
		brithday = info.get(4);
		phone = info.get(5);
	}
	/*
	 * @param ����info��������ͬ�������ݿ�
	 */
	 private void creatNewInfo(){
		 info.clear();
		 info.add(name);
		 info.add(sex);
		 info.add(clientId);
		 info.add(vaule);
		 info.add(brithday);
		 info.add(phone);
	 }
	public String getBrithday() {
		return brithday;
	}
	
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	/**
	 * 
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getVaule() {
		return vaule;
	}
	public void setVaule(String vaule) {
		this.vaule = vaule;
	}

	public ArrayList<String> getInfo() {
		return info;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
