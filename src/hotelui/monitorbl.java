package hotelui;

import vo.HotelInforvo;

public class monitorbl {
	/*
	 * ���ڼ��Ƶ�ע��
	 * checkresult[0]:�жϾƵ������Ƿ��з��ţ������ƽ�����Ӣ����ĸ
	 * checkresult[1]:�жϾƵ��ַ�Ƿ�Ϊ��
	 * checkresult[2]:�жϾƵ�����Ƿ�Ϊ��
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
