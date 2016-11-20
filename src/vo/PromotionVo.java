package vo;

import po.PromotionPo;

public class PromotionVo {
	
	private String starttime;
	
	private String endtime;
	
	private String position;
	
	private int viplevel;
	
	private double discount;
	
	public PromotionVo(){
		super();
	}
	
	public PromotionVo(PromotionPo promotionPo){
		super();
		this.starttime = promotionPo.getStarttime();
		this.endtime = promotionPo.getEndtime();
		this.position = promotionPo.getPosition();
		this.viplevel = promotionPo.getViplevel();
		this.discount = promotionPo.getDiscount();
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
