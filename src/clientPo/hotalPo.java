package clientPo;

import java.util.ArrayList;

public class hotalPo {
	//�洢��ѡ��Ƶ������Ϣ���б�
	private ArrayList<String > hotalList ;
	//����Ը������⴦�����洢
	private ArrayList<String> nameList;
	
 	private ArrayList<String> idList;
 	
 	private ArrayList<String> starList;
 	
	private ArrayList<String> stategy;
 	
	//��ϸ�Ƶ���Ϣʵ����
 	private hotalController moreInfo;
 	
 	
 	//��ȡһ���Ƶ���ϸ��Ϣ�ķ���
 	public hotalController getMoreInfo() {
		return moreInfo;
	}
	
 	//������Ϣ������ϸ��Ϣ�洢����
 	public void setMoreInfo(ArrayList<String> moreAinfo) {
		moreInfo = new hotalController(moreAinfo);
	}
 	//��ȡ��������
	public ArrayList<String> getNameList() {
		return nameList;
	}
	//��ȡid����
	public ArrayList<String> getIdList() {
		return idList;
	}
	//��ȡ�Ǽ���Ϣ����
	public ArrayList<String> getStarList() {
		return starList;
	}
	//��ȡӪ����������
	public ArrayList<String> getStategy() {
		return stategy;
	}
	//��ȡ�Ƶ���Ϣ
	@SuppressWarnings("unchecked")
	public void setHotalList(ArrayList<String> hotalList) {
		this.hotalList = (ArrayList<String>) hotalList.clone();
		setInfoRight();
	}

 	//��ʼ��
 	@SuppressWarnings("unchecked")
	public hotalPo(ArrayList<String> hotalList){
 		this.hotalList = (ArrayList<String>) hotalList.clone();
 		setInfoRight();
 	}
 	/*
 	 * @param �����������ڴ���Ƶ�������Ϣ
 	 * 				�Ա�����ʾ��
 	 */
	private void setInfoRight() {
			for(int i=0; i<hotalList.size();i++){
				String [] Hotalbuffer = hotalList.get(i).split(" ");
				nameList.add(Hotalbuffer[0]);
				idList.add(Hotalbuffer[1]);
				starList.add(Hotalbuffer[2]);
				stategy.add(Hotalbuffer[3]);
			}
	}
 	
}
