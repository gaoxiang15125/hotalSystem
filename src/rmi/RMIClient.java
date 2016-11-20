package rmi;

import java.rmi.Remote;

import logicserve.hotelserve;

public class RMIClient {
	
	private Remote remote;
	private static RMIClient rmic = new RMIClient();
	public static RMIClient getInstance(){
		return rmic;
	}
	
	public void setRemote(Remote remote){
		this.remote = remote;
	}
	
	public hotelserve gethotelserve(){
		return (hotelserve)remote;
	}
}
