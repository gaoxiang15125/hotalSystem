package vo;

public class Busyroomvo {
	private int busyroom_LD;
	private int busyroom_LS;
	private int busyroom_SD;
	private int busyroom_SS;
	private int busyroom_family;
	
	public Busyroomvo(){
		busyroom_LD = 0;
		busyroom_LS = 0;
		busyroom_SD = 0;
		busyroom_SS = 0;
		busyroom_family = 0;
	}
	
	public int getnum_LD(){
		return this.busyroom_LD;
	}
	public int getnum_LS(){
		return this.busyroom_LS;
	}
	public int getnum_SD(){
		return this.busyroom_SD;
	}
	public int getnum_SS(){
		return this.busyroom_SS;
	}
	public int getnum_family(){
		return this.busyroom_family;
	}
	
	public void setnum_LD(int num){
		this.busyroom_LD = num;
	}
	public void setnum_LS(int num){
		this.busyroom_LS = num;
	}
	public void setnum_SD(int num){
		this.busyroom_SD = num;
	}
	public void setnum_SS(int num){
		this.busyroom_SS = num;
	}
	public void setnum_family(int num){
		this.busyroom_family = num;
	}
}
