package clientVo;

import clientPo.clientPo;

public class clientInfo {
	/**
	 * @author 高翔
	 * @version 0.0
	 * @see 本类存储了用户的所有个人信息
	 */
	private String name;//存储了客户的姓名
	
	private String sex;//存储了用户的性别
	
	private int brithday;//存储了用户的生日
	
	private String phone;//存储了用户的电话号码
	
	private int vaule;//存储了用户的诚信值
	
	private String userId;//用户个人信息的凭证
	
	/**
	 * 构造方法
	 * @param po 
	 * 			从数据库获取的userpo对象
	 */
	public clientInfo(clientPo po){
		this.name = po.getName();
		
		this.sex = po.getSex();
		
		this.brithday = po.getBrithday();
		
		this.phone = po.get;
		
		this.vaule = po.vaule;
		
		this.userId = po.userId;
		
	}
	public String getName()
}
