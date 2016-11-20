package logicserve;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.HotelInforvo;
import vo.HotelListvo;
import vo.Busyroomvo;

public interface hotelserve extends Remote{
	
	public void sayhello() throws RemoteException;
	
	public boolean singup(String password, HotelInforvo inforvo) throws RemoteException;
	
	public String login(String id, String password) throws RemoteException;
	
	public void logout(String accredit) throws RemoteException;
	
	public HotelInforvo Hgetinfor(String accredit) throws RemoteException;
	
	public HotelInforvo Ugetinfor(String id) throws RemoteException;
	
	public boolean editinfor(String accredit, HotelInforvo inforvo) throws RemoteException;
	
	public Busyroomvo getbusyroominfor(String accredit) throws RemoteException;
	
	public boolean editbusyroominfor(String accredit, Busyroomvo busyroomvo) throws RemoteException;
	
	public ArrayList<HotelListvo> searchhotel(String tradarea) throws RemoteException;
	
}
