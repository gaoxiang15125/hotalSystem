package clientVo;

import clientPo.clientPo;

public class clientInfo {
	/**
	 * @author ����
	 * @version 0.0
	 * @see ����洢���û������и�����Ϣ
	 */
	private String name;//�洢�˿ͻ�������
	
	private String sex;//�洢���û����Ա�
	
	private int brithday;//�洢���û�������
	
	private String phone;//�洢���û��ĵ绰����
	
	private int vaule;//�洢���û��ĳ���ֵ
	
	private String userId;//�û�������Ϣ��ƾ֤
	
	/**
	 * ���췽��
	 * @param po 
	 * 			�����ݿ��ȡ��userpo����
	 */
	public clientInfo(clientPo po){
		this.name = po.getName();
		
		this.sex = po.getSex();
		
		this.brithday = po.getBrithday();
		
		this.phone = po.get;
		
		this.vaule = po.vaule;
		
		this.userId = po.userId;
		
	}
	public String getName()
}
