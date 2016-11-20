package vo;

public class HotelInforvo {
	/*
	 * name:酒店名称
	 * tradearea:酒店商圈
	 * level:酒店星级
	 * address:酒店地址
	 * introduction:酒店介绍
	 * 
	 */
	private String name;
	private String id;
	private String tradearea;
	private String level;
	private String address;
	private String introduction;
	private int LD[];
	private int LS[];
	private int SD[];
	private int SS[];
	private int family[];
	private int promotion[];
	private final int num_data = 3;
	private final int num_promotion_kind = 3;
	private final int inforcheck_count = 3;
	
	public HotelInforvo(){
		name = "";
		id = "";
		tradearea = "";
		level = "";
		address = "";
		introduction = "";
		LD = new int[num_data];
		LS = new int[num_data];
		SD = new int[num_data];
		SS = new int[num_data];
		family = new int[num_data];
		promotion = new int[num_promotion_kind];
	}
	
	//设置vo内酒店信息
	public void setname(String s){
		this.name=s;
	}
	public void steid(String s){
		this.id=s;
	}
	public void settradearea(String s){
		this.tradearea=s;
	}
	public void setlevel(String s){
		this.level=s;
	}
	public void setaddress(String s){
		this.address=s;
	}
	public void setintroduction(String s){
		this.introduction=s;
	}
	
	//获取vo内酒店信息
	public String getname(){
		return this.name;
	}
	public String getid(){
		return this.id;
	}
	public String gettradearea(){
		return this.tradearea;
	}
	public String getlevel(){
		return this.level ;
	}
	public String getaddress(){
		return this.address;
	}
	public String getintroduction(){
		return this.introduction;
	}
	public int getinforcheck_count(){
		return this.inforcheck_count;
	}
	public int[] getLD(){
		return this.LD;
	}
	public int[] getLS(){
		return this.LS;
	}
	public int[] getSD(){
		return this.SD;
	}
	public int[] getSS(){
		return this.SS;
	}
	public int[] getfamily(){
		return this.family;
	}
	public int[] getpromotion(){
		return this.promotion;
	}
	
	public void set_LD(int num[]){
		this.LD = num;
	}
	public void setLS(int num[]){
		this.LS = num;
	}
	public void setnum_SD(int num[]){
		this.SD = num;
	}
	public void setnum_SS(int num[]){
		this.SS = num;
	}
	public void setnum_family(int num[]){
		this.family = num;
	}
	
}
