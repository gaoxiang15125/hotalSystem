package clientPo;

import java.util.ArrayList;

class orderController {
		/*
		 * @author ����
		 * @see   �洢һ���Ƶ����ϸ��Ϣ
		 * 
		 */
		
		//�Ƶ�����
		private String name;
		//�Ƶ��ַ
		private String address;
		//�Ƶ�绰����
		private String Phone;
		//��סʱ��
		private String beginTime;
		//�˷�ʱ��
		private String overTime;
		//��������
		private String roomMent;
		//��������
		private String roomNum;
		//�ܼ۸�
		private String vaule;
		//������
		private String stategy;
		//�����ʼ��Ϣ����������
		private ArrayList<String > moreAinfo;
		
		
		public orderController(ArrayList<String> moreAinfo) {
			// TODO Auto-generated constructor stub
			this.moreAinfo = (ArrayList<String>) moreAinfo.clone();
			setInfoRight();
		}
	/*
	 * @see ����������Ϣ
	 * 			ʹ����ڷ���
	 */
		private void setInfoRight() {
			// TODO Auto-generated method stub
			name = moreAinfo.get(0);
			address = moreAinfo.get(1);
			Phone = moreAinfo.get(2);
			beginTime = moreAinfo.get(3);
			overTime = moreAinfo.get(4);
			roomMent = moreAinfo.get(5);
			roomNum = moreAinfo.get(6);
			vaule = moreAinfo.get(7);
			stategy = moreAinfo.get(8);
		}

		public String getName() {
			return name;
		}

		
		public String getAddress() {
			return address;
		}
		
		
		public String getPhone() {
			return Phone;
		}
		public String getBeginTime() {
			return beginTime;
		}
		public String getOverTime() {
			return overTime;
		}
		public String getRoomMent() {
			return roomMent;
		}
		public String getRoomNum() {
			return roomNum;
		}
		public String getVaule() {
			return vaule;
		}
		public String getStategy() {
			return stategy;
		}
		public ArrayList<String> getMoreAinfo() {
			return moreAinfo;
		}
		
}
