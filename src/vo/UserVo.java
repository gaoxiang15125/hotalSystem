package vo;

import po.UserPo;

public class UserVo {
	
	private int id;
	
	private String username;
	
	private int credit;
	
	private int viplevel;
	
	public UserVo(){
		super();
	}
	
	public UserVo(UserPo userPo){
		super();
		this.id = userPo.getId();
		this.username = userPo.getUsername();
		this.credit = userPo.getCredit();
		this.viplevel = userPo.getViplevel();
	}

	public int getViplevel() {
		return viplevel;
	}

	public void setViplevel(int viplevel) {
		this.viplevel = viplevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	

}

