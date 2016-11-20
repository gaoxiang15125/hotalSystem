package clientPo;

import java.util.ArrayList;

public class clientPo {
	/**
	 * @author 高翔
	 * @see 对用户的数据实体化的存储类
	 * 			定义了set/get方法
	 */
	//用户的姓名
	private String name;
	//用户的性别
	private String sex;
	//用户的账号
	private String clientId;
	//用户的信用值
	private String vaule;
 
	//用户生日
	private String brithday;
	//用户电话号码
	private String phone;
	
	//用户信息保存的链表对象
	private ArrayList<String> info;
	
	public clientPo(ArrayList<String> info){
		this.info = (ArrayList<String>) info.clone();
		getRight();
	}
	/*
	 * @param  整合info 里面的信息
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
	 * @param 更新info链表，用于同步到数据库
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
