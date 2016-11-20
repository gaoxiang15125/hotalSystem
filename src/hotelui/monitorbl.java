package hotelui;

import vo.HotelInforvo;

public class monitorbl {
	/*
	 * 用于检测酒店注册
	 * checkresult[0]:判断酒店名称是否还有符号，且名称仅限于英文字母
	 * checkresult[1]:判断酒店地址是否为空
	 * checkresult[2]:判断酒店介绍是否为空
	 */
	protected boolean[] signupcheck(HotelInforvo infor){
		String temp="";
		boolean checkresult[]=new boolean[infor.getinforcheck_count()];
		temp=infor.getname();
		for (int i=0;i<temp.length();i++){
			if (temp.charAt(i)>='a'&&temp.charAt(i)<='z')
				checkresult[0]=true;
			else if (temp.charAt(i)>='A'&&temp.charAt(i)<='Z')
				checkresult[0]=true;
			else {
				checkresult[0]=false;
				break;
			}
		}
		temp=infor.getaddress().replace(" ","");
		if(temp.length()==0)
			checkresult[1]=false;
		else
			checkresult[1]=true;
		temp=infor.getintroduction().replace(" ","");
		if(temp.length()==0)
			checkresult[2]=false;
		else
			checkresult[2]=true;
		return checkresult;
	}
	
	
}
