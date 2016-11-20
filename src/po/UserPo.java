package po;

public class UserPo {
	
	private int id;
	
	private String username;
	
	private int credit;
	
	private int viplevel;
	
	public UserPo(){
		super();
	}
	public UserPo(int id, String username, String phone, int credit, int viplevel) {
		super();
		this.id = id;
		this.username = username;
		this.credit = credit;
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
	
	public int getViplevel(){
		return viplevel;
	}
	
	public void setViplevel(int viplevel) {
		this.viplevel = viplevel;
	}
}
