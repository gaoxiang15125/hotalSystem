package po;

public class PromotionPo {
	//("yyyy/MM/dd HH:mm:ss")
	private String starttime;
	
	private String endtime;
	
	private String position;
	
	private int viplevel;
	
	private double discount;
	
	public PromotionPo(){
		super();
	}

	public PromotionPo(String starttime, String endtime, String position, int viplevel, double discount) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
		this.position = position;
		this.viplevel = viplevel;
		this.discount = discount;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getViplevel() {
		return viplevel;
	}

	public void setViplevel(int viplevel) {
		this.viplevel = viplevel;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
